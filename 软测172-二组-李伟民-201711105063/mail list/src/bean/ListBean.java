package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import bpo.ListBpo;
import bpo.UserBpo;
import util.DBConnection;
import util.Date_String;

public class ListBean {
	private String alname;
	private String altel;
	private String address;
	private String pcode;
	
	public ListBean() {
		super();
	}
	
	public ListBean(String alname, String altel, String address, String pcode) {
		super();
		this.alname = alname;
		this.altel = altel;
		this.address = address;
		this.pcode = pcode;
	}

	public String getAlname() {
		return alname;
	}
	public void setAlname(String alname) {
		this.alname = alname;
	}
	public String getAltel() {
		return altel;
	}
	public void setAltel(String altel) {
		this.altel = altel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	/*增加用户列表*/
	public void addList()throws SQLException {
		Connection conn=null;
		
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=DBConnection.getConnection();
			String sql="insert into addresslist(alname,altel,address,pcode) values(?,?,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,this.alname);
			pstmt.setString(2, this.altel);
			pstmt.setString(3, this.address);
			pstmt.setString(4, this.pcode);
			pstmt.execute();
			
		}finally {
			DBConnection.close(rs, pstmt, conn);
		}
		
	}
	/*更新用户*/
	public void updateList()throws Exception{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBConnection.getConnection();
			String sql = "update addresslist set alname=?,altel=?,address=?,pcode=? "
					   + "where alname='"+this.alname+"'";
			ps = conn.prepareStatement(sql);
			ps.setString(1, this.alname);
			ps.setString(2, this.altel);
			ps.setString(3, this.address);
			ps.setString(4, this.pcode);
			
			ps.executeUpdate();
		} finally {
			DBConnection.close(rs, ps, conn);
		}
	}
	public void delListById()throws Exception{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBConnection.getConnection();
			String sql = "delete from addresslist where alname='"+alname+"'";
			ps = conn.prepareStatement(sql);
			ps.executeUpdate();
		} finally {
			DBConnection.close(rs, ps, conn);
		}
	}
	public void delAllListById()throws Exception{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBConnection.getConnection();
			String sql = "delete from addresslist where 1=1";
			ps = conn.prepareStatement(sql);
			ps.executeUpdate();
		} finally {
			DBConnection.close(rs, ps, conn);
		}
	}
	/* 校验用户*/
	public Map<String, String> checkList()throws Exception{
		Map<String, String> errors = new HashMap<String, String>();
//		if(alname==null||alname.equals("")) {
//			errors.put("alname", "用户名不能为空");
//		}else{
//			ListBpo listbpo=new ListBpo();
//			ListBean list=listbpo.getListById(alname);
//			if(list!=null) errors.put("alname", "用户已存在");
//		}
		if(alname==null||alname.equals("")) {
			errors.put("alname","用户名不能为空");
		}else {
			ListBpo listBpro=new ListBpo();
			ListBean list=listBpro.getListById(alname);
			if(list!=null) errors.put("alname","用户已存在");
		}
		if(altel==null||altel.equals("")) errors.put("altel", "电话号码不能为空");
		if(address==null||address.equals("")) errors.put("address", "地址不能存在");
		
		return errors;
	}
}

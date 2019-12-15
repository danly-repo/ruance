package bpo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.ListBean;
import util.DBConnection;


public class ListBpo {
	/**单用户查询user*/
	public  ListBean getListById(String alname)throws SQLException{
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		ListBean list=null;
		try {
			conn = DBConnection.getConnection();
			String sql = "select * from addresslist where alname='"+alname+"'";
			st = conn.createStatement();
			rs=st.executeQuery(sql);
			if(rs.next()==true){
				list=new ListBean();
				list.setAlname(alname);
				list.setAltel(rs.getString("altel"));
				list.setAddress(rs.getString("address"));
				list.setPcode(rs.getString("pcode"));
				
			}
		} finally {
			DBConnection.close(rs, st, conn);
		}
		return list;
	}
	public  ListBean getListById1(String alname)throws SQLException{
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		ListBean list=null;
		try {
			conn = DBConnection.getConnection();
			String sql = "select * from addresslist where alname="+alname;
			st = conn.createStatement();
			rs=st.executeQuery(sql);
			if(rs.next()==true){
				ListBean tmp=new ListBean();
				tmp.setAlname(rs.getString("alname"));
				tmp.setAltel(rs.getString("altel"));
				tmp.setAddress(rs.getString("address"));
				tmp.setPcode(rs.getString("pcode"));
			}
		} finally {
			DBConnection.close(rs, st, conn);
		}
		return list;
	}
	/**查询user*/
	public List<ListBean> getLists()throws SQLException{
		List<ListBean> lists=new ArrayList<ListBean>();
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = DBConnection.getConnection();
			String sql = "select * from addresslist";
			st = conn.createStatement();
			rs=st.executeQuery(sql);
			while(rs.next()==true){
				ListBean tmp=new ListBean();
				tmp.setAlname(rs.getString("alname"));
				tmp.setAltel(rs.getString("altel"));
				tmp.setAddress(rs.getString("address"));
				tmp.setPcode(rs.getString("pcode"));
				lists.add(tmp);
			}
		} finally {
			DBConnection.close(rs, st, conn);
		}
		return lists;
	}
	/**按需查询user*/
	public List<ListBean> getLists(String alname, String altel)throws SQLException{
		if(alname==null) alname="";
		if(altel==null) altel="";
		
		List<ListBean> lists=new ArrayList<ListBean>();
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = DBConnection.getConnection();
			String sql = "select * from addresslist where alname like '%"+alname+"%' and altel like '%"+altel+"%'";
			st = conn.createStatement();
			rs=st.executeQuery(sql);
			while(rs.next()==true){
				ListBean tmp=new ListBean();
				tmp.setAlname(rs.getString("alname"));
				tmp.setAltel(rs.getString("altel"));
				tmp.setAddress(rs.getString("address"));
				tmp.setPcode(rs.getString("pcode"));
				lists.add(tmp);
			}
		} finally {
			DBConnection.close(rs, st, conn);
		}
		return lists;
	}
	public List<ListBean> getGroupBy(String value)throws SQLException{
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<ListBean> lists=null;
		try {
			conn=DBConnection.getConnection();
			String sql="select * from addresslist where address='"+value+"'";
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()==true) {
				ListBean list=new ListBean();
				list.setAlname(rs.getString("alname"));
				list.setAltel(rs.getString("altel"));
				list.setAddress(rs.getString("address"));
				list.setPcode(rs.getString("pcode"));
				lists.add(list);
			}
		}finally {
			DBConnection.close(rs,ps,conn);
		}
		return lists;  
	}
	 
}

package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import util.DBConnection;

public class CourseBean {
	private String courseid;
	private String cname;
	private int ccredit;
	private String cpre;
	public CourseBean() {
		super();
	}
	
	public CourseBean(String courseid) {
		super();
		this.courseid = courseid;
	}

	public CourseBean(String courseid, String cname, int ccredit, String cpre) {
		super();
		this.courseid = courseid;
		this.cname = cname;
		this.ccredit = ccredit;
		this.cpre = cpre;
	}
	public String getCourseid() {
		if(courseid==null) courseid="";
		return courseid;
	}
	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}
	public String getCname() {
		if(cname==null) cname="";
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCcredit() {
		if(ccredit==0) ccredit=0;
		return ccredit;
	}
	public void setCcredit(int ccredit) {
		this.ccredit = ccredit;
	}
	public String getCpre() {
		if(cpre==null) cpre="";
		return cpre;
	}
	public void setCpre(String cpre) {
		this.cpre = cpre;
	}
	
	public void updateCourse()throws Exception{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBConnection.getConnection();
			String sql = "update course set cname=?,ccredit=?,cpre=? "
					   + "where courseid="+this.courseid;
			ps = conn.prepareStatement(sql);
			ps.setString(1, this.getCname());
			ps.setInt(2, this.getCcredit());
			ps.setString(3,this.getCpre());
			
			ps.executeUpdate();
		} finally {
			DBConnection.close(rs, ps, conn);
		}
	}
	/**删除课程信息*/
	public void delCourseById(String courseid)throws Exception{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBConnection.getConnection();
			String sql = "delete from course where courseid="+courseid;
			ps = conn.prepareStatement(sql);
			ps.executeUpdate();
		} finally {
			DBConnection.close(rs, ps, conn);
		}
	}
	/**增加课程信息*/
	public void addCourse()throws Exception{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBConnection.getConnection();
			String sql = "insert into course(courseid,cname,ccredit,cpre)"
					   + " values(?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, this.getCourseid());
			ps.setString(2, this.getCname());
			ps.setInt(3, this.getCcredit());
			ps.setString(4, this.getCpre());
			
			ps.executeUpdate();
		} catch(Exception e){
			throw e;
		}finally {
			DBConnection.close(rs, ps, conn);
		}
	}
	/**校验输入的数据是否符合要求 add update 使用*/
	public Map<String, String> checkCourses()throws Exception{
		Map<String, String> errors = new HashMap<String, String>();
		if(courseid==null||courseid.equals("")) {
			errors.put("courseid", "课程编号不能为空！");
		}else{
			CourseBean course=this.getCourseById(courseid);
			if(course!=null) errors.put("courseid", "课程编号已存在！");
		}
		
		if(cname==null||cname.equals("")) errors.put("cname", "课程名不能为空！");
		if(ccredit==0) errors.put("ccredit", "学分不能为空！");
		if(cpre==null||cpre.equals("")) 
			errors.put("cpre", "先导课程不能为空！");
		
		
		return errors;
	}
	/**查询单个课程信息*/
	public  CourseBean getCourseById(String courseid)throws SQLException{
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		CourseBean course=null;
		try {
			conn = DBConnection.getConnection();
			String sql = "select * from course where courseid="+courseid;
			st = conn.createStatement();
			rs=st.executeQuery(sql);
			if(rs.next()==true){
				course=new CourseBean();
				course.setCourseid(courseid);
				course.setCname(rs.getString("cname"));
				course.setCcredit(rs.getInt("ccredit"));
				course.setCpre(rs.getString("cpre"));
			}
		} finally {
			DBConnection.close(rs, st, conn);
		}
		return course;
	}
	/**查询课程信息*/
	public List<CourseBean> getCourses()throws SQLException{
		List<CourseBean> courses=new ArrayList<CourseBean>();
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = DBConnection.getConnection();
			String sql = "select * from course";
			st = conn.createStatement();
			rs=st.executeQuery(sql);
			while(rs.next()==true){
				CourseBean tmp=new CourseBean();
				tmp.setCourseid(rs.getString("courseid"));
				tmp.setCname(rs.getString("cname"));
				tmp.setCcredit(rs.getInt("ccredit"));
				tmp.setCpre(rs.getString("cpre"));
				
				courses.add(tmp);
			}
		} finally {
			DBConnection.close(rs, st, conn);
		}
		return courses;
	}
	public int getScNumber(String courseid)throws SQLException{
		Connection conn=null;
		Statement st=null;
		ResultSet rs=null;
		int count=0;
		try {
			conn=DBConnection.getConnection();
			String sql="select courseid,count(userid) as counts from sc group by courseid='"+courseid+"'";
			st=conn.createStatement();
			rs=st.executeQuery(sql);
			while(rs.next()) {
				count=rs.getInt("counts");
			}
		}finally {
			DBConnection.close(rs, st, conn);
		}
		return count;
	}
	
	
}

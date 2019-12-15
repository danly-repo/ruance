package bpo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.CourseBean;
import util.DBConnection;

public class CourseBpro {
	public  List<CourseBean> getSelCourse(String courseid,String cpre){
		//if(courseid==null) courseid="";
		//if(cpre==null) cpre="";
		List<CourseBean> courses=new ArrayList<CourseBean>();
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			conn=DBConnection.getConnection();
			//String sql="select * from course where courseid='"+courseid+"' and cpre='"+cpre+"'";
			String sql="select * from course where courseid='"+courseid+"' and cpre='"+cpre+"'";
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				CourseBean course=new CourseBean();
				course.setCourseid(rs.getString("courseid"));
				course.setCname(rs.getString("cname"));
				course.setCcredit(rs.getInt("ccredit"));
				course.setCpre(rs.getString("cpre"));
				courses.add(course);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return courses;
		
	}
	public List<CourseBean> getSelCourse0(String cname)throws SQLException{
		List<CourseBean> courses=new ArrayList<CourseBean>();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=DBConnection.getConnection();
			//String sql="select * from course where cname='%"+cname+"%'and cpre='%"+cpre+"%'";
			//String sql="select * from course where cname='"+cname+"' and cpre='"+cpre+"'";
			String sql = "select * from course where cname like '%"+cname+"%'";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				//String courseid=rs.getString("courseid");
				CourseBean course=new CourseBean();
				course.setCourseid(rs.getString("courseid"));
				course.setCname(rs.getString("cname"));
				course.setCcredit(rs.getInt("ccredit"));
				course.setCpre(rs.getString("cpre"));
				courses.add(course);
				
			}
		}finally {
			DBConnection.close(rs, pstmt, conn);
		}
		return courses;
	}
	public CourseBean getSelCourse1(String courseid,String cname)throws SQLException{
		//List<CourseBean> courses=new ArrayList<CourseBean>();
		CourseBean course=null;
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=DBConnection.getConnection();
			//String sql="select * from course where cname='%"+cname+"%'and cpre='%"+cpre+"%'";
			//String sql="select * from course where cname='"+cname+"' and cpre='"+cpre+"'";
			String sql = "select * from course where courseid like '%"+courseid+"%'and cname like '%"+cname+"%'";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				//String courseid=rs.getString("courseid");
				course=new CourseBean();
				course.setCourseid(rs.getString("courseid"));
				course.setCname(rs.getString("cname"));
				course.setCcredit(rs.getInt("ccredit"));
				course.setCpre(rs.getString("cpre"));
				//courses.add(course);
				
			}
		}finally {
			DBConnection.close(rs, pstmt, conn);
		}
		return course;
	}
}

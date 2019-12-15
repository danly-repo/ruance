package bpo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.StudentBean;
import bean.UserBean;
import util.DBConnection;
import util.Date_String;

public class StudentBpo {
	/**单学生查询user*/
	public  StudentBean getStudentById(String studentId)throws SQLException{
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		StudentBean student=null;
		try {
			conn = DBConnection.getConnection();
			String sql = "select * from stu where studentId="+studentId;
			st = conn.createStatement();
			rs=st.executeQuery(sql);
			if(rs.next()==true){
				student=new StudentBean();
				student.setStudentId(studentId);
				student.setName(rs.getString("name"));;
				student.setPassword(rs.getString("password"));
				student.setSex(rs.getString("sex"));
				student.setAge(rs.getInt("age"));
				String birthday=Date_String.getStringDate1(rs.getDate("birthday"));
				student.setBirthday(birthday);
				student.setClassname(rs.getString("classname"));
			}
		} finally {
			DBConnection.close(rs, st, conn);
		}
		return student;
	}
	/**查询student*/
	public List<StudentBean> getStudents()throws SQLException{
		List<StudentBean> students=new ArrayList<StudentBean>();
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = DBConnection.getConnection();
			String sql = "select * from stu";
			st = conn.createStatement();
			rs=st.executeQuery(sql);
			while(rs.next()==true){
				StudentBean tmp=new StudentBean();
				tmp.setStudentId(rs.getString("studentId"));
				tmp.setName(rs.getString("name"));
				tmp.setPassword(rs.getString("password"));
				tmp.setSex(rs.getString("sex"));
				tmp.setAge(rs.getInt("age"));
				String birthday=Date_String.getStringDate1(rs.getDate("birthday"));
				tmp.setBirthday(birthday);
				tmp.setClassname(rs.getString("classname"));
				students.add(tmp);
				
			}
		} finally {
			DBConnection.close(rs, st, conn);
		}
		return students;
	}
	/**按需查询user*/
	public List<StudentBean> getStudents(String name, String sex)throws SQLException{
		if(name==null)name="";
		if(sex==null) sex="";
		
		List<StudentBean> students=new ArrayList<StudentBean>();
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = DBConnection.getConnection();
			String sql = "select * from stu where name like '%"+name+"%' and ifnull(sex,'') like '%"+sex+"%'";
			st = conn.createStatement();
			rs=st.executeQuery(sql);
			while(rs.next()==true){
				StudentBean tmp=new StudentBean();
				tmp.setStudentId(rs.getString("studentId"));
				tmp.setName(rs.getString("name"));
				tmp.setPassword(rs.getString("password"));
				tmp.setSex(rs.getString("sex"));
				tmp.setAge(rs.getInt("age"));
				String birthday=Date_String.getStringDate1(rs.getDate("birthday"));
				tmp.setBirthday(birthday);
				tmp.setClassname(rs.getString("classname"));
				students.add(tmp);
			}
		} finally {
			DBConnection.close(rs, st, conn);
		}
		return students;
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



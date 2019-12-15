package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import bpo.StudentBpo;
import util.DBConnection;
import util.Date_String;

public class StudentBean {
	private  String studentId;
	private  String name;
	private  String password;
	private String confirmpassword;
	private  String sex;
	private  int age;
	private  String birthday;
	private  String classname;
	public StudentBean() {
		super();
	}
	public StudentBean(String studentId, String name, String password, String sex, int age, String birthday,
			String classname) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.password = password;
		this.sex = sex;
		this.age = age;
		this.birthday = birthday;
		this.classname = classname;
	}
	public String getStudentId() {
		if(studentId==null) studentId="";
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		if(name==null) name="";
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		if(password==null) password="";
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getConfirmpassword() {
		if(confirmpassword==null) confirmpassword="";
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	public String getSex() {
		if(sex==null) sex="";
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		String age0=age+"";
		if(age0==null) age0="";
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBirthday() {
		if(birthday==null) birthday="";
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getClassname() {
		if(classname==null) classname="";
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	/*校验学生*/
	public boolean validStudent()throws SQLException {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		boolean successflag=false;
		try {
			conn=DBConnection.getConnection();
			String sql="select * from stu where studentId=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, this.studentId);
			rs=pstmt.executeQuery();
			if(rs.next()) successflag=true;
			
		}finally{
			DBConnection.close(rs, pstmt, conn);
		}
		return successflag;
	}
	/**更新用户*/
	public void update()throws SQLException{
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=DBConnection.getConnection();
			String sql="update stu set name=?,sex=?,age=?,birthday=?,classname=? where studentId='"+this.studentId+"'";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, this.name);
			pstmt.setString(2, this.sex);
			pstmt.setInt(3, this.age);
			pstmt.setString(4, birthday);
			pstmt.setString(5, classname);
			pstmt.executeUpdate();
		}finally {
			DBConnection.close(rs, pstmt, conn);
		}
	}
	/**删除学生*/
	public void delStudent()throws SQLException{
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=DBConnection.getConnection();
			String sql="delete from stu where studentId=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, this.studentId);
			pstmt.executeUpdate();
			
		}finally {
			DBConnection.close(rs, pstmt, conn);
			
		}
	}
	/**增加学生
	 * @throws Exception */
	public void addStudent()throws Exception{
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=DBConnection.getConnection();
			String sql="insert into stu(studentId,name,password,sex,age,birthday,classname) values(?,?,?,?,?,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,this.studentId);
			pstmt.setString(2, this.name);
			pstmt.setString(3, this.password);
			pstmt.setString(4, sex);
			pstmt.setInt(5, this.age);
			pstmt.setTimestamp(6, Date_String.toTimestamp(this.getBirthday()));
			pstmt.setString(7, this.classname);
			pstmt.executeUpdate();
			
		}finally {
			DBConnection.close(rs, pstmt, conn);
		}
	}
	/**校验错误
	 * @throws SQLException */
	public Map<String,String> checkStudent() throws Exception{
		Map<String,String> errors=new HashMap<String,String>();
		if(studentId==null||studentId.equals("")) {
			errors.put("studentId", "学生Id不能为空");
		}else {
			StudentBpo studentBpro=new StudentBpo();
			StudentBean student=studentBpro.getStudentById(studentId);
			if(student!=null) errors.put("studentId","学生已存在");
		}
		if(name==null||name.equals("")) errors.put("name","学生名不能为空!");
		if(password==null||password.equals("")) errors.put("password", "密码不能为空");
		if(confirmpassword==null||confirmpassword.equals("")) 
			errors.put("confirmpassword", "确认密码不能为空");
		if(password!=null && confirmpassword!=null && !password.equals(confirmpassword)) 
			errors.put("confirmpassword", "两者密码不一致");
		return errors;
		
	}
}

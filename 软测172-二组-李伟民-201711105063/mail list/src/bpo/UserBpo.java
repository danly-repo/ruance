package bpo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.UserBean;
import util.DBConnection;
import util.Date_String;

public class UserBpo {
	/**���û���ѯuser*/
	public  UserBean getUserById(String userid)throws SQLException{
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		UserBean user=null;
		try {
			conn = DBConnection.getConnection();
			String sql = "select * from user where userid="+userid;
			st = conn.createStatement();
			rs=st.executeQuery(sql);
			if(rs.next()==true){
				user=new UserBean();
				user.setUserid(userid);
				user.setUsername(rs.getString("username"));;
				user.setPassword(rs.getString("password"));
				user.setSex(rs.getString("sex"));
				user.setAge(String.valueOf(rs.getInt("age")));
				String birthday=Date_String.getStringDate1(rs.getDate("birthday"));
				user.setBirthday(birthday);
			}
		} finally {
			DBConnection.close(rs, st, conn);
		}
		return user;
	}
	public  UserBean getUserById1(String username)throws SQLException{
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		UserBean user=null;
		try {
			conn = DBConnection.getConnection();
			String sql = "select * from user where username="+username;
			st = conn.createStatement();
			rs=st.executeQuery(sql);
			if(rs.next()==true){
				user=new UserBean();
				user.setUsername(username);
				user.setUserid(rs.getString("userid"));;
				user.setPassword(rs.getString("password"));
				user.setSex(rs.getString("sex"));
				user.setAge(String.valueOf(rs.getInt("age")));
				String birthday=Date_String.getStringDate1(rs.getDate("birthday"));
				user.setBirthday(birthday);
			}
		} finally {
			DBConnection.close(rs, st, conn);
		}
		return user;
	}
	/**��ѯuser*/
	public List<UserBean> getUsers()throws SQLException{
		List<UserBean> users=new ArrayList<UserBean>();
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = DBConnection.getConnection();
			String sql = "select * from user";
			st = conn.createStatement();
			rs=st.executeQuery(sql);
			while(rs.next()==true){
				UserBean tmp=new UserBean();
				tmp.setUserid(String.valueOf(rs.getInt("userid")));
				tmp.setUsername(rs.getString("username"));
				tmp.setPassword(rs.getString("password"));
				tmp.setSex(rs.getString("sex"));
				if(rs.getInt("age")==0){
					tmp.setAge("");
				}else{
					tmp.setAge(String.valueOf(rs.getInt("age")));
				}
				String birthday=Date_String.getStringDate1(rs.getDate("birthday"));
				tmp.setBirthday(birthday);
				users.add(tmp);
			}
		} finally {
			DBConnection.close(rs, st, conn);
		}
		return users;
	}
	/**�����ѯuser*/
	public List<UserBean> getUsers(String username, String sex)throws SQLException{
		if(username==null) username="";
		if(sex==null) sex="";
		
		List<UserBean> users=new ArrayList<UserBean>();
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = DBConnection.getConnection();
			String sql = "select * from user where username like '%"+username+"%' and ifnull(sex,'') like '%"+sex+"%'";
			st = conn.createStatement();
			rs=st.executeQuery(sql);
			while(rs.next()==true){
				UserBean tmp=new UserBean();
				tmp.setUserid(String.valueOf(rs.getInt("userid")));
				tmp.setUsername(rs.getString("username"));
				tmp.setPassword(rs.getString("password"));
				tmp.setSex(rs.getString("sex"));
				if(rs.getInt("age")==0){
					tmp.setAge("");
				}else{
					tmp.setAge(String.valueOf(rs.getInt("age")));
				}
				String birthday=Date_String.getStringDate1(rs.getDate("birthday"));
				tmp.setBirthday(birthday);
				users.add(tmp);
			}
		} finally {
			DBConnection.close(rs, st, conn);
		}
		return users;
	}
}

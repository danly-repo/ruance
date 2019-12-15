package servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.UserBean;

/**
 * Servlet implementation class AddUserServlet
 */
@WebServlet("/AddUserServlet")
public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		UserBean newuser=new UserBean();
		newuser.setUserid(request.getParameter("userid"));
		newuser.setUsername(request.getParameter("username"));
		newuser.setSex(request.getParameter("sex"));
		String age=request.getParameter("age");
		if(age.equals(""))age=null;
		newuser.setAge(age);
		newuser.setBirthday(request.getParameter("birthday"));
		newuser.setPassword(request.getParameter("password"));
		newuser.setConfirmpassword(request.getParameter("confirmpassword"));
		newuser.setUserType(request.getParameter("userType"));	
		Map<String,String> errors=null;
		try {
			errors=newuser.checkUser();
			if(errors.size()==0) newuser.addUser();
			
		}catch(Exception e) {
			errors.put("othererr", "����ʧ��:"+e.getMessage());
		}
		if(errors.size()!=0) {
			request.setAttribute("errors", errors);
			request.getRequestDispatcher("/user/AddUser.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("/user/MagUser.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

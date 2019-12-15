package servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.ListBean;
import bean.UserBean;

/**
 * Servlet implementation class UpdateListServlet
 */
@WebServlet("/UpdateListServlet")
public class UpdateListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String alname=request.getParameter("alname");
		ListBean list=this.getListFromRequest(request);
		Map<String,String> errors=this.valid(list);
		try {
			list.updateList();
			
		}catch(Exception e) {
			errors.put("othererr", "数据库更新出错"+e.getMessage());
		}
		if(errors.size()!=0) {
			request.setAttribute("errors", errors);
			request.getRequestDispatcher("/List/UpdateList.jsp").forward(request, response);
		}else {
			response.sendRedirect(request.getContextPath()+"/List/showList.jsp");
		}
	}
	public Map<String,String> valid(ListBean list){
		Map<String,String> errors=new HashMap<String,String>();
		if(list.getAlname().equals("")) errors.put("alname", "用户不能为空");
		return errors;
	}	
	public ListBean getListFromRequest(HttpServletRequest request) {
		String alname=request.getParameter("alname");
		String altel=request.getParameter("altel");
		String address=request.getParameter("address");
		String pcode=request.getParameter("pcode");
		
		
		ListBean list=new ListBean();
		list.setAlname(alname);
		list.setAltel(altel);
		list.setAddress(address);
		list.setPcode(pcode);
		
		return list;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

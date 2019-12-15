package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.ListBean;
import bpo.ListBpo;
import bpo.UserBpo;

/**
 * Servlet implementation class GetListsServlet
 */
@WebServlet("/GetListsServlet")
public class GetListsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetListsServlet() {
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
		String altel=request.getParameter("altel");
		String error=" ";
		List<ListBean> lists=null;
		try {
			ListBpo listBpro=new ListBpo();
			lists=listBpro.getLists(alname, altel);
		}catch(Exception e) {
			error="查询用户出错:"+e.getMessage();
		}
		request.setAttribute("error", error);
		request.setAttribute("lists", lists);
		request.getRequestDispatcher("/List/showList.jsp").forward(request, response);	
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

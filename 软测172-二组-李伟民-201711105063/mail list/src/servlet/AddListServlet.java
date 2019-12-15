package servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.ListBean;


/**
 * Servlet implementation class AddListServlet
 */
@WebServlet("/AddListServlet")
public class AddListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		ListBean newList=new ListBean();
		newList.setAlname(request.getParameter("alname"));
		newList.setAltel(request.getParameter("altel"));
		newList.setAddress(request.getParameter("address"));
		newList.setPcode(request.getParameter("pcode"));
		Map<String,String> errors=null;
		try {
			errors=newList.checkList();
			if(errors.size()==0) newList.addList();
			
		}catch(Exception e) {
			//errors.put("othererr", "Ôö¼ÓÊ§°Ü:"+e.getMessage());
			e.printStackTrace();
		}
		if(errors.size()!=0) {
			request.setAttribute("errors", errors);
			request.getRequestDispatcher("/List/AddList.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("/List/showList.jsp").forward(request, response);
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

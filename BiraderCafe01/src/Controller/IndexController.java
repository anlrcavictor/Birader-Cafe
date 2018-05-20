package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.haberDAO;
import DAO.haberDAOImpl;
import model.haber;

@WebServlet("/index")
public class IndexController extends HttpServlet{
	
	private static String INDEX="/Ýndex1.jsp";
	private static String DETAILS="/details.jsp";
	
	private haberDAO HaberDAO;
	
	public IndexController(){
		super();
		HaberDAO=new haberDAOImpl();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
		String forward="";
		String action=req.getParameter("action");
		
		if(action==null){
			List<haber> haberlist=HaberDAO.getHabers();
			req.setAttribute("allHabers", haberlist);
			forward=INDEX;
		}
		else if(action.equals("details")){
			int id=Integer.parseInt(req.getParameter("haberId"));
			haber hbr=new haber();
			hbr=HaberDAO.getHaber(id);
			req.setAttribute("haber",hbr);
			forward=DETAILS;
		}
		
		
		
		RequestDispatcher dispatcher = req.getRequestDispatcher(forward);
		dispatcher.forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

}

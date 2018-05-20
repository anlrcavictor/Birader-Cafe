package AdminController;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.mesajDAO;
import DAO.mesajDAOImpl;
import model.haber;
import model.mesaj;

@WebServlet("/mesajController")
public class MesajController extends HttpServlet{
	
	private static String LIST="/mesajList.jsp";
	private static String DETAILS="/mesajDetails.jsp";	
	
	private mesajDAO MesajDAO;
	
	public MesajController(){
		super();
		MesajDAO=new mesajDAOImpl();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     
		String forward="";
		String action=req.getParameter("action");
		
		if(action==null){
			
			List<mesaj> mesajList=MesajDAO.getMesajs();
			
			req.setAttribute("allMesajs", mesajList);
			forward=LIST;
			}
		else if(action.equals("delete")){
            int id=Integer.parseInt(req.getParameter("mesajId"));
			
			MesajDAO.removeMesaj(id);
			forward=LIST;
			req.setAttribute("allMesajs", MesajDAO.getMesajs());
		}
		else if(action.equals("details")){
			forward=DETAILS;
			int id=Integer.parseInt(req.getParameter("mesajId"));
			
			MesajDAO.updateMesajOkunduMu(id);
			
			mesaj msj=new mesaj();
			msj=MesajDAO.getMesaj(id);
			req.setAttribute("mesaj",msj);
		}
			
			RequestDispatcher dispatcher = req.getRequestDispatcher(forward);
			dispatcher.forward(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}
}

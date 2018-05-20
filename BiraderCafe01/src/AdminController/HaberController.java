package AdminController;

import java.io.IOException;
import java.util.Date;
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

@WebServlet("/haberController")
public class HaberController extends HttpServlet{
	
	private static String INSERT="/haberÝnsert.jsp";
	private static String LIST="/adminÝndex.jsp";
	private static String UPDATE="/haberUpdate.jsp";
	private static String DETAILS="/haberDetails.jsp";
	
	private haberDAO HaberDAO;
	

	public HaberController(){
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
		forward=LIST;
		}
		else if(action.equals("insert")){
			forward=INSERT;
		}
		else if(action.equals("delete")){
			int id=Integer.parseInt(req.getParameter("haberId"));
			
			HaberDAO.removeHaber(id);
			forward=LIST;
			req.setAttribute("allHabers", HaberDAO.getHabers());
		}
		else if(action.equals("update")){
			forward=UPDATE;
			int id=Integer.parseInt(req.getParameter("haberId"));
			haber hbr=new haber();
			hbr=HaberDAO.getHaber(id);
			req.setAttribute("haber",hbr);
		}
		else if(action.equals("details")){
			forward=DETAILS;
			int id=Integer.parseInt(req.getParameter("haberId"));
			haber hbr=new haber();
			hbr=HaberDAO.getHaber(id);
			req.setAttribute("haber",hbr);
		}
		
		RequestDispatcher dispatcher = req.getRequestDispatcher(forward);
		dispatcher.forward(req, resp);
		
		
			
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String forwardPost;
		
		req.setCharacterEncoding("UTF-8");
		
		String haberId=req.getParameter("id");
		String haberAdi=req.getParameter("haberAdi");
		String haberBaslik=req.getParameter("haberBaslik");
		String haberResimYolu=req.getParameter("haberResimYolu");
		String haberMakale=req.getParameter("haberMakale");
		
		Date date=new Date();
		java.text.SimpleDateFormat sdf=new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String haberZaman=sdf.format(date);
		
		if(haberId==null){
			if(Validator.Validator.haberValidator(haberAdi, haberBaslik, haberMakale, haberResimYolu)){
				HaberDAO.insertHaber(haberAdi, haberBaslik, haberMakale, haberZaman, haberResimYolu);
				forwardPost=LIST;
				List<haber> haberList=HaberDAO.getHabers();
				req.setAttribute("allHabers", haberList);
				}
			else{
				String errMsg="Uygun giriþ yapýlmadý!";
				req.setAttribute("errMsg", errMsg);
				forwardPost=INSERT;
			}
		}
		else{
			if(Validator.Validator.haberValidator(haberAdi, haberBaslik, haberMakale, haberResimYolu)){
				int id=Integer.parseInt(haberId);
				HaberDAO.updateHaber(id, haberAdi, haberBaslik, haberMakale, haberZaman, haberResimYolu);
				forwardPost=LIST;
				List<haber> haberList=HaberDAO.getHabers();
				req.setAttribute("allHabers", haberList);
				}
			else{
				String errMsg="Uygun giriþ yapýlmadý. Güncelleme baþarýsýz !";
				req.setAttribute("errMsg", errMsg);
				forwardPost=UPDATE;
				}
			
			}
			
		
		
		RequestDispatcher dispatcher = req.getRequestDispatcher(forwardPost);
		dispatcher.forward(req, resp);
	}
	

}

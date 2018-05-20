package AdminController;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.yoneticiDAO;
import DAO.yoneticiDAOImpl;
import model.haber;
import model.yonetici;

@WebServlet("/yoneticiController")
public class YoneticiController extends HttpServlet{
	
	private static String INSERT="/yoneticiInsert.jsp";
	private static String LIST="/admin/yoneticiList1.jsp";
	private static String UPDATE="/yoneticiUpdate.jsp";
	private static String DETAILS="/yoneticiDetails.jsp";
	
	private yoneticiDAO YoneticiDAO;
	
	public YoneticiController(){
		super();
		YoneticiDAO=new yoneticiDAOImpl();
	}
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         
		String forward="";
		String action=req.getParameter("action");
		
		if(action==null){
			
			List<yonetici> yoneticilist=YoneticiDAO.getYoneticis();
			
			req.setAttribute("allYoneticis", yoneticilist);
			forward=LIST;
		}
		else if(action.equals("insert")){
			forward=INSERT;
		}
		else if(action.equals("delete")){
			int id=Integer.parseInt(req.getParameter("yoneticiId"));
			
			YoneticiDAO.removeYonetici(id);
			forward=LIST;
			req.setAttribute("allYoneticis", YoneticiDAO.getYoneticis());
		}
		else if(action.equals("update")){
			forward=UPDATE;
			int id=Integer.parseInt(req.getParameter("yoneticiId"));
			yonetici ynt=new yonetici();
			ynt=YoneticiDAO.getYonetici(id);
			req.setAttribute("yonetici",ynt);
		}
		
		RequestDispatcher dispatcher = req.getRequestDispatcher(forward);
		dispatcher.forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
		String forwardPost;
		
		req.setCharacterEncoding("UTF-8");
		
		String yoneticiId=req.getParameter("yoneticiId");
		String yoneticiAdi=req.getParameter("yoneticiAdi");
		String yoneticiKulAdi=req.getParameter("yoneticiKulAdi");
		String yoneticiParola=req.getParameter("yoneticiParola");
		String yoneticiMail=req.getParameter("yoneticiMail");
		String yoneticiSeviye=req.getParameter("yoneticiSeviye");
		
		if(yoneticiId==null){
			if(Validator.Validator.Yoneticivalidator(yoneticiAdi, yoneticiParola, yoneticiMail, yoneticiKulAdi, yoneticiSeviye)){
				YoneticiDAO.insertYonetici(yoneticiAdi, yoneticiParola, yoneticiMail, yoneticiKulAdi, yoneticiSeviye);
				forwardPost=LIST;
				List<yonetici> yoneticiList=YoneticiDAO.getYoneticis();
				req.setAttribute("allYoneticis", yoneticiList);
			}	
			else{
				String errMsg="Uygun giriþ yapýlmadý!";
				req.setAttribute("errMsg", errMsg);
				forwardPost=INSERT;
			}
		}
		else{
			if(Validator.Validator.Yoneticivalidator(yoneticiAdi, yoneticiParola, yoneticiMail, yoneticiKulAdi, yoneticiSeviye)){
				int id=Integer.parseInt(yoneticiId);
				YoneticiDAO.updateYonetici(id,yoneticiAdi, yoneticiParola, yoneticiMail, yoneticiKulAdi, yoneticiSeviye);
				forwardPost=LIST;
				List<yonetici> yoneticiList=YoneticiDAO.getYoneticis();
				req.setAttribute("allYoneticis", yoneticiList);
			}
			else{
				String errMsg="Uygun giriþ yapýlmadý. Güncelleme Baþarýsýz !";
				req.setAttribute("errMsg", errMsg);
				forwardPost=INSERT;
			}
		}
		
		
		RequestDispatcher dispatcher = req.getRequestDispatcher(forwardPost);
		dispatcher.forward(req, resp);
		
	}
}

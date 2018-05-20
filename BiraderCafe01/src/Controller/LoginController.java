package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.yoneticiDAO;
import DAO.yoneticiDAOImpl;
import model.yonetici;

@WebServlet("/login")
public class LoginController extends HttpServlet{
	
	private yoneticiDAO YoneticiDAO;
	
	public LoginController(){
		super();
		YoneticiDAO=new yoneticiDAOImpl();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
		dispatcher.forward(req, resp);
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String username=req.getParameter("name");
		String password=req.getParameter("password");
		
		String errMsg = "yanlýþ kullanýcý adý veya yanlýþ þifre!";
		
		List<yonetici> yoneticiList=YoneticiDAO.getYoneticis();
		
		for(yonetici ynt:yoneticiList){
				if(username.equals(ynt.getYoneticiKulAdi()) & password.equals(ynt.getYoneticiParola())){
				HttpSession session=req.getSession();
				
				session.setAttribute("username", username);
				session.setAttribute("realUsername",ynt.getYoneticiAdi() );
				resp.sendRedirect("haberController");
				return;
				}
			
		}
		req.setAttribute("errMsg", errMsg);
		
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
		dispatcher.forward(req, resp);
		
		
	}
}

package Controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.mesajDAO;
import DAO.mesajDAOImpl;

@WebServlet("/bizeUlasin")
public class BizeUlasinController extends HttpServlet{

	private mesajDAO MesajDAO;
	
	public BizeUlasinController(){
		super();
		MesajDAO=new mesajDAOImpl();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/about.jsp");
		dispatcher.forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
		String errMsg;
		
		req.setCharacterEncoding("UTF-8");
		
		String mesajSahibiAdi=req.getParameter("name");
		String mesajSahibiMail=req.getParameter("email");
		String mesajSahibiNumara=req.getParameter("phone");
		String mesage=req.getParameter("message");
		
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String mesajZaman=sdf.format(date);
		
		if(mesajSahibiAdi.length()<=0){
			System.out.println("#name=NULL");
		}
		
		if(Validator.Validator.messageValidator(mesajSahibiAdi, mesajSahibiMail, mesajSahibiNumara, mesage)){
			boolean mesajOkunduMu=false;
		    MesajDAO.insertMesaj(mesajSahibiAdi, mesajSahibiMail, mesajSahibiNumara, mesage, mesajZaman);
		    errMsg="Mesajýnýz Gönderildi ! En kýsa zamanda size dönüþ yapýlacak";
		    
		}else{
			errMsg="alanlar uygun formatta doldurulmadý";
			}
		
		req.setAttribute("errMsg", errMsg);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/about.jsp");
		dispatcher.forward(req, resp);
		
		
	}
}

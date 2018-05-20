package Validator;

public class Validator {

	public static boolean messageValidator(String name, String email,String phone,String message){
	
		if(name.length()<=0){return false;}
		if(name.length()<3 & name.length()>30){ return false;}
		if(name.indexOf("<")>-1 || name.indexOf("script")>-1){return false;}
		
		if(email.length()<=0){return false;}
		if(email.indexOf("@")<=-1){return false;}
		if(email.length()<9 & email.length()>50){return false;}
		if(email.indexOf("<")>-1 || email.indexOf("script")>-1){return false;}
		
		if(phone.length()>12){return false;}
		if(phone.indexOf("<")>-1 || phone.indexOf("script")>-1){return false;}
		
		if(message.length()<=0){return false;}
		if(message.length()>300){return false;}
		if(message.indexOf("<")>-1 || phone.indexOf("script")>-1){return false;}
		
		return true;
		}
	
	public static boolean haberValidator(String haberAdi,String haberBaslik,String haberMakale,String haberResimYolu){
		
		if(haberAdi.length()<=0 ||haberAdi.length()>50){return false;}
		
		if(haberBaslik.length()<=0 || haberBaslik.length()>80){return false;}
		
		if(haberMakale.length()<=0 || haberMakale.length()>500){return false;}
	
		if(haberResimYolu.length()<=0 || haberResimYolu.length()>80){return false;}
		
		return true;
	}
	
	public static boolean Yoneticivalidator(String yoneticiAdi,String yoneticiParola,String yoneticiMail,String yoneticiKulAdi,String yoneticiSeviye){
		
		if(yoneticiAdi.length()<=0 ||yoneticiAdi.length()>80){return false;}
		
		if(yoneticiParola.length()<=0 ||yoneticiParola.length()>75){return false;}
		
		if(yoneticiMail.length()<=0 ||yoneticiMail.length()>80){return false;}
		
		if(yoneticiKulAdi.length()<=0 ||yoneticiKulAdi.length()>75){return false;}
		
		if(yoneticiSeviye.length()<=0 ||yoneticiSeviye.length()>85){return false;}
		
		return true;
	}
	
}

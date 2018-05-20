package DAO;

import java.util.Date;
import java.util.List;

import model.haber;

public interface haberDAO {
	
	public void insertHaber(String haberAdi,String haberBaslik,String haberMakale,String haberZaman,String haberResimYolu);
	
	public List<haber> getHabers();
	
	public void removeHaber(int id);
	
	public haber getHaber(int id);
	
	public void updateHaber(int id,String haberAdi,String haberBaslik,String haberMakale,String haberZaman,String haberResimYolu);

}

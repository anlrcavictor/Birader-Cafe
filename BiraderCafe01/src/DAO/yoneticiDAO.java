package DAO;

import java.util.List;


import model.yonetici;

public interface yoneticiDAO {
	
public void insertYonetici(String yoneticiAdi,String yoneticiParola,String yoneticiMail,String yoneticiKulAdi,String yoneticiSeviye);

	
	public List<yonetici> getYoneticis();
	
	public void removeYonetici(int id);
	
	public yonetici getYonetici(int id);
	
	public void updateYonetici(int id,String yoneticiAdi,String yoneticiParola,String yoneticiMail,String YoneticiKulAdi,String yoneticiSeviye);


}

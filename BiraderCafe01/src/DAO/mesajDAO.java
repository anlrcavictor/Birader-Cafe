package DAO;

import java.util.List;

import model.mesaj;

public interface mesajDAO {
	
	public void insertMesaj(String mesajSahibiAdi,String mesajSahibiMail,String mesajSahibiNumara,String mesage,String mesajZaman);
	
	public List<mesaj> getMesajs();
	
	public void removeMesaj(int id);
	
	public mesaj getMesaj(int id);
	
	public void updateMesajOkunduMu(int id);
}

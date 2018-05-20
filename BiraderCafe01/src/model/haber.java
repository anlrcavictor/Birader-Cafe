package model;

import java.util.Date;

public class haber {
	
	private int haberId;
	private String haberAdi;
	private String haberBaslik;
	private String haberMakale;
	private String haberZaman;
	private String haberResimYolu;
	
	public haber() {
		super();
	}
	
	
	public haber(int haberId, String haberAdi, String haberBaslik, String haberMakale, String haberZaman,
			String haberResimYolu) {
		super();
		this.haberId = haberId;
		this.haberAdi = haberAdi;
		this.haberBaslik = haberBaslik;
		this.haberMakale = haberMakale;
		this.haberZaman = haberZaman;
		this.haberResimYolu = haberResimYolu;
	}



	public int getHaberId() {
		return haberId;
	}
	public void setHaberId(int haberId) {
		this.haberId = haberId;
	}
	public String getHaberAdi() {
		return haberAdi;
	}
	public void setHaberAdi(String haberAdi) {
		this.haberAdi = haberAdi;
	}
	public String getHaberBaslik() {
		return haberBaslik;
	}
	public void setHaberBaslik(String haberBaslik) {
		this.haberBaslik = haberBaslik;
	}
	public String getHaberMakale() {
		return haberMakale;
	}
	public void setHaberMakale(String haberMakale) {
		this.haberMakale = haberMakale;
	}
	public String getHaberZaman() {
		return haberZaman;
	}
	public void setHaberZaman(String haberZaman) {
		this.haberZaman = haberZaman;
	}
	public String getHaberResimYolu() {
		return haberResimYolu;
	}
	public void setHaberResimYolu(String haberResimYolu) {
		this.haberResimYolu = haberResimYolu;
	}


}

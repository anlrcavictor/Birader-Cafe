package model;

public class mesaj {
	
	private int mesajId;
	private String mesajSahibiAdi;
	private String mesajSahibiMail;
	private String mesajSahibiNumara;
	private String mesage;
	private String mesajZaman;
	private boolean mesajOkunduMu;
	
	public mesaj() {
		super();
	}

	public mesaj(int mesajId, String mesajSahibiAdi, String mesajSahibiMail, String mesajSahibiNumara, String mesage,
			String mesajZaman, boolean mesajOkunduMu) {
		super();
		this.mesajId = mesajId;
		this.mesajSahibiAdi = mesajSahibiAdi;
		this.mesajSahibiMail = mesajSahibiMail;
		this.mesajSahibiNumara = mesajSahibiNumara;
		this.mesage = mesage;
		this.mesajZaman = mesajZaman;
		this.mesajOkunduMu = mesajOkunduMu;
	}

	public int getMesajId() {
		return mesajId;
	}

	public void setMesajId(int mesajId) {
		this.mesajId = mesajId;
	}

	public String getMesajSahibiAdi() {
		return mesajSahibiAdi;
	}

	public void setMesajSahibiAdi(String mesajSahibiAdi) {
		this.mesajSahibiAdi = mesajSahibiAdi;
	}

	public String getMesajSahibiMail() {
		return mesajSahibiMail;
	}

	public void setMesajSahibiMail(String mesajSahibiMail) {
		this.mesajSahibiMail = mesajSahibiMail;
	}

	public String getMesajSahibiNumara() {
		return mesajSahibiNumara;
	}

	public void setMesajSahibiNumara(String mesajSahibiNumara) {
		this.mesajSahibiNumara = mesajSahibiNumara;
	}

	public String getMesage() {
		return mesage;
	}

	public void setMesage(String mesage) {
		this.mesage = mesage;
	}

	public String getMesajZaman() {
		return mesajZaman;
	}

	public void setMesajZaman(String mesajZaman) {
		this.mesajZaman = mesajZaman;
	}

	public boolean isMesajOkunduMu() {
		return mesajOkunduMu;
	}

	public void setMesajOkunduMu(boolean mesajOkunduMu) {
		this.mesajOkunduMu = mesajOkunduMu;
	}
	
}

package model;

public class yonetici {
	
	private int yoneticiId;
	private String YoneticiAdi;
	private String YoneticiParola;
	private String YoneticiMail;
	private String YoneticiKulAdi;
	private String YoneticiSeviye;
	
	public yonetici() {
		super();
	}

	
	public yonetici(int yoneticiId, String yoneticiAdi, String yoneticiParola, String yoneticiMail,
			String yoneticiKulAdi, String yoneticiSeviye) {
		super();
		this.yoneticiId = yoneticiId;
		YoneticiAdi = yoneticiAdi;
		YoneticiParola = yoneticiParola;
		YoneticiMail = yoneticiMail;
		YoneticiKulAdi = yoneticiKulAdi;
		YoneticiSeviye = yoneticiSeviye;
	}


	public int getYoneticiId() {
		return yoneticiId;
	}

	public void setYoneticiId(int yoneticiId) {
		this.yoneticiId = yoneticiId;
	}

	public String getYoneticiParola() {
		return YoneticiParola;
	}

	public void setYoneticiParola(String yoneticiParola) {
		YoneticiParola = yoneticiParola;
	}

	public String getYoneticiMail() {
		return YoneticiMail;
	}

	public void setYoneticiMail(String yoneticiMail) {
		YoneticiMail = yoneticiMail;
	}

	public String getYoneticiKulAdi() {
		return YoneticiKulAdi;
	}

	public void setYoneticiKulAdi(String yoneticiKulAdi) {
		YoneticiKulAdi = yoneticiKulAdi;
	}

	public String getYoneticiSeviye() {
		return YoneticiSeviye;
	}

	public void setYoneticiSeviye(String yoneticiSeviye) {
		YoneticiSeviye = yoneticiSeviye;
	}


	public String getYoneticiAdi() {
		return YoneticiAdi;
	}


	public void setYoneticiAdi(String yoneticiAdi) {
		YoneticiAdi = yoneticiAdi;
	}
	
	
	
	
	

}

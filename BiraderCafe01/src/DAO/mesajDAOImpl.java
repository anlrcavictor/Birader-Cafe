package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import model.haber;
import model.mesaj;

public class mesajDAOImpl implements mesajDAO {
	
	private static final String INSERT_MESAJ ="insert into mesajlar(mesajsahibiadi,mesajsahibimail,mesajsahibinumara,mesaj,mesajzaman,mesajokundumu) values (?,?,?,?,?,?)";
	private static final String ALL_MESAJS = "select * from mesajlar order by mesajid desc";
	private static final String DELETE_MESAJ ="delete from mesajlar where mesajid=?";
	private static final String UPDATE_MESAJ ="update mesajlar set mesajokundumu=? where mesajid=?";
	private static final String GET_MESAJ = "select * from mesajlar where mesajid=?";

	private DataSource getDataSource(){
		ConnectionManager manager = new ConnectionManager();
		DataSource dataSource = manager.getMySQLDataSource();
		return dataSource;
	}
	
	public void insertMesaj(String mesajSahibiAdi,String mesajSahibiMail,String mesajSahibiNumara,String mesage,String mesajZaman){
           DataSource dataSource = getDataSource();
           
           int msjOkundumu=0;
           
		try {
			Connection connection = dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(INSERT_MESAJ);
			ps.setString(1, mesajSahibiAdi);
			ps.setString(2, mesajSahibiMail);
			ps.setString(3, mesajSahibiNumara);
			ps.setString(4, mesage);
			ps.setString(5, mesajZaman);
			ps.setInt(6,msjOkundumu);
			ps.executeUpdate();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public List<mesaj> getMesajs() {
		DataSource dataSource = getDataSource();
		Connection connection;
		List<mesaj> mesajs = new ArrayList<mesaj>();
		try {
			connection = dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(ALL_MESAJS);
			ResultSet resultSet = ps.executeQuery();
			
			while(resultSet.next()){
				int mesajId = resultSet.getInt("mesajid");
				String mesajSahibiAdi = resultSet.getString("mesajsahibiadi");
				String mesajSahibiMail = resultSet.getString("mesajsahibimail");
				String mesajSahibiNumara = resultSet.getString("mesajsahibinumara");
				String mesage = resultSet.getString("mesaj");
				String mesajZaman=resultSet.getString("mesajzaman");
				int mesajokunduMu=resultSet.getInt("mesajokundumu");
				
				boolean mesajOkunduMu;
				
				if(mesajokunduMu==1)
					mesajOkunduMu=true;
				else
					mesajOkunduMu=false;
				
				mesaj msj=new mesaj(mesajId,mesajSahibiAdi,mesajSahibiMail,mesajSahibiNumara,mesage, mesajZaman,mesajOkunduMu);
						
 				mesajs.add(msj);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return mesajs;
		
	}
	
	@Override
	public void removeMesaj(int id) {
		DataSource dataSource = getDataSource();
		
		Connection connection;
		try {
			connection = dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(DELETE_MESAJ);
			ps.setInt(1, id);
			ps.execute();
			ps.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public mesaj getMesaj(int id){
		DataSource dataSource = getDataSource();
		Connection connection;
		mesaj msj=new mesaj();
		try {
			connection=dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(GET_MESAJ);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				msj.setMesajId(rs.getInt("mesajid"));
				msj.setMesajSahibiAdi(rs.getString("mesajsahibiadi"));
				msj.setMesajSahibiMail(rs.getString("mesajsahibimail"));
				msj.setMesajSahibiNumara(rs.getString("mesajsahibinumara"));
				msj.setMesage(rs.getString("mesaj"));
				msj.setMesajZaman(rs.getString("mesajzaman"));
				
				int msjOkunduMu=rs.getInt("mesajokundumu");
				
				if(msjOkunduMu==1)
					msj.setMesajOkunduMu(true);
				else
					msj.setMesajOkunduMu(false);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msj;
	}
	
	public void updateMesajOkunduMu(int id){
		DataSource dataSource = getDataSource();
		Connection connection;
		try {
			connection=dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(UPDATE_MESAJ);
			ps.setInt(1,1); 
			ps.setInt(2,id);
			ps.execute();
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}

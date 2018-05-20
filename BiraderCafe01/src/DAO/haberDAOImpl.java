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

public class haberDAOImpl implements haberDAO{

	private static final String INSERT_HABER ="insert into haberler(haberadi,haberbaslik,habermakale,haberzamani,haberresimyolu) values (?,?,?,?,?)";
	private static final String ALL_HABERS = "select * from haberler";
	private static final String DELETE_HABER ="delete from haberler where haberid=?";
	private static final String UPDATE_HABER ="update haberler set haberadi=?,haberbaslik=?,habermakale=?,haberzamani=?,haberresimyolu=? where haberid=?";
	private static final String GET_HABER = "select * from haberler where haberid=?";
	
	private DataSource getDataSource(){
		ConnectionManager manager = new ConnectionManager();
		DataSource dataSource = manager.getMySQLDataSource();
		return dataSource;
	}
	
	@Override
	public void insertHaber(String haberAdi,String haberBaslik,String haberMakale,String haberZaman,String haberResimYolu) {
		DataSource dataSource = getDataSource();
		
		try {
			Connection connection = dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(INSERT_HABER);
			ps.setString(1, haberAdi);
			ps.setString(2, haberBaslik);
			ps.setString(3, haberMakale);
			ps.setString(4, haberZaman);
			ps.setString(5, haberResimYolu);
			ps.executeUpdate();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<haber> getHabers() {
		DataSource dataSource = getDataSource();
		Connection connection;
		List<haber> habers = new ArrayList<haber>();
		try {
			connection = dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(ALL_HABERS);
			ResultSet resultSet = ps.executeQuery();
			
			while(resultSet.next()){
				int haberId = resultSet.getInt("haberid");
				String haberAd = resultSet.getString("haberadi");
				String haberBaslik = resultSet.getString("haberbaslik");
				String haberMakale = resultSet.getString("habermakale");
				String haberZaman=resultSet.getString("haberzamani");
				String haberResimYolu=resultSet.getString("haberresimyolu");
				
				
				haber Haber=new haber(haberId,haberAd,haberBaslik,haberMakale,haberZaman,haberResimYolu);
 				habers.add(Haber);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return habers;
		
	}

	@Override
	public void removeHaber(int id) {
		DataSource dataSource = getDataSource();
		
		Connection connection;
		try {
			connection = dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(DELETE_HABER);
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
	public void updateHaber(int id,String haberAdi,String haberBaslik,String haberMakale,String haberZaman,String haberResimYolu){
		
		DataSource dataSource = getDataSource();
		Connection connection;
		try {
			connection=dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(UPDATE_HABER);
			ps.setString(1,haberAdi); 
			ps.setString(2,haberBaslik);
			ps.setString(3, haberMakale);
			ps.setString(4, haberZaman);
			ps.setString(5, haberResimYolu);
			ps.setInt(6, id);
			ps.execute();
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public haber getHaber(int id){
		DataSource dataSource = getDataSource();
		Connection connection;
		haber Haber=new haber();
		try {
			connection=dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(GET_HABER);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				Haber.setHaberId(rs.getInt("haberid"));
				Haber.setHaberAdi(rs.getString("haberadi"));
				Haber.setHaberBaslik(rs.getString("haberbaslik"));
				Haber.setHaberMakale(rs.getString("habermakale"));
				Haber.setHaberResimYolu(rs.getString("haberresimyolu"));
				Haber.setHaberZaman(rs.getString("haberzamani"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Haber;
	}
	
}

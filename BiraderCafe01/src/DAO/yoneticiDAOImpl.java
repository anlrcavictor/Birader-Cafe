package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import model.yonetici;

public class yoneticiDAOImpl implements yoneticiDAO{
	
	private static final String INSERT_YONETICI ="insert into yonetici(yoneticiadi,yoneticiparola,yoneticimail,yoneticikuladi,yoneticiseviye) values (?,?,?,?,?)";
	private static final String ALL_YONETICIS = "select * from yonetici";
	private static final String DELETE_YONETICI ="delete from yonetici where yoneticiid=?";
	private static final String UPDATE_YONETICI ="update yonetici set yoneticiadi=?,yoneticiparola=?,yoneticimail=?,yoneticikuladi=?,yoneticiseviye=? where yoneticiid=?";
	private static final String GET_YONETICI = "select * from yonetici where yoneticiid=?";
	
	private DataSource getDataSource(){
		ConnectionManager manager = new ConnectionManager();
		DataSource dataSource = manager.getMySQLDataSource();
		return dataSource;
	}
	
	@Override
	public void insertYonetici(String yoneticiAdi,String yoneticiParola,String yoneticiMail,String yoneticiKulAdi,String yoneticiSeviye) {
		DataSource dataSource = getDataSource();
		
		try {
			Connection connection = dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(INSERT_YONETICI);
			ps.setString(1, yoneticiAdi);
			ps.setString(2, yoneticiParola);
			ps.setString(3, yoneticiMail);
			ps.setString(4, yoneticiKulAdi);
			ps.setString(5, yoneticiSeviye);
			ps.executeUpdate();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<yonetici> getYoneticis() {
		DataSource dataSource = getDataSource();
		Connection connection;
		List<yonetici> yoneticis = new ArrayList<yonetici>();
		try {
			connection = dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(ALL_YONETICIS);
			ResultSet resultSet = ps.executeQuery();
			
			while(resultSet.next()){
				int yoneticiId = resultSet.getInt("yoneticiid");
				String yoneticiAdi = resultSet.getString("yoneticiadi");
				String yoneticiParola = resultSet.getString("yoneticiparola");
				String yoneticiMail = resultSet.getString("yoneticimail");
				String yoneticiKulAdi=resultSet.getString("yoneticikuladi");
				String yoneticiSeviye=resultSet.getString("yoneticiseviye");
				
				
				yonetici ynt=new yonetici(yoneticiId,yoneticiAdi,yoneticiParola,yoneticiMail,yoneticiKulAdi,yoneticiSeviye);
 				yoneticis.add(ynt);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return yoneticis;
		
	}

	@Override
	public void removeYonetici(int id) {
		DataSource dataSource = getDataSource();
		
		Connection connection;
		try {
			connection = dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(DELETE_YONETICI);
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
	public void updateYonetici(int id,String yoneticiAdi,String yoneticiParola,String yoneticiMail,String YoneticiKulAdi,String yoneticiSeviye){
		
		DataSource dataSource = getDataSource();
		Connection connection;
		try {
			connection=dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(UPDATE_YONETICI);
			ps.setString(1,yoneticiAdi); 
			ps.setString(2,yoneticiParola);
			ps.setString(3, yoneticiMail);
			ps.setString(4, YoneticiKulAdi);
			ps.setString(5, yoneticiSeviye);
			ps.setInt(6, id);
			ps.execute();
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public yonetici getYonetici(int id){
		DataSource dataSource = getDataSource();
		Connection connection;
		yonetici ynt=new yonetici();
		try {
			connection=dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(GET_YONETICI);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				ynt.setYoneticiId(rs.getInt("yoneticiid"));
				ynt.setYoneticiAdi(rs.getString("yoneticiadi"));
				ynt.setYoneticiParola(rs.getString("yoneticiparola"));
				ynt.setYoneticiMail(rs.getString("yoneticimail"));
				ynt.setYoneticiKulAdi(rs.getString("yoneticikuladi"));
				ynt.setYoneticiSeviye(rs.getString("yoneticiseviye"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ynt;
	}
	
}
	



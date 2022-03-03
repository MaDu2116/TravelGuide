package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.BaseConnection;
import entity.CityEntity;

public class CityDao extends BaseConnection{
	public List<String> getAllNameCity() {
		List<String> nameCityList = new ArrayList<>();
		conn = getConnection();
		String sql = "SELECT C.NAME_CITY FROM TravelGuide.dbo.CITY AS C ORDER BY C.NAME_CITY";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				CityEntity cityEntity = new CityEntity();
				nameCityList.add(cityEntity.getNameCity());
				System.out.println(cityEntity.getNameCity()+"__________");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		return nameCityList;
	}
}

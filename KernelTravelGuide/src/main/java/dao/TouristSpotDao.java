package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.BaseConnection;
import entity.TouristSpotsEntity;

public class TouristSpotDao extends BaseConnection {
	public List<TouristSpotsEntity> getTourisSpots() {
		List<TouristSpotsEntity> tourisSpotsEntityList = new ArrayList<>();
		conn = getConnection();
		String sql = " SELECT * FROM TRAVELGUIDE.DBO.TOURIST_SPOTS WHERE QUALITY_TOURISTSPOT >= 8 ";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				TouristSpotsEntity tourisSpotsEntity = new TouristSpotsEntity();
				
				tourisSpotsEntity.setIdTouristSpot(rs.getInt("ID_TOURISTSPOT"));
				tourisSpotsEntity.setNameTouristSpot(rs.getString("NAME_TOURISTSPOT"));
				tourisSpotsEntity.setIdCity(rs.getString("ID_CITY"));
				tourisSpotsEntity.setAddressTouristSpot(rs.getString("ADDRESS_TOURISTSPOT"));
				tourisSpotsEntity.setTelTouristSpot(rs.getString("TEL_TOURISTSPOT"));
				tourisSpotsEntity.setQualityTouristSpots(rs.getInt("QUALITY_TOURISTSPOT"));
				tourisSpotsEntity.setDesTouristSpots(rs.getString("DES_TOURIST_SPOTS"));
				tourisSpotsEntity.setIntroduceTouristSpots(rs.getString("INTRODUCE_TOURIST_SPOTS"));
				tourisSpotsEntity.setImageTouristSpots(rs.getString("IMAGE_TOURIST_SPOTS"));
				tourisSpotsEntity.setImageDetailTouristSpots(rs.getString("IMAGE_DETAIL_TOURIST_SPOTS"));

				tourisSpotsEntityList.add(tourisSpotsEntity);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		return tourisSpotsEntityList;

	}
}

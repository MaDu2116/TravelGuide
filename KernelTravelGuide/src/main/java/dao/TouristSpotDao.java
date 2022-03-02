package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.BaseConnection;
import dto.TouristSpotDto;
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

	public TouristSpotDto getTouristSpotById(String idTouristSpot) {
		TouristSpotDto touristSpotDto = new TouristSpotDto();
		conn = getConnection();
		StringBuilder sql = new StringBuilder();
		sql.append("  SELECT * FROM TRAVELGUIDE.DBO.TOURIST_SPOTS AS T");
		sql.append("  INNER JOIN TRAVELGUIDE.DBO.CITY AS C");
		sql.append("  ON T.ID_CITY = C.ID_CITY");
		sql.append("   WHERE ID_TOURISTSPOT = ?");
		try {
			PreparedStatement stmt = conn.prepareStatement(sql.toString());
			stmt.setString(1, idTouristSpot);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {

				touristSpotDto.setIdTouristSpot(rs.getInt("ID_TOURISTSPOT"));
				touristSpotDto.setNameTouristSpot(rs.getString("NAME_TOURISTSPOT"));
				touristSpotDto.setIdCity(rs.getString("ID_CITY"));
				touristSpotDto.setAddressTouristSpot(rs.getString("ADDRESS_TOURISTSPOT"));
				touristSpotDto.setTelTouristSpot(rs.getString("TEL_TOURISTSPOT"));
				touristSpotDto.setQualityTouristSpots(rs.getInt("QUALITY_TOURISTSPOT"));
				touristSpotDto.setDesTouristSpots(rs.getString("DES_TOURIST_SPOTS"));
				touristSpotDto.setIntroduceTouristSpots(rs.getString("INTRODUCE_TOURIST_SPOTS"));
				touristSpotDto.setImageTouristSpots(rs.getString("IMAGE_TOURIST_SPOTS"));
				touristSpotDto.setImageDetailTouristSpots(rs.getString("IMAGE_DETAIL_TOURIST_SPOTS"));
				touristSpotDto.setNameCity(rs.getString("NAME_CITY"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		return touristSpotDto;
	}

	public List<TouristSpotDto> getAllTouristSpot() {
		List<TouristSpotDto> touristSpotDtoList = new ArrayList<>();
		TouristSpotDto touristSpotDto = new TouristSpotDto();
		conn = getConnection();
		StringBuilder sql = new StringBuilder();
		sql.append("  SELECT * FROM TRAVELGUIDE.DBO.TOURIST_SPOTS AS T");
		sql.append("  INNER JOIN TRAVELGUIDE.DBO.CITY AS C");
		sql.append("  ON T.ID_CITY = C.ID_CITY");
		try {
			PreparedStatement stmt = conn.prepareStatement(sql.toString());
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {

				touristSpotDto.setIdTouristSpot(rs.getInt("ID_TOURISTSPOT"));
				touristSpotDto.setNameTouristSpot(rs.getString("NAME_TOURISTSPOT"));
				touristSpotDto.setIdCity(rs.getString("ID_CITY"));
				touristSpotDto.setAddressTouristSpot(rs.getString("ADDRESS_TOURISTSPOT"));
				touristSpotDto.setTelTouristSpot(rs.getString("TEL_TOURISTSPOT"));
				touristSpotDto.setQualityTouristSpots(rs.getInt("QUALITY_TOURISTSPOT"));
				touristSpotDto.setDesTouristSpots(rs.getString("DES_TOURIST_SPOTS"));
				touristSpotDto.setIntroduceTouristSpots(rs.getString("INTRODUCE_TOURIST_SPOTS"));
				touristSpotDto.setImageTouristSpots(rs.getString("IMAGE_TOURIST_SPOTS"));
				touristSpotDto.setImageDetailTouristSpots(rs.getString("IMAGE_DETAIL_TOURIST_SPOTS"));
				touristSpotDto.setNameCity(rs.getString("NAME_CITY"));
				touristSpotDtoList.add(touristSpotDto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		return touristSpotDtoList;
	}
}

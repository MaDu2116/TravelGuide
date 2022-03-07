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
		sql.append(" SELECT * FROM TRAVELGUIDE.DBO.TOURIST_SPOTS AS T");
		sql.append(" INNER JOIN TRAVELGUIDE.DBO.CITY AS C");
		sql.append(" ON T.ID_CITY = C.ID_CITY");
		sql.append(" WHERE ID_TOURISTSPOT = ?");
		try (PreparedStatement stmt = conn.prepareStatement(sql.toString());){
			
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

	public int countAllTouristSpot(String searchStr, String city, String quality) {
		int count = 0;

		conn = getConnection();
		StringBuilder sql = new StringBuilder();
		sql.append("  SELECT COUNT(*) FROM TRAVELGUIDE.DBO.TOURIST_SPOTS AS T");
		sql.append("  INNER JOIN TRAVELGUIDE.DBO.CITY AS C");
		sql.append("  ON T.ID_CITY = C.ID_CITY");
		sql.append("  WHERE 1 = 1 ");

		if (searchStr != null) {
			sql.append(" AND T.NAME_TOURISTSPOT like ?  ESCAPE '!'");
		}
		if (city != null && !city.isEmpty()) {

			sql.append(" AND C.NAME_CITY = ? ");
		}
		if (quality != null && !quality.isEmpty()) {

			sql.append(" AND T.QUALITY_TOURISTSPOT  >= ? ");
		}
		try (PreparedStatement stmt = conn.prepareStatement(sql.toString());) {

			int index = 1;
			if (searchStr != null) {
				stmt.setString(index++, "%" + searchStr + "%");
			}
			if (city != null && !city.isEmpty()) {
				stmt.setString(index++, city);
			}
			if (quality != null && !quality.isEmpty()) {

				stmt.setString(index++, quality);
			}
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				count = Integer.parseInt(rs.getString(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		return count;
	}

	public List<TouristSpotDto> getAllTouristSpot(int offset, String searchStr, String city, String quality) {
		List<TouristSpotDto> touristSpotDtoList = new ArrayList<>();

		conn = getConnection();
		StringBuilder sql = new StringBuilder();
		sql.append("  SELECT * FROM TRAVELGUIDE.DBO.TOURIST_SPOTS AS T");
		sql.append("  INNER JOIN TRAVELGUIDE.DBO.CITY AS C");
		sql.append("  ON T.ID_CITY = C.ID_CITY");
		sql.append("  WHERE 1 = 1 ");

		if (searchStr != null) {
			sql.append(" AND T.NAME_TOURISTSPOT like ?  ESCAPE '!'");
		}
		if (city != null && !city.isEmpty()) {

			sql.append(" AND C.NAME_CITY = ? ");
		}
		if (quality != null && !quality.isEmpty()) {

			sql.append(" AND T.QUALITY_TOURISTSPOT  >= ? ");
		}
		sql.append("  ORDER BY T.ID_TOURISTSPOT");
		sql.append("  OFFSET ? ROWS");
		sql.append("  FETCH NEXT ? ROWS ONLY;");
		try (PreparedStatement stmt = conn.prepareStatement(sql.toString());) {

			int index = 1;
			if (searchStr != null) {
				stmt.setString(index++, "%" + searchStr + "%");
			}
			if (city != null && !city.isEmpty()) {
				stmt.setString(index++, city);
			}
			if (quality != null && !quality.isEmpty()) {

				stmt.setString(index++, quality);
			}
			stmt.setInt(index++, offset);
			stmt.setInt(index, 3);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				TouristSpotDto touristSpotDto = new TouristSpotDto();
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

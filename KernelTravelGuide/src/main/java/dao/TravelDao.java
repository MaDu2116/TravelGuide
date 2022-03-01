package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.BaseConnection;
import dto.TravelDto;
import entity.TravelEntity;

public class TravelDao extends BaseConnection {
	public List<TravelEntity> GetTravels() {

		List<TravelEntity> travelEntitieList = new ArrayList<>();
		conn = getConnection();
		String sql = " SELECT * FROM TRAVELGUIDE.DBO.TRAVEL WHERE QUALITY_TRAVEL >= 8 AND AVAILABLE = 1";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				TravelEntity travelEntity = new TravelEntity();
				travelEntity.setIdTravel(rs.getInt("ID_TRAVEL"));
				travelEntity.setNameTravel(rs.getString("NAME_TRAVEL"));
				travelEntity.setIdCity(rs.getString("ID_CITY"));
				travelEntity.setAddressTravel(rs.getString("ADDRESS_TRAVEL"));
				travelEntity.setTelTravel(rs.getString("TEL_TRAVEL"));
				travelEntity.setQualityTravel(rs.getInt("QUALITY_TRAVEL"));
				travelEntity.setAvailable(rs.getInt("AVAILABLE"));
				travelEntity.setDesTravel(rs.getString("DES_TRAVEL"));
				travelEntity.setIntroductTravel(rs.getString("INTRODUCE_TRAVEL"));
				travelEntity.setImageTravel(rs.getString("IMAGE_TRAVEL"));
				travelEntity.setIsDiscountTravel(rs.getInt("ISDISCOUNT_TRAVEL"));
				travelEntity.setDiscountTravel(rs.getInt("DISCOUNT_TRAVEL"));
				travelEntity.setImageDetailTravel(rs.getString("IMAGE_DETAIL_TRAVEL"));
				travelEntitieList.add(travelEntity);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		return travelEntitieList;

	}

	public TravelDto getTravelById(String idTrevel) {
		TravelDto travelDto = new TravelDto();
		conn = getConnection();
		StringBuilder sql = new StringBuilder();
		sql.append("  SELECT * FROM TRAVELGUIDE.DBO.TRAVEL AS T");
		sql.append("  INNER JOIN TRAVELGUIDE.DBO.CITY AS C");
		sql.append("  ON T.ID_CITY = C.ID_CITY");
		sql.append("   WHERE ID_TRAVEL = ?");
		try {
			PreparedStatement stmt = conn.prepareStatement(sql.toString());
			stmt.setString(1, idTrevel);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				travelDto.setIdTravel(rs.getInt("ID_TRAVEL"));
				travelDto.setNameTravel(rs.getString("NAME_TRAVEL"));
				travelDto.setIdCity(rs.getString("ID_CITY"));
				travelDto.setAddressTravel(rs.getString("ADDRESS_TRAVEL"));
				travelDto.setTelTravel(rs.getString("TEL_TRAVEL"));
				travelDto.setQualityTravel(rs.getInt("QUALITY_TRAVEL"));
				travelDto.setAvailable(rs.getInt("AVAILABLE"));
				travelDto.setDesTravel(rs.getString("DES_TRAVEL"));
				travelDto.setIntroductTravel(rs.getString("INTRODUCE_TRAVEL"));
				travelDto.setImageTravel(rs.getString("IMAGE_TRAVEL"));
				travelDto.setIsDiscountTravel(rs.getInt("ISDISCOUNT_TRAVEL"));
				travelDto.setDiscountTravel(rs.getInt("DISCOUNT_TRAVEL"));
				travelDto.setImageDetailTravel(rs.getString("IMAGE_DETAIL_TRAVEL"));
				travelDto.setNameCity(rs.getString("NAME_CITY"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		return travelDto;
	}
}

package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.BaseConnection;
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
}

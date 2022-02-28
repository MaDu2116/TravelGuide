package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.BaseConnection;
import entity.HotelEntity;

public class HotelDao extends BaseConnection {
	public List<HotelEntity> getHotels() {
		List<HotelEntity> hotelEntitieList = new ArrayList<HotelEntity>();
		conn = getConnection();
		String sql = "  select * from TravelGuide.dbo.HOTEL where QUALITY_HOTEL > 8";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				HotelEntity hotelEntity = new HotelEntity();

				hotelEntity.setIdHotel(rs.getInt("ID_HOTEL"));
				hotelEntity.setNameHotel(rs.getString("NAME_HOTEL"));
				hotelEntity.setIdCity(rs.getString("ID_CITY"));
				hotelEntity.setAddressHotel(rs.getString("ADDRESS_HOTEL"));
				hotelEntity.setTelHotel(rs.getString("TEL_HOTEL"));
				hotelEntity.setQualityHotel(rs.getInt("QUALITY_HOTEL"));
				hotelEntity.setIntroductHotel(rs.getString("INTRODUCE_HOTEL"));
				hotelEntity.setDesHotel(rs.getString("DES_HOTEL"));
				hotelEntity.setImageHotel(rs.getString("IMAGE_HOTEL"));
				hotelEntity.setAvailable(rs.getInt("AVAILABLE"));
				hotelEntity.setPriceHotel(rs.getInt("PRICE_HOTEL"));
				hotelEntity.setIsDiscountHotel(rs.getInt("ISDISCOUNT_HOTEL"));
				hotelEntity.setDiscountHotel(rs.getInt("DISCOUNT_HOTEL"));
				hotelEntity.setImageDetailHotel(rs.getString("IMAGE_DETAIL_HOTEL"));
				hotelEntitieList.add(hotelEntity);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		return hotelEntitieList;
	}
}

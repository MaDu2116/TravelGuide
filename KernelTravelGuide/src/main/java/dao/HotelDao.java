package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.BaseConnection;
import dto.HotelDto;
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

	public HotelDto getHotelById(String idHotel) {
		HotelDto hotelDto = new HotelDto();
		conn = getConnection();
		StringBuilder sql = new StringBuilder();
		sql.append("  SELECT * FROM TRAVELGUIDE.DBO.HOTEL AS H");
		sql.append("  INNER JOIN TRAVELGUIDE.DBO.CITY AS C");
		sql.append("  ON H.ID_CITY = C.ID_CITY");
		sql.append("   WHERE ID_HOTEL = ?");
		try {
			PreparedStatement stmt = conn.prepareStatement(sql.toString());
			stmt.setString(1, idHotel);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {

				hotelDto.setIdHotel(rs.getInt("ID_HOTEL"));
				hotelDto.setNameHotel(rs.getString("NAME_HOTEL"));
				hotelDto.setIdCity(rs.getString("ID_CITY"));
				hotelDto.setAddressHotel(rs.getString("ADDRESS_HOTEL"));
				hotelDto.setTelHotel(rs.getString("TEL_HOTEL"));
				hotelDto.setQualityHotel(rs.getInt("QUALITY_HOTEL"));
				hotelDto.setIntroductHotel(rs.getString("INTRODUCE_HOTEL"));
				hotelDto.setDesHotel(rs.getString("DES_HOTEL"));
				hotelDto.setImageHotel(rs.getString("IMAGE_HOTEL"));
				hotelDto.setAvailable(rs.getInt("AVAILABLE"));
				hotelDto.setPriceHotel(rs.getInt("PRICE_HOTEL"));
				hotelDto.setIsDiscountHotel(rs.getInt("ISDISCOUNT_HOTEL"));
				hotelDto.setDiscountHotel(rs.getInt("DISCOUNT_HOTEL"));
				hotelDto.setImageDetailHotel(rs.getString("IMAGE_DETAIL_HOTEL"));
				hotelDto.setNameCity(rs.getString("NAME_CITY"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		return hotelDto;
	}

	public List<HotelDto> getAllHotel() {
		List<HotelDto> hotelDtoList = new ArrayList<HotelDto>();
		HotelDto hotelDto = new HotelDto();
		conn = getConnection();
		StringBuilder sql = new StringBuilder();
		sql.append("  SELECT * FROM TRAVELGUIDE.DBO.HOTEL AS H");
		sql.append("  INNER JOIN TRAVELGUIDE.DBO.CITY AS C");
		sql.append("  ON H.ID_CITY = C.ID_CITY");
		try {
			PreparedStatement stmt = conn.prepareStatement(sql.toString());
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {

				hotelDto.setIdHotel(rs.getInt("ID_HOTEL"));
				hotelDto.setNameHotel(rs.getString("NAME_HOTEL"));
				hotelDto.setIdCity(rs.getString("ID_CITY"));
				hotelDto.setAddressHotel(rs.getString("ADDRESS_HOTEL"));
				hotelDto.setTelHotel(rs.getString("TEL_HOTEL"));
				hotelDto.setQualityHotel(rs.getInt("QUALITY_HOTEL"));
				hotelDto.setIntroductHotel(rs.getString("INTRODUCE_HOTEL"));
				hotelDto.setDesHotel(rs.getString("DES_HOTEL"));
				hotelDto.setImageHotel(rs.getString("IMAGE_HOTEL"));
				hotelDto.setAvailable(rs.getInt("AVAILABLE"));
				hotelDto.setPriceHotel(rs.getInt("PRICE_HOTEL"));
				hotelDto.setIsDiscountHotel(rs.getInt("ISDISCOUNT_HOTEL"));
				hotelDto.setDiscountHotel(rs.getInt("DISCOUNT_HOTEL"));
				hotelDto.setImageDetailHotel(rs.getString("IMAGE_DETAIL_HOTEL"));
				hotelDto.setNameCity(rs.getString("NAME_CITY"));

				hotelDtoList.add(hotelDto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		return hotelDtoList;
	}
}

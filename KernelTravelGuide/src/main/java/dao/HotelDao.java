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
		try(PreparedStatement stmt = conn.prepareStatement(sql);) {
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
		sql.append(" SELECT * FROM TRAVELGUIDE.DBO.HOTEL AS H");
		sql.append(" INNER JOIN TRAVELGUIDE.DBO.CITY AS C");
		sql.append(" ON H.ID_CITY = C.ID_CITY");
		sql.append(" WHERE ID_HOTEL = ?");
		try(PreparedStatement stmt = conn.prepareStatement(sql.toString());) {
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

		conn = getConnection();
		StringBuilder sql = new StringBuilder();
		sql.append(" SELECT * FROM TRAVELGUIDE.DBO.HOTEL AS H");
		sql.append(" INNER JOIN TRAVELGUIDE.DBO.CITY AS C");
		sql.append(" ON H.ID_CITY = C.ID_CITY");
		try(PreparedStatement stmt = conn.prepareStatement(sql.toString());) {
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				HotelDto hotelDto = new HotelDto();

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

	public int countAllHotel() {
		int count = 0;

		conn = getConnection();
		StringBuilder sql = new StringBuilder();
		sql.append(" SELECT COUNT(*) FROM TRAVELGUIDE.DBO.HOTEL AS H");
		sql.append(" INNER JOIN TRAVELGUIDE.DBO.CITY AS C");
		sql.append(" ON H.ID_CITY = C.ID_CITY");
		try (PreparedStatement stmt = conn.prepareStatement(sql.toString());){
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

	public int countAllHotel(String searchStr, String city, String available, String quality, String minPrice, String maxPrice, String discount) {
		int count = 0;

		conn = getConnection();
		StringBuilder sql = new StringBuilder();
		sql.append("  SELECT COUNT(*) FROM TRAVELGUIDE.DBO.HOTEL AS H");
		sql.append("  INNER JOIN TRAVELGUIDE.DBO.CITY AS C");
		sql.append("  ON H.ID_CITY = C.ID_CITY");
		sql.append("  WHERE 1 = 1 ");
		if (searchStr != null && !searchStr.isEmpty()) {
			sql.append(" AND H.NAME_HOTEL like ?  ESCAPE '!'");
		}
		if (city != null && !city.isEmpty()) {
			sql.append(" AND C.NAME_CITY = ? ");
		}
		if (available != null) {
			if ("true".equals(available)) {
				sql.append(" AND H.AVAILABLE = 1 ");
			} else {
				sql.append(" AND H.AVAILABLE = 0 ");
			}
		}
		if (quality != null && !quality.isEmpty()) {
			sql.append(" AND H.QUALITY_HOTEL  >= ? ");
		}
		if(minPrice != null && maxPrice != null && !"0".equals(maxPrice)) {
			sql.append(" AND H.PRICE_HOTEL  BETWEEN ? AND ? ");
		}
		if (discount != null) {
			if ("true".equals(discount)) {
				sql.append(" AND H.ISDISCOUNT_HOTEL  = 1 ");
			} else {
				sql.append(" AND H.ISDISCOUNT_HOTEL  = 0 ");
			}
		}
		try (PreparedStatement stmt = conn.prepareStatement(sql.toString());) {
			int index = 1;
			if (searchStr != null && !searchStr.isEmpty()) {
				stmt.setString(index++, "%" + searchStr + "%");
			}
			if (city != null && !city.isEmpty()) {
				stmt.setString(index++, city);
			}
			if (quality != null && !quality.isEmpty()) {
				stmt.setString(index++, quality);
			}
			if(minPrice != null && maxPrice != null && !"0".equals(maxPrice)) {
				stmt.setInt(index++, Integer.parseInt(minPrice));
				stmt.setInt(index++, Integer.parseInt(maxPrice));
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

	public List<HotelDto> getAllHotel(int offset, String searchStr, String city, String available, String quality, String minPrice, String maxPrice, String discount) {
		List<HotelDto> hotelDtoList = new ArrayList<>();

		conn = getConnection();
		StringBuilder sql = new StringBuilder();
		sql.append("  SELECT * FROM TRAVELGUIDE.DBO.HOTEL AS H");
		sql.append("  INNER JOIN TRAVELGUIDE.DBO.CITY AS C");
		sql.append("  ON H.ID_CITY = C.ID_CITY");
		if (searchStr != null && !searchStr.isEmpty()) {
			sql.append(" AND H.NAME_HOTEL like ?  ESCAPE '!'");
		}
		if (city != null && !city.isEmpty()) {
			sql.append(" AND C.NAME_CITY = ? ");
		}
		if (available != null) {
			if ("true".equals(available)) {
				sql.append(" AND H.AVAILABLE = 1 ");
			} else {
				sql.append(" AND H.AVAILABLE = 0 ");
			}
		}
		if (quality != null && !quality.isEmpty()) {
			sql.append(" AND H.QUALITY_HOTEL  >= ? ");
		}
		if(minPrice != null && maxPrice != null && !"0".equals(maxPrice)) {
			sql.append(" AND H.PRICE_HOTEL  BETWEEN ? AND ? ");
		}
		if (discount != null) {
			if ("true".equals(discount)) {
				sql.append(" AND H.ISDISCOUNT_HOTEL  = 1 ");
			} else {
				sql.append(" AND H.ISDISCOUNT_HOTEL  = 0 ");
			}
		}
		sql.append("  ORDER BY H.ID_HOTEL");
		sql.append("  OFFSET ? ROWS");
		sql.append("  FETCH NEXT ? ROWS ONLY;");
		try (PreparedStatement stmt = conn.prepareStatement(sql.toString());) {
			int index = 1;
			if (searchStr != null && !searchStr.isEmpty()) {
				stmt.setString(index++, "%" + searchStr + "%");
			}
			if (city != null && !city.isEmpty()) {
				stmt.setString(index++, city);
			}
			if (quality != null && !quality.isEmpty()) {
				stmt.setString(index++, quality);
			}
			if(minPrice != null && maxPrice != null && !"0".equals(maxPrice)) {
				stmt.setInt(index++, Integer.parseInt(minPrice));
				stmt.setInt(index++, Integer.parseInt(maxPrice));
			}
			stmt.setInt(index++, offset);
			stmt.setInt(index, 3);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				HotelDto hotelDto = new HotelDto();
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

package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.BaseConnection;
import dto.RestaurantDto;
import entity.RestaurantEntity;

public class RestaurantDao extends BaseConnection {
	public List<RestaurantEntity> getRestaurants() {
		List<RestaurantEntity> restaurantEntityList = new ArrayList<>();
		conn = getConnection();
		String sql = "  select * from TravelGuide.dbo.RESTAURANT where QUALITY_RESTAURANT > 8";
		try (PreparedStatement stmt = conn.prepareStatement(sql);) {

			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				RestaurantEntity restaurantEntity = new RestaurantEntity();

				restaurantEntity.setIdRestaurant(rs.getInt("ID_RESTAURANT"));
				restaurantEntity.setNameRestaurant(rs.getString("NAME_RESTAURANT"));
				restaurantEntity.setIdCity(rs.getString("ID_CITY"));
				restaurantEntity.setAddressRestaurant(rs.getString("ADDRESS_RESTAURANT"));
				restaurantEntity.setTelRestaurant(rs.getString("TEL_RESTAURANT"));
				restaurantEntity.setQualityRestaurant(rs.getInt("QUALITY_RESTAURANT"));
				restaurantEntity.setAvailable(rs.getInt("AVAILABLE"));
				restaurantEntity.setDesRestaurant(rs.getString("DES_RESTAURANT"));
				restaurantEntity.setIntroductRestaurant(rs.getString("INTRODUCE_RESTAURANT"));
				restaurantEntity.setImageRestaurant(rs.getString("IMAGE_RESTAURANT"));
				restaurantEntity.setIsDiscountRes(rs.getInt("ISDISCOUNT_RES"));
				restaurantEntity.setDiscountRes(rs.getInt("DISCOUNT_RES"));
				restaurantEntity.setPriceRestaurant(rs.getInt("PRICE_RESTAURANT"));
				restaurantEntity.setImageDetailRestaurant(rs.getString("IMAGE_DETAIL_RESTAURANT"));

				restaurantEntityList.add(restaurantEntity);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		return restaurantEntityList;
	}

	public RestaurantDto getRestauranById(String idRestaurant) {
		RestaurantDto restaurantDto = new RestaurantDto();
		conn = getConnection();
		StringBuilder sql = new StringBuilder();
		sql.append("  SELECT * FROM TRAVELGUIDE.DBO.RESTAURANT AS H");
		sql.append("  INNER JOIN TRAVELGUIDE.DBO.CITY AS C");
		sql.append("  ON H.ID_CITY = C.ID_CITY");
		sql.append("   WHERE ID_RESTAURANT = ?");
		try (PreparedStatement stmt = conn.prepareStatement(sql.toString());) {

			stmt.setString(1, idRestaurant);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {

				restaurantDto.setIdRestaurant(rs.getInt("ID_RESTAURANT"));
				restaurantDto.setNameRestaurant(rs.getString("NAME_RESTAURANT"));
				restaurantDto.setIdCity(rs.getString("ID_CITY"));
				restaurantDto.setTelRestaurant(rs.getString("TEL_RESTAURANT"));
				restaurantDto.setQualityRestaurant(rs.getInt("QUALITY_RESTAURANT"));
				restaurantDto.setAvailable(rs.getInt("AVAILABLE"));
				restaurantDto.setDesRestaurant(rs.getString("DES_RESTAURANT"));
				restaurantDto.setIntroductRestaurant(rs.getString("INTRODUCE_RESTAURANT"));
				restaurantDto.setImageRestaurant(rs.getString("IMAGE_RESTAURANT"));
				restaurantDto.setIsDiscountRes(rs.getInt("ISDISCOUNT_RES"));
				restaurantDto.setDiscountRes(rs.getInt("DISCOUNT_RES"));
				restaurantDto.setPriceRestaurant(rs.getInt("PRICE_RESTAURANT"));
				restaurantDto.setImageDetailRestaurant(rs.getString("IMAGE_DETAIL_RESTAURANT"));
				restaurantDto.setNameCity(rs.getString("NAME_CITY"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		return restaurantDto;
	}

	public List<RestaurantDto> getAllRestauran() {
		List<RestaurantDto> restaurantDtoList = new ArrayList<RestaurantDto>();

		conn = getConnection();
		StringBuilder sql = new StringBuilder();
		sql.append("  SELECT * FROM TRAVELGUIDE.DBO.RESTAURANT AS H");
		sql.append("  INNER JOIN TRAVELGUIDE.DBO.CITY AS C");
		sql.append("  ON H.ID_CITY = C.ID_CITY");
		try (PreparedStatement stmt = conn.prepareStatement(sql.toString());) {

			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				RestaurantDto restaurantDto = new RestaurantDto();

				restaurantDto.setIdRestaurant(rs.getInt("ID_RESTAURANT"));
				restaurantDto.setNameRestaurant(rs.getString("NAME_RESTAURANT"));
				restaurantDto.setIdCity(rs.getString("ID_CITY"));
				restaurantDto.setTelRestaurant(rs.getString("TEL_RESTAURANT"));
				restaurantDto.setQualityRestaurant(rs.getInt("QUALITY_RESTAURANT"));
				restaurantDto.setAvailable(rs.getInt("AVAILABLE"));
				restaurantDto.setDesRestaurant(rs.getString("DES_RESTAURANT"));
				restaurantDto.setIntroductRestaurant(rs.getString("INTRODUCE_RESTAURANT"));
				restaurantDto.setImageRestaurant(rs.getString("IMAGE_RESTAURANT"));
				restaurantDto.setIsDiscountRes(rs.getInt("ISDISCOUNT_RES"));
				restaurantDto.setDiscountRes(rs.getInt("DISCOUNT_RES"));
				restaurantDto.setPriceRestaurant(rs.getInt("PRICE_RESTAURANT"));
				restaurantDto.setImageDetailRestaurant(rs.getString("IMAGE_DETAIL_RESTAURANT"));
				restaurantDto.setNameCity(rs.getString("NAME_CITY"));

				restaurantDtoList.add(restaurantDto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		return restaurantDtoList;
	}

	public int countAllRestaurant(String searchStr, String city, String available, String quality, String priceMin, String priceMax, String discount) {
		int count = 0;
		conn = getConnection();
		StringBuilder sql = new StringBuilder();
		sql.append("  SELECT COUNT(*) FROM TRAVELGUIDE.DBO.RESTAURANT AS R");
		sql.append("  INNER JOIN TRAVELGUIDE.DBO.CITY AS C");
		sql.append("  ON R.ID_CITY = C.ID_CITY");
		sql.append("  WHERE 1 = 1 ");
		if (searchStr != null) {
			sql.append(" AND R.NAME_RESTAURANT like ?  ESCAPE '!'");
		}
		if (city != null && !city.isEmpty()) {
			sql.append(" AND C.NAME_CITY = ? ");
		}
		if (available != null) {
			if ("true".equals(available)) {
				sql.append(" AND R.AVAILABLE  = 1 ");
			} else {
				sql.append(" AND R.AVAILABLE  = 0 ");
			}
		}
		if (quality != null && !quality.isEmpty()) {
			sql.append(" AND R.QUALITY_RESTAURANT  >= ? ");
		}
		if(priceMin != null && priceMax != null) {
			sql.append(" AND R.PRICE_RESTAURANT  BETWEEN ? AND ? ");
		}
		if (discount != null) {
			if ("true".equals(discount)) {
				sql.append(" AND R.ISDISCOUNT_RES  = 1 ");
			} else {
				sql.append(" AND R.ISDISCOUNT_RES  = 0 ");
			}
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
			if(priceMin != null && priceMax != null) {
				stmt.setInt(index++, Integer.parseInt(priceMin));
				stmt.setInt(index++, Integer.parseInt(priceMax));
			}
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				count = Integer.parseInt(rs.getString(1));
				System.out.println(count);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		return count;
	}

	public List<RestaurantDto> getAllRestaurant(int offset) {
		List<RestaurantDto> restaurantDtoList = new ArrayList<>();

		conn = getConnection();
		StringBuilder sql = new StringBuilder();
		sql.append("  SELECT * FROM TRAVELGUIDE.DBO.RESTAURANT AS H");
		sql.append("  INNER JOIN TRAVELGUIDE.DBO.CITY AS C");
		sql.append("  ON H.ID_CITY = C.ID_CITY");
		sql.append("  ORDER BY H.ID_RESTAURANT");
		sql.append("  OFFSET ? ROWS");
		sql.append("  FETCH NEXT ? ROWS ONLY;");
		try (PreparedStatement stmt = conn.prepareStatement(sql.toString());) {

			stmt.setInt(1, offset);
			stmt.setInt(2, 3);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				RestaurantDto restaurantDto = new RestaurantDto();

				restaurantDto.setIdRestaurant(rs.getInt("ID_RESTAURANT"));
				restaurantDto.setNameRestaurant(rs.getString("NAME_RESTAURANT"));
				restaurantDto.setIdCity(rs.getString("ID_CITY"));
				restaurantDto.setTelRestaurant(rs.getString("TEL_RESTAURANT"));
				restaurantDto.setQualityRestaurant(rs.getInt("QUALITY_RESTAURANT"));
				restaurantDto.setAvailable(rs.getInt("AVAILABLE"));
				restaurantDto.setDesRestaurant(rs.getString("DES_RESTAURANT"));
				restaurantDto.setIntroductRestaurant(rs.getString("INTRODUCE_RESTAURANT"));
				restaurantDto.setImageRestaurant(rs.getString("IMAGE_RESTAURANT"));
				restaurantDto.setIsDiscountRes(rs.getInt("ISDISCOUNT_RES"));
				restaurantDto.setDiscountRes(rs.getInt("DISCOUNT_RES"));
				restaurantDto.setPriceRestaurant(rs.getInt("PRICE_RESTAURANT"));
				restaurantDto.setImageDetailRestaurant(rs.getString("IMAGE_DETAIL_RESTAURANT"));
				restaurantDto.setNameCity(rs.getString("NAME_CITY"));

				restaurantDtoList.add(restaurantDto);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		return restaurantDtoList;
	}

	public List<RestaurantDto> getAllRestauran(int offset, String searchStr, String city, String quality) {
		List<RestaurantDto> restaurantDtoList = new ArrayList<>();

		conn = getConnection();
		StringBuilder sql = new StringBuilder();
		sql.append("  SELECT * FROM TRAVELGUIDE.DBO.RESTAURANT AS T");
		sql.append("  INNER JOIN TRAVELGUIDE.DBO.CITY AS C");
		sql.append("  ON T.ID_CITY = C.ID_CITY");
		sql.append("  WHERE 1 = 1 ");

		if (searchStr != null) {
			sql.append(" AND T.NAME_RESTAURANT like ?  ESCAPE '!'");
		}
		if (city != null && !city.isEmpty()) {

			sql.append(" AND C.NAME_CITY = ? ");
		}
		if (quality != null && !quality.isEmpty()) {

			sql.append(" AND T.QUALITY_RESTAURANT  = ? ");
		}
		sql.append("  ORDER BY T.ID_RESTAURANT");
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
				RestaurantDto restaurantDto = new RestaurantDto();
				restaurantDto.setIdRestaurant(rs.getInt("ID_RESTAURANT"));
				restaurantDto.setNameRestaurant(rs.getString("NAME_RESTAURANT"));
				restaurantDto.setAddressRestaurant(rs.getString("ADDRESS_RESTAURANT"));
				restaurantDto.setIdCity(rs.getString("ID_CITY"));
				restaurantDto.setTelRestaurant(rs.getString("TEL_RESTAURANT"));
				restaurantDto.setQualityRestaurant(rs.getInt("QUALITY_RESTAURANT"));
				restaurantDto.setAvailable(rs.getInt("AVAILABLE"));
				restaurantDto.setDesRestaurant(rs.getString("DES_RESTAURANT"));
				restaurantDto.setIntroductRestaurant(rs.getString("INTRODUCE_RESTAURANT"));
				restaurantDto.setImageRestaurant(rs.getString("IMAGE_RESTAURANT"));
				restaurantDto.setIsDiscountRes(rs.getInt("ISDISCOUNT_RES"));
				restaurantDto.setDiscountRes(rs.getInt("DISCOUNT_RES"));
				restaurantDto.setPriceRestaurant(rs.getInt("PRICE_RESTAURANT"));
				restaurantDto.setImageDetailRestaurant(rs.getString("IMAGE_DETAIL_RESTAURANT"));
				restaurantDto.setNameCity(rs.getString("NAME_CITY"));

				restaurantDtoList.add(restaurantDto);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		return restaurantDtoList;
	}

}

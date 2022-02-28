package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.BaseConnection;
import entity.RestaurantEntity;

public class RestaurantDao extends BaseConnection {
	public List<RestaurantEntity> getRestaurants() {
		List<RestaurantEntity> restaurantEntityList = new ArrayList<>();
		conn = getConnection();
		String sql = "  select * from TravelGuide.dbo.RESTAURANT where QUALITY_RESTAURANT > 8";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
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
}

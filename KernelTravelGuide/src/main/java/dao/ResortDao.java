package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.BaseConnection;
import entity.ResortEntity;

public class ResortDao extends BaseConnection {
	public List<ResortEntity> getResorts() {
		List<ResortEntity> resortEntityList = new ArrayList<>();
		conn = getConnection();
		String sql = "  select * from TravelGuide.dbo.RESORT where QUALITY_RESORT > 8";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				ResortEntity resortEntity = new ResortEntity();
				
				resortEntity.setIdResort(rs.getInt("ID_RESORT"));
				resortEntity.setNameResort(rs.getString("NAME_RESORT"));
				resortEntity.setIdCity(rs.getString("ID_CITY"));
				resortEntity.setAddressResort(rs.getString("ADDRESS_RESORT"));
				resortEntity.setTelResort(rs.getString("TEL_RESORT"));
				resortEntity.setQualityResort(rs.getInt("QUALITY_RESORT"));
				resortEntity.setAvailable(rs.getInt("AVAILABLE"));
				resortEntity.setDesResort(rs.getString("DES_RESORT"));
				resortEntity.setImageResort(rs.getString("IMAGE_RESORT"));
				resortEntity.setIsDiscountResort(rs.getInt("ISDISCOUNT_RESORT"));
				resortEntity.setDiscountResort(rs.getInt("DISCOUNT_RESORT"));
				resortEntity.setPriceResort(rs.getInt("PRICE_RESORT"));
				resortEntity.setImageDetailResort(rs.getString("IMAGE_DETAIL_RESORT"));
				resortEntity.setIntroductResort(rs.getString("INTRODUCE_RESORT"));

				resortEntityList.add(resortEntity);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		return resortEntityList;
	}
}

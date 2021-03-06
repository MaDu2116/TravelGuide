package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.BaseConnection;
import dto.ResortDto;
import entity.ResortEntity;

public class ResortDao extends BaseConnection {
	public List<ResortEntity> getResorts() {
		List<ResortEntity> resortEntityList = new ArrayList<>();
		conn = getConnection();
		String sql = "select * from TravelGuide.dbo.RESORT where QUALITY_RESORT > 8";
		try (PreparedStatement stmt = conn.prepareStatement(sql);) {

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

	public ResortDto getResortById(String idResort) {
		ResortDto resortDto = new ResortDto();
		conn = getConnection();
		StringBuilder sql = new StringBuilder();
		sql.append(" SELECT * FROM TRAVELGUIDE.DBO.RESORT AS R");
		sql.append(" INNER JOIN TRAVELGUIDE.DBO.CITY AS C");
		sql.append(" ON R.ID_CITY = C.ID_CITY");
		sql.append(" WHERE ID_RESORT = ?");
		try (PreparedStatement stmt = conn.prepareStatement(sql.toString());) {

			stmt.setString(1, idResort);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {

				resortDto.setIdResort(rs.getInt("ID_RESORT"));
				resortDto.setNameResort(rs.getString("NAME_RESORT"));
				resortDto.setIdCity(rs.getString("ID_CITY"));
				resortDto.setAddressResort(rs.getString("ADDRESS_RESORT"));
				resortDto.setTelResort(rs.getString("TEL_RESORT"));
				resortDto.setQualityResort(rs.getInt("QUALITY_RESORT"));
				resortDto.setAvailable(rs.getInt("AVAILABLE"));
				resortDto.setDesResort(rs.getString("DES_RESORT"));
				resortDto.setImageResort(rs.getString("IMAGE_RESORT"));
				resortDto.setIsDiscountResort(rs.getInt("ISDISCOUNT_RESORT"));
				resortDto.setDiscountResort(rs.getInt("DISCOUNT_RESORT"));
				resortDto.setPriceResort(rs.getInt("PRICE_RESORT"));
				resortDto.setImageDetailResort(rs.getString("IMAGE_DETAIL_RESORT"));
				resortDto.setIntroductResort(rs.getString("INTRODUCE_RESORT"));
				resortDto.setNameCity(rs.getString("NAME_CITY"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		return resortDto;
	}

	public List<ResortDto> getAllResort() {
		List<ResortDto> resortDtoList = new ArrayList<ResortDto>();

		conn = getConnection();
		StringBuilder sql = new StringBuilder();
		sql.append(" SELECT * FROM TRAVELGUIDE.DBO.RESORT AS R");
		sql.append(" INNER JOIN TRAVELGUIDE.DBO.CITY AS C");
		sql.append(" ON R.ID_CITY = C.ID_CITY");
		try (PreparedStatement stmt = conn.prepareStatement(sql.toString());) {

			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				ResortDto resortDto = new ResortDto();

				resortDto.setIdResort(rs.getInt("ID_RESORT"));
				resortDto.setNameResort(rs.getString("NAME_RESORT"));
				resortDto.setIdCity(rs.getString("ID_CITY"));
				resortDto.setAddressResort(rs.getString("ADDRESS_RESORT"));
				resortDto.setTelResort(rs.getString("TEL_RESORT"));
				resortDto.setQualityResort(rs.getInt("QUALITY_RESORT"));
				resortDto.setAvailable(rs.getInt("AVAILABLE"));
				resortDto.setDesResort(rs.getString("DES_RESORT"));
				resortDto.setImageResort(rs.getString("IMAGE_RESORT"));
				resortDto.setIsDiscountResort(rs.getInt("ISDISCOUNT_RESORT"));
				resortDto.setDiscountResort(rs.getInt("DISCOUNT_RESORT"));
				resortDto.setPriceResort(rs.getInt("PRICE_RESORT"));
				resortDto.setImageDetailResort(rs.getString("IMAGE_DETAIL_RESORT"));
				resortDto.setIntroductResort(rs.getString("INTRODUCE_RESORT"));
				resortDto.setNameCity(rs.getString("NAME_CITY"));

				resortDtoList.add(resortDto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		return resortDtoList;
	}
	public int countAllResort(String searchStr, String city, String available, String quality, String minPrice, String maxPrice, String discount) {
		int count = 0;

		conn = getConnection();
		StringBuilder sql = new StringBuilder();
		sql.append("  SELECT COUNT(*) FROM TRAVELGUIDE.DBO.RESORT AS R");
		sql.append("  INNER JOIN TRAVELGUIDE.DBO.CITY AS C");
		sql.append("  ON R.ID_CITY = C.ID_CITY");
		if (searchStr != null && !searchStr.isEmpty()) {
			sql.append(" AND R.NAME_RESORT like ?  ESCAPE '!'");
		}
		if (city != null && !city.isEmpty()) {
			sql.append(" AND C.NAME_CITY = ? ");
		}
		if (available != null) {
			if ("true".equals(available)) {
				sql.append(" AND R.AVAILABLE = 1 ");
			} else {
				sql.append(" AND R.AVAILABLE = 0 ");
			}
		}
		if (quality != null && !quality.isEmpty()) {
			sql.append(" AND R.QUALITY_RESORT  >= ? ");
		}
		if(minPrice != null && maxPrice != null && !"0".equals(maxPrice)) {
			sql.append(" AND R.PRICE_RESORT  BETWEEN ? AND ? ");
		}
		if (discount != null) {
			if ("true".equals(discount)) {
				sql.append(" AND R.ISDISCOUNT_RESORT  = 1 ");
			} else {
				sql.append(" AND R.ISDISCOUNT_RESORT  = 0 ");
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

	public List<ResortDto> getAllResort(int offset, String searchStr, String city, String available, String quality, String minPrice, String maxPrice, String discount) {
		List<ResortDto> resortDtoList = new ArrayList<>();

		conn = getConnection();
		StringBuilder sql = new StringBuilder();
		sql.append("  SELECT * FROM TRAVELGUIDE.DBO.RESORT AS R");
		sql.append("  INNER JOIN TRAVELGUIDE.DBO.CITY AS C");
		sql.append("  ON R.ID_CITY = C.ID_CITY");
		if (searchStr != null && !searchStr.isEmpty()) {
			sql.append(" AND R.NAME_RESORT like ?  ESCAPE '!'");
		}
		if (city != null && !city.isEmpty()) {
			sql.append(" AND C.NAME_CITY = ? ");
		}
		if (available != null) {
			if ("true".equals(available)) {
				sql.append(" AND R.AVAILABLE = 1 ");
			} else {
				sql.append(" AND R.AVAILABLE = 0 ");
			}
		}
		if (quality != null && !quality.isEmpty()) {
			sql.append(" AND R.QUALITY_RESORT  >= ? ");
		}
		if(minPrice != null && maxPrice != null && !"0".equals(maxPrice)) {
			sql.append(" AND R.PRICE_RESORT  BETWEEN ? AND ? ");
		}
		if (discount != null) {
			if ("true".equals(discount)) {
				sql.append(" AND R.ISDISCOUNT_RESORT  = 1 ");
			} else {
				sql.append(" AND R.ISDISCOUNT_RESORT  = 0 ");
			}
		}
		sql.append("  ORDER BY R.ID_RESORT");
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
				ResortDto resortDto = new ResortDto();

				resortDto.setIdResort(rs.getInt("ID_RESORT"));
				resortDto.setNameResort(rs.getString("NAME_RESORT"));
				resortDto.setIdCity(rs.getString("ID_CITY"));
				resortDto.setAddressResort(rs.getString("ADDRESS_RESORT"));
				resortDto.setTelResort(rs.getString("TEL_RESORT"));
				resortDto.setQualityResort(rs.getInt("QUALITY_RESORT"));
				resortDto.setAvailable(rs.getInt("AVAILABLE"));
				resortDto.setDesResort(rs.getString("DES_RESORT"));
				resortDto.setImageResort(rs.getString("IMAGE_RESORT"));
				resortDto.setIsDiscountResort(rs.getInt("ISDISCOUNT_RESORT"));
				resortDto.setDiscountResort(rs.getInt("DISCOUNT_RESORT"));
				resortDto.setPriceResort(rs.getInt("PRICE_RESORT"));
				resortDto.setImageDetailResort(rs.getString("IMAGE_DETAIL_RESORT"));
				resortDto.setIntroductResort(rs.getString("INTRODUCE_RESORT"));
				resortDto.setNameCity(rs.getString("NAME_CITY"));

				resortDtoList.add(resortDto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		return resortDtoList;
	}
}

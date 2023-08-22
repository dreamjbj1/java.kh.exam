package test1.jdbckh.member.model.dao;

import static test1.jdbckh.common.jdbc.JdbcTemplate.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import test1.jdbckh.common.jdbc.JdbcTemplate;
import test1.jdbckh.member.model.dto.MemberDto;
import static test1.jdbckh.common.jdbc.JdbcTemplate.*;

public class MemberDao {
	
	public int insertMember(Connection conn, MemberDto dto) {
		System.out.println("[insertMember dao] dto: "+dto);
		int result = 0;
		String query = "insert into CUSTOMER_INFO VALUES (seq_no.nextval,?,?,?,to_date(?,'yyyy-mm-dd'),?,?)";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(query);
//			pstmt.setInt(1, dto.getCustNo());
				pstmt.setString(1, dto.getCustName());
				pstmt.setString(2, dto.getPhone());
				pstmt.setString(3, dto.getAddress());
				pstmt.setString(4, dto.getJoinDate());
				pstmt.setString(5, dto.getGrade());
				pstmt.setString(6, dto.getCity());
				result = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		System.out.println("[insertMember dao result]"+result);
		return result;
	}
	public MemberDto selectOne(Connection conn, int custNo) {
		MemberDto result = null;
		String query = "select CUSTNO, CUSTNAME, PHONE, ADDRESS, JOINDATE, GRADE, CITY FROM CUSTOMER_INFO WHERE CUSTNO = ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, custNo);
			rs = pstmt.executeQuery();	
		if(rs.next()) {
			result = new MemberDto(rs.getInt("CustNo"), rs.getString("custName"), rs.getString("Phone"), rs.getString("Address"),
					rs.getString("joinDate"), rs.getString("Grade"), rs.getString("City"));
		}
		
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(rs);
			JdbcTemplate.close(pstmt);
		}
	return result;
	}
// 전체 테이블 나오기 
	public List<MemberDto> MemberList() {
		
			List<MemberDto> result = null;
			
			String query = "select CUSTNO, CUSTNAME, PHONE, ADDRESS, to_char(joinDate, 'yyyy/mm/dd') AS joindate, Grade, City from CUSTOMER_INFO";
			Connection conn = null;
//			Statement stmt = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			try{
				conn = getConnection();
				pstmt = conn.prepareStatement(query);
				rs = pstmt.executeQuery();
			
				result = new ArrayList<MemberDto>();
				while(rs.next() == true) {
					MemberDto dto = new MemberDto();
					dto.setCustNo(rs.getInt("CustNo"));
					dto.setCustName(rs.getString("CustName"));
					dto.setPhone(rs.getString("phone"));
					dto.setAddress(rs.getString("Address"));
					dto.setJoinDate(rs.getString("joinDate"));
					dto.setGrade(rs.getString("Grade"));
					dto.setCity(rs.getString("City"));
	
					result.add(dto);	
				}
				
			} catch (SQLException e) {
//				2. dbms에 연결 실패.
				e.printStackTrace();	
			} finally {
				close(rs);
				close(pstmt);
				close(conn);
			}
//			System.out.println(result);
			return result;
		} // FUNCTION
	
	public int update(Connection conn, MemberDto dto) {
		System.out.println("[Member Dao update] dto:" + dto);
		int result = -1;  // update 경우 0도 정상 결과값일 수 있으므로 -1을 초기값
		String query = "UPDATE CUSTOMER_INFO SET CUSTNAME=?, PHONE=?, ADDRESS=?,"
				+ " JOINDATE=?, GRADE=?, CITY=? WHERE CUSTNO = ?";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, dto.getCustName());
			pstmt.setString(2, dto.getPhone());
			pstmt.setString(3, dto.getAddress());
			pstmt.setString(4, dto.getJoinDate());
			pstmt.setString(5, dto.getGrade());
			pstmt.setString(6, dto.getCity());
			pstmt.setInt(7, dto.getCustNo());
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
	    } finally {
	        try {
	            if (pstmt != null) {
	                pstmt.close();
	            }
	        } catch (SQLException e) {
	            e.printStackTrace(); // Handle the exception appropriately
	        }
	    }
	    System.out.println("[Member Dao update] return:" + result);
	    return result;
	}
	
	
}// CLASS
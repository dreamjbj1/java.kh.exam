package test1.jdbckh.money.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import test1.jdbckh.money.dto.MoneyDto;


public class MoneyDao {
	public List<MoneyDto> selectListMoney() {
		List<MoneyDto> result = null;
		String query = "SELECT * from money";
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		
		
			try{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "jbj", "jbj");
				pstmt = conn.prepareStatement(query);
				ResultSet rs = pstmt.executeQuery();
				
				result = new ArrayList<MoneyDto>();
				while(rs.next() == true) {
					MoneyDto dto = new MoneyDto();
					dto.setCustNo(rs.getInt("CustNo"));
					dto.setCustName(rs.getString("CustName"));
					dto.setGrade(rs.getString("Grade"));
					dto.setTotal(rs.getInt("Total"));
					
					result.add(dto);
				}
				
			} catch (ClassNotFoundException e) {
//				1. driver (ojdbc.jar)  없음
				e.printStackTrace();
			} catch (SQLException e) {
//				2. dbms에 연결 실패.
				e.printStackTrace();	
			} finally {
				try {
					if(pstmt != null) {
						pstmt.close();	
					}
					if(stmt != null) {
						stmt.close();
					}
					if (conn != null) {
						conn.close();
					}
				}
				catch(SQLException e) {
					e.printStackTrace();	
				}
			}	
	
			
			return result;
		} // FUNCTION
	
	
	
	
}// CLASS

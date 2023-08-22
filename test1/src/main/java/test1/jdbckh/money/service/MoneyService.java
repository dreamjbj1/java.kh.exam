package test1.jdbckh.money.service;

import java.sql.Connection;
import java.util.List;

import test1.jdbckh.money.dao.MoneyDao;
import test1.jdbckh.money.dto.MoneyDto;

import static test1.jdbckh.common.jdbc.JdbcTemplate.*;

public class MoneyService {
	private MoneyDao dao = new MoneyDao();
	
	public List<MoneyDto> selectListMoney() {
		Connection conn = getConnection(); 
		List<MoneyDto> result = dao.selectListMoney();
		close(conn);
		return result;
	}
}

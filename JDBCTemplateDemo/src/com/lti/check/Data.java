package com.lti.check;

import java.sql.Types;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;

@Component
public class Data {
@Autowired
private DataSource dataSource;
private SimpleJdbcCall jdbcCall;

@PostConstruct
public void init()
{
JdbcTemplate template = new JdbcTemplate(dataSource);
jdbcCall = new SimpleJdbcCall(template)
.withProcedureName("get_sum")
.withSchemaName("hr")
.declareParameters(
		new SqlParameter("first_num", Types.INTEGER),
		new SqlParameter("second_num", Types.INTEGER),
		new SqlOutParameter("theSum", Types.INTEGER));
}

public void findSum()
{
	MapSqlParameterSource paramMap = new MapSqlParameterSource()
			.addValue("first_num", 5)
			.addValue("second_num", 20);
	Map<String, Object> resultMap = jdbcCall.execute(paramMap);
	System.out.println(resultMap);

}
	
}

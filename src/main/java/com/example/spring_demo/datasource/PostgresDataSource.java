package com.example.spring_demo.datasource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PostgresDataSource 
{
	@Bean
	@ConfigurationProperties("app.datasource")
	public HikariDataSource hikariDataSource()
	{
		HikariDataSource hikariDataSource;
		HikariConfig hikariConfig = new HikariConfig();

		hikariConfig.setJdbcUrl("jdbc:hsqldb:hsql://postgres://koicciziwdtamp:e3535d3fdb967f4baedc84c13e5b10a6de42ee9f93d89b3e11e8309cf62b8192@ec2-3-208-50-226.compute-1.amazonaws.com:5432/d3pt1eea165k59");
		hikariConfig.setDriverClassName("org.hsqldb.jdbc.JDBCDriver");
		hikariConfig.setUsername("koicciziwdtamp");
		hikariConfig.setPassword("e3535d3fdb967f4baedc84c13e5b10a6de42ee9f93d89b3e11e8309cf62b8192");

		return DataSourceBuilder.create().type(HikariDataSource.class).build();
	}

}

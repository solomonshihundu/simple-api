package com.example.spring_demo.datasource;

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
			HikariDataSource hikariDataSource =	DataSourceBuilder.create().type(HikariDataSource.class).build();
		    //hikariDataSource.setDriverClassName("");

			return hikariDataSource;
	}

}

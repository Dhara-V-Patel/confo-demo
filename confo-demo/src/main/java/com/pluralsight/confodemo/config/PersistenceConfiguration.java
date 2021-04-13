package com.pluralsight.confodemo.config;

import javax.sql.DataSource;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersistenceConfiguration {

  @Bean
  public DataSource dataSource(){
    DataSourceBuilder builder = DataSourceBuilder.create();
    builder.url("jdbc:mysql://localhost/confo_demo");
    builder.password("root");
    builder.username("root");
    System.out.println("My custom datasource bean has been initialized and set");
    return builder.build();
  }
}

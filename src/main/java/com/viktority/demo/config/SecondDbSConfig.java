package com.viktority.demo.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "secondEntityManagerFactory", transactionManagerRef = "secondTransactionManager", basePackages = {
		"com.viktority.demo.second.repositories" })
public class SecondDbSConfig {

	@Value("${spring.datasource.driver-class-name}")
	String driverClassName;

	@Bean(name = "secondDataSource")
	@ConfigurationProperties(prefix = "second.datasource")
	public DataSource dataSource() {
		return DataSourceBuilder.create().driverClassName(driverClassName).build();
	}

	@Bean(name = "secondEntityManagerFactory")
	public LocalContainerEntityManagerFactoryBean secondEntityManagerFactory(EntityManagerFactoryBuilder builder,
			@Qualifier("secondDataSource") DataSource dataSource) {
		return builder.dataSource(dataSource).packages("com.viktority.demo.second.entities")
				.build();
	}

	@Bean(name = "secondTransactionManager")
	public PlatformTransactionManager lmsTransactionManager(
			@Qualifier("secondEntityManagerFactory") EntityManagerFactory secondEntityManagerFactory) {
		return new JpaTransactionManager(secondEntityManagerFactory);
	}

}

package com.shubham.hiber;

import java.beans.PropertyVetoException;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.mchange.v2.c3p0.ComboPooledDataSource;

//@Configuration

@EnableTransactionManagement
public class Config {


    
	@Bean
	public DataSource dataSource() throws PropertyVetoException
	{
		ComboPooledDataSource dataSource = new ComboPooledDataSource(); 
		//database connection information
		dataSource.setDriverClass("com.mysql.jdbc.Driver");
		dataSource.setJdbcUrl( "dbc:mysql://localhost/ecommerce" ); 
		dataSource.setUser("root"); 
		dataSource.setPassword("0000");
				
		return dataSource;		
	}  
		
	 
    @Bean
    public LocalSessionFactoryBean sessionFactory() throws PropertyVetoException {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        sessionFactory.setPackagesToScan("com.shubham.hiber");
        sessionFactory.setHibernateProperties(hibernateProperties());
 
        return sessionFactory;
    }
	
 
 /*   @Bean
    public DataSource dataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUrl("jdbc:h2:mem:db;DB_CLOSE_DELAY=-1");
        dataSource.setUsername("sa");
        dataSource.setPassword("sa");
 
        return dataSource;
    }
 */
    @Bean
    public PlatformTransactionManager hibernateTransactionManager() throws PropertyVetoException {
        HibernateTransactionManager transactionManager
          = new HibernateTransactionManager();
        transactionManager.setSessionFactory(sessionFactory().getObject());
        return transactionManager;
    }
 
    private final Properties hibernateProperties() {
        Properties hibernateProperties = new Properties();
        hibernateProperties.setProperty(
          "hibernate.hbm2ddl.auto", "update");
        hibernateProperties.setProperty(
          "hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
 
        return hibernateProperties;
    }
}
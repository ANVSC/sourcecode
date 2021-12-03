package org.rgjay.hibernateConfig;

import java.util.Properties;

import javax.sql.DataSource;

import org.rgjay.persistanceConfig.HibernateTemplateSpringGenericDAO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EnableTransactionManagement
public class DatasourceConfiguration {
	
	@Value("${db.driver}")
	private String DB_DRIVER;

	@Value("${db.password}")
	private String DB_PASSWORD;
	
	@Value("${db.username}")
	private String DB_USERNAME;

	@Value("${db.url}")
	private String DB_URL;
	
	@Value("${entitymanager.packagesToScan}")
	private String ENTITYMANAGER_PACKAGES_TO_SCAN;
	
	@Value("${hibernate.dialect}")
	private String HIBERNATE_DIALECT;

	@Value("${hibernate.show_sql}")
	private String HIBERNATE_SHOW_SQL;

	@Value("${hibernate.hbm2ddl.auto}")
	private String HIBERNATE_HBM2DDL_AUTO;
	
	@Bean(name = "dataSource")
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(DB_DRIVER);
		dataSource.setUrl(DB_URL);
		dataSource.setUsername(DB_USERNAME);
		dataSource.setPassword(DB_PASSWORD);
		return dataSource;
	}

	@Bean(name = "sessionFactory")
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setPackagesToScan(ENTITYMANAGER_PACKAGES_TO_SCAN);
		Properties hibernateProperties = new Properties();
		hibernateProperties.setProperty("hibernate.dialect", HIBERNATE_DIALECT);
		hibernateProperties.setProperty("hibernate.show_sql", HIBERNATE_SHOW_SQL);
		hibernateProperties.setProperty("hibernate.hbm2ddl.auto", HIBERNATE_HBM2DDL_AUTO);
		hibernateProperties.setProperty("hibernate.temp.use_jdbc_metadata_defaults", "false");
		hibernateProperties.setProperty("hibernate.connection.release_mode", "auto");
		hibernateProperties.setProperty("hibernate.connection.isolation", "2");
		sessionFactory.setHibernateProperties(hibernateProperties);
		return sessionFactory;
	}

	@Bean(name = "transactionManager")
	public PlatformTransactionManager transactionManager(
			@Qualifier("sessionFactory") LocalSessionFactoryBean sessFactory) {
		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(sessFactory.getObject());
		txManager.setDataSource(dataSource());
		return txManager;
	}

	@Bean(name = "enterpriseHibernateTemplate")
	public HibernateTemplate enterpriseHibernateTemplate() {
		HibernateTemplate hibernateTemplate = new HibernateTemplate();
		hibernateTemplate.setSessionFactory(sessionFactory().getObject());
		return hibernateTemplate;
	}

	@Bean(name = "genericDao")
	public HibernateTemplateSpringGenericDAO genericDao() {
		HibernateTemplateSpringGenericDAO template = new HibernateTemplateSpringGenericDAO();
		template.setHibernateTemplate(enterpriseHibernateTemplate());
		System.out.println("Rgjay DB CONFIGURED");
		return template;
	}

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.miruta2017.test.config;

import com.alex.miruta2017.interfaces.RepositorioParada;
import com.alex.miruta2017.model.Parada;
//import javax.activation.DataSource;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author alextc6
 */
@Configuration
// permite operaciones con la DB
@EnableTransactionManagement
// el repositorio q se requiere
@EnableJpaRepositories( basePackageClasses = RepositorioParada.class )
public class ParadaConfig {
    
    // los datos de la conexion a la DB
    @Bean
//    @Primary
//    @ConfigurationProperties(prefix="spring.datasource")
    public DataSource dataSource(){
       DriverManagerDataSource dataSource = new DriverManagerDataSource();
       dataSource.setDriverClassName("org.postgresql.Driver");
       dataSource.setUrl("jdbc:postgresql://localhost:5432/miruta2017");
       dataSource.setUsername( "alexMiRuta" );
       dataSource.setPassword( "miruta2017" );
       return dataSource;
       

//       return DataSourceBuilder.create().build();
    }

//    @Bean
//    public EntityManagerFactory entityManagerFactory()
//    {
//        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//        vendorAdapter.setGenerateDdl( true );
//
//        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
//        factory.setJpaVendorAdapter( vendorAdapter );
//        factory.setPackagesToScan( Parada.class.getPackage().getName() );
//        factory.setDataSource( dataSource() );
//        factory.afterPropertiesSet();
//
//        return factory.getObject();
//    }
    
    // creacion del entity manager con los datos de la conexion establecidos
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
       LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
       em.setDataSource(dataSource());
       em.setPackagesToScan( Parada.class.getPackage().getName());

       JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
       em.setJpaVendorAdapter(vendorAdapter);
//       em.setJpaProperties(additionalProperties());

       return em;
    }
    
    // permite operaciones con la DB
    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory emf){
       JpaTransactionManager transactionManager = new JpaTransactionManager();
       transactionManager.setEntityManagerFactory(emf);

       return transactionManager;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.miruta2017.test.config;

import com.alex.miruta2017.interfaces.RepositorioParada;
import com.alex.miruta2017.interfaces.RepositorioPtoInteres;
import com.alex.miruta2017.interfaces.RepositorioUsuario;
import com.alex.miruta2017.model.Parada;
import java.util.Properties;
//import javax.activation.DataSource;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 *
 * @author alextc6
 */
@Configuration
// permite operaciones con la DB
@EnableTransactionManagement
// el repositorio q se requiere
//@EnableJpaRepositories( basePackageClasses = RepositorioParada.class )
//@EnableJpaRepositories( basePackageClasses = RepositorioPtoInteres.class )
//@EnableJpaRepositories( basePackageClasses = RepositorioUsuario.class )
// se indican que tenga en cuenta los repositorios creados
@EnableJpaRepositories
public class ConfigTest {
    
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
    
    // creacion del entity manager con los datos de la conexion establecidos
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
       LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
       em.setDataSource(dataSource());
       em.setPackagesToScan(Parada.class.getPackage().getName());

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


//@Configuration
//// permite operaciones con la DB
//@EnableTransactionManagement
////Enables Spring's annotations
//@EnableWebMvc
//// el repositorio q se requiere
//@EnableJpaRepositories( basePackageClasses = RepositorioParada.class )
//
//@PropertySource(value = {"classpath:application.properties"})

//public class ConfigTest {
//    
//    // los datos de la conexion a la DB
//    @Bean
//    @Primary
//    // lo conectamos con los datos que se encuentran en "application.properties"
//    @ConfigurationProperties(prefix="spring.datasource")
//    public DataSource dataSource(){
////        System.out.println("Url obtenida: "+this.DataSourceProperties.getUrl());
//       return DataSourceBuilder.create().build();
//    }
//    
//    // creacion del entity manager con los datos de la conexion establecidos
//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
//       LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
//       em.setDataSource(dataSource());
//       em.setPackagesToScan( PuntoInteres.class.getPackage().getName());
//
//       JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//       em.setJpaVendorAdapter(vendorAdapter);
////       em.setJpaProperties(additionalProperties());
//
//       return em;
//    }
//    
//    // permite operaciones con la DB
//    @Bean
//    public PlatformTransactionManager transactionManager(EntityManagerFactory emf){
//       JpaTransactionManager transactionManager = new JpaTransactionManager();
//       transactionManager.setEntityManagerFactory(emf);
//
//       return transactionManager;
//    }
//}

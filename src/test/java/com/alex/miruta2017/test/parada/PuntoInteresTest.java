/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.miruta2017.test.parada;

import com.alex.miruta2017.interfaces.RepositorioPtoInteres;
import com.alex.miruta2017.model.PuntoInteres;
import com.alex.miruta2017.test.config.ConfigTest;
import com.alex.miruta2017.test.parada.PuntoInteresTest.TestController;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author alextc6
 */
@EnableJpaRepositories("com.alex.miruta2017.interfaces")
// para reconocer las anotaciones
@RunWith(SpringRunner.class)
@ContextConfiguration( classes = { TestController.class, ConfigTest.class} )
@SpringBootTest
public class PuntoInteresTest {
    
    public PuntoInteresTest(){}
    
    @Autowired
    private TestController contTest;
    
    @Test
    public void test(){
        Iterable<PuntoInteres> list = contTest.findAll();

        if ( list == null || !list.iterator().hasNext() ){
            Assert.fail( "No se encontraron puntos de interes" );
        }
        else{
            for ( PuntoInteres puntoInteres : list ){
                System.out.println( "Puntos de interes encontrados: " + puntoInteres.toString());
            }
        }
        
        assertThat(contTest.findAll())
            .hasSize(2);
//        System.out.println("Salto es test!!!!!");
    }
    
    @Component
    static class TestController{
        @Autowired
        private RepositorioPtoInteres repo;

        /**
         * @return
         */
        public Iterable<PuntoInteres> findAll(){
            return repo.findAll();
        }
    }
    
}

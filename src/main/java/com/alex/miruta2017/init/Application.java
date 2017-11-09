/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.miruta2017.init;

import com.alex.miruta2017.interfaces.RepositorioParada;
import com.alex.miruta2017.interfaces.RepositorioUsuario;
import com.alex.miruta2017.model.Parada;
import com.alex.miruta2017.model.Usuario;
import org.postgis.Point;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import com.alex.miruta2017.interfaces.RepositorioUsuario;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 *
 * @author alextc6
 */

@SpringBootApplication
//@ComponentScan({"com.delivery.request"})
// indicamos que las entidades a tener en cuenta a la hora de creacion de las mismas se encuentran en dicho paquete
@EntityScan("com.alex.miruta2017.model")
// especificamos donde se encuentran los repositorios que vamos a usar para trabajar con las entidades creadas
@EnableJpaRepositories("com.alex.miruta2017.interfaces")
public class Application {
    
    private static final Logger log = LoggerFactory.getLogger(Application.class);
    
    public static void main(String[] args) {
//		SpringApplication.run(Application.class, args);
                SpringApplication.run(com.alex.miruta2017.init.Application.class);
    }
    
    // anotacion para indicar que se ejecute este procedimiento
    // CommandLineRunner: para correr algún código específico al arranque de la aplicación con Spring Boot
    @Bean
    public CommandLineRunner testParada(RepositorioParada repositorio) {
		return (args) -> {
//                        Parada p;
//			// guardamos algunas paradas
//                        p = new Parada("ranchoLider",new Point(-65.0435781612698, -42.76403644138906));
//			repositorio.save(p);
//                        log.info("Se creo el rancho del lider - Punto: "+p.toString());
//                        p = new Parada("unRanchito", new Point(-65.04562200453915, -42.75792890613414));
//			repositorio.save(p);
//                        log.info("Se creo el otro rancho - Punto: "+p.toString());


			// buscamos todas las paradas a modo de prueba
			log.info("**** Paradas encontradas con findAll(): ****");
			for (Parada parada : repositorio.findAll()) {
				log.info(parada.toString());
			}
			log.info("********************************************");

			// fetch an individual customer by ID
//			Customer customer = repository.findOne(1L);
//			log.info("Customer found with findOne(1L):");
//			log.info("--------------------------------");
//			log.info(customer.toString());
//			log.info("");

			// fetch customers by last name
//			log.info("Customer found with findByLastName('Bauer'):");
//			log.info("--------------------------------------------");
//			for (Customer bauer : repository.findByLastName("Bauer")) {
//				log.info(bauer.toString());
//			}
//			log.info("");
		};
	}
    
    @Bean
    public CommandLineRunner testUsuario(RepositorioUsuario repositorio) {
        return (args) -> {
            Usuario u;
			// guardamos algunas paradas
//                        u = new Usuario("lider", "123", "mailLider");
//			repositorio.save(u);
//                        log.info("Se creo el usuario del lider - "+u.toString());
//                        u = new Usuario("alex", "111", "mail");
//			repositorio.save(u);
//                        log.info("Se creo el usuario mio - "+u.toString());


			// buscamos todas las paradas a modo de prueba
			log.info("**** Usuarios encontrados con findAll(): ****");
			for (Usuario usuario : repositorio.findAll()) {
				log.info(usuario.toString());
			}
			log.info("*********************************************");
        };
    }
    
}

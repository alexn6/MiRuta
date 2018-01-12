/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.miruta2017.init;

import com.alex.miruta2017.interfaces.RepositorioEmpresa;
import com.alex.miruta2017.interfaces.RepositorioParada;
import com.alex.miruta2017.interfaces.RepositorioPtoInteres;
import com.alex.miruta2017.interfaces.RepositorioRecorrido;
import com.alex.miruta2017.interfaces.RepositorioUnidadTransporte;
import com.alex.miruta2017.interfaces.RepositorioUsuario;
import com.alex.miruta2017.model.Empresa;
import com.alex.miruta2017.model.Parada;
import com.alex.miruta2017.model.PuntoInteres;
import com.alex.miruta2017.model.Recorrido;
import com.alex.miruta2017.model.UnidadTransporte;
import com.alex.miruta2017.model.Usuario;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
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
    
//  ############################################################################################################    
//  ################################### Datos independientes - 1ra tanda #######################################

//    ####################################################################################
//    ##################################### Parada ######################################
    // anotacion para indicar que se ejecute este procedimiento
    // CommandLineRunner: para correr algún código específico al arranque de la aplicación con Spring Boot
    @Bean
    public CommandLineRunner cargaInicialParada(RepositorioParada repositorio) {
        return (args) -> {
//            Parada p;
//            // guardamos algunas paradas
//            p = new Parada("ranchoLider",new Point(-65.0435781612698, -42.76403644138906));
//            repositorio.save(p);
//            log.info("Se creo una parada en el rancho del lider - Punto: "+p.toString());
//            p = new Parada("unRanchito", new Point(-65.04562200453915, -42.75792890613414));
//            repositorio.save(p);
//            log.info("Se creo una parada en el otro rancho - Punto: "+p.toString());
//
//
//            // buscamos todas las paradas a modo de prueba
//            log.info("**** Paradas encontradas con findAll(): ****");
//            for (Parada parada : repositorio.findAll()) {
//                log.info(parada.toString());
//            }
//            log.info("********************************************");
	};
    }

//    ###############################################################################
//    ################################### Usuario ################################### 
    @Bean
    public CommandLineRunner cargaInicialUsuario(RepositorioUsuario repositorio) {
        return (args) -> {
//            Usuario u;
//            // guardamos algunos usuarios
//            u = new Usuario("lider", "123", "mailLider");
//            repositorio.save(u);
//            log.info("Se creo el usuario del lider - "+u.toString());
//            u = new Usuario("alex", "111", "mail");
//            repositorio.save(u);
//            log.info("Se creo el usuario mio - "+u.toString());
//
//            // buscamos todas las paradas a modo de prueba
//            log.info("**** Usuarios encontrados con findAll(): ****");
//            for (Usuario usuario : repositorio.findAll()) {
//                log.info(usuario.toString());
//            }
//            log.info("*********************************************");
        };
    }
    
//    ####################################################################################
//    ##################################### Empresa ######################################
    @Bean
    public CommandLineRunner cargaInicialEmpresas(RepositorioEmpresa repoEmpresa) {
        return (args) -> {
//            Empresa emp;
//            
//            emp = new Empresa("Benitez", "23-23456789-2", "benitez@gmail.com", "4474536");
//            repoEmpresa.save(emp);
//            log.info("Se creo la empresa BENITEZ");
//            
//            emp = new Empresa("Ceferino", "25-23251789-0", "ceferino@gmail.com", "4471256");
//            repoEmpresa.save(emp);
//            log.info("Se creo la empresa CEFERINO");
//
//            // buscamos todas las paradas a modo de prueba
//            log.info("**** Empresas guardadas: ****");
//            for (Empresa empresa : repoEmpresa.findAll()) {
//                log.info(empresa.toString());
//            }
//            log.info("*********************************************");
        };
    }
    
//  ############################################################################################################
//  ############################################################################################################


//  ############################################################################################################
//  ################################### Datos dependientes de l a1ra tanda #####################################

//    ####################################################################################
//    ################################### PuntoInteres ###################################
    @Bean
    public CommandLineRunner cargaInicialPtoInteres(RepositorioPtoInteres repoPtoInteres, RepositorioUsuario repoUsuario) {
        return (args) -> {
//            PuntoInteres ptoInt;
//            // guardamos algunos puntos
//            ptoInt = new PuntoInteres("ranchoLider", new Point(-65.0435781612698, -42.76403644138906), repoUsuario.findOne(3L));
//            repoPtoInteres.save(ptoInt);
//            log.info("Se creo el punto 1");
//            ptoInt = new PuntoInteres("unRanchito", new Point(-65.04562200453915, -42.75792890613414), repoUsuario.findOne(4L));
//            repoPtoInteres.save(ptoInt);
//            log.info("Se creo el punto 2");
//
//
//            // buscamos todas las paradas a modo de prueba
//            log.info("**** Punto de Interes encontrados con findAll(): ****");
//            for (PuntoInteres punto : repoPtoInteres.findAll()) {
//                log.info(punto.toString());
//            }
//            log.info("*********************************************");
        };
    }
    
//    ####################################################################################
//    ############################ Unidad de transportes #################################
    @Bean
    public CommandLineRunner cargaInicialUnidadTransporte(RepositorioUnidadTransporte repoUniTransporte, RepositorioEmpresa repoEmpresa) {
        return (args) -> {
//            UnidadTransporte unidad;
//            unidad = new UnidadTransporte("Unidad1", LocalTime.of(8, 0), LocalTime.of(22, 0), "20", "9.50", repoEmpresa.findOne(8L));
//            repoUniTransporte.save(unidad);
//            log.info("Se guardo la unidad 1");
//            
//            unidad = new UnidadTransporte("Unidad2", LocalTime.of(7, 30), LocalTime.of(22, 15), "15", "11.00", repoEmpresa.findOne(9L));
//            repoUniTransporte.save(unidad);
//            log.info("Se guardo la unidad 2");
//
//            // buscamos todas las paradas a modo de prueba
//            log.info("**** Unidades de transporte guardadas: ****");
//            for (UnidadTransporte unidadT : repoUniTransporte.findAll()) {
//                log.info(unidadT.toString());
//            }
//            log.info("*********************************************");
        };
    }
    
//    ######################################################################################
//    ##################################### Recorrido ######################################
    @Bean
    public CommandLineRunner cargaInicialRecorrido(RepositorioRecorrido repoRecorrido,
                                        RepositorioParada repoParada, RepositorioUnidadTransporte repoUniTRansporte) {
        return (args) -> {
//            Recorrido reco;
//            Parada parada;
//            List<Parada> paradas = new ArrayList<>();
//            
//            // creamos y agregamos las paradas al recorrido
//            parada = new Parada("p1", new Point(-42.77347646555213, -65.04964397695699));
//            paradas.add(parada);
//            parada = new Parada("p2", new Point(-42.77303150153067, -65.04829214361348));
//            paradas.add(parada);
//            parada = new Parada("p3", new Point(-42.772598347642486, -65.0469993188683));
//            paradas.add(parada);
//            parada = new Parada("p4", new Point(-42.77214943950719, -65.04572795179524));
//            paradas.add(parada);
//            
//            // guardamos algunos recorridos
//            reco = new Recorrido("blanco", paradas, repoUniTRansporte.findOne(9L));
//            repoRecorrido.save(reco);
//            log.info("Se creo el recorrido 1: "+reco.toString());
//            
//            parada = new Parada("p11", new Point(-42.76980246330086, -65.0503306224648));
//            paradas.add(parada);
//            parada = new Parada("p22", new Point(-42.769349596918005, -65.0491236284081));
//            paradas.add(parada);
//            parada = new Parada("p33", new Point(-42.7688140289225, -65.048565728933));
//            paradas.add(parada);
//
//            // guardamos algunos recorridos
//            reco = new Recorrido("gris", paradas, repoUniTRansporte.findOne(9L));
//            repoRecorrido.save(reco);
//            log.info("Se creo el recorrido 2: "+reco.toString());
//
//            // buscamos todas las paradas a modo de prueba
//            log.info("**** Recorridos encontrados con findAll(): ****");
//            for (Recorrido recorrido : repoRecorrido.findAll()) {
//                log.info(recorrido.toString());
//            }
//            log.info("********************************************");
	};
    }
    
}

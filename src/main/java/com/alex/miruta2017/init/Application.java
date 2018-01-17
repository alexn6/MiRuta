/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.miruta2017.init;

import com.alex.miruta2017.interfaces.RepositorioComun;
import com.alex.miruta2017.interfaces.RepositorioEmpresa;
import com.alex.miruta2017.interfaces.RepositorioEsquina;
import com.alex.miruta2017.interfaces.RepositorioParada;
import com.alex.miruta2017.interfaces.RepositorioPtoInteres;
import com.alex.miruta2017.interfaces.RepositorioRecorrido;
import com.alex.miruta2017.interfaces.RepositorioUnidadTransporte;
import com.alex.miruta2017.interfaces.RepositorioUsuario;
import com.alex.miruta2017.model.Comun;
import com.alex.miruta2017.model.Empresa;
import com.alex.miruta2017.model.Esquina;
import com.alex.miruta2017.model.Parada;
import com.alex.miruta2017.model.PuntoInteres;
import com.alex.miruta2017.model.PuntoRecorrido;
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
//            p = new Parada(new Point(-65.0435781612698, -42.76403644138906), "ranchoLider");
//            repositorio.save(p);
//            log.info("Se creo una parada en el rancho del lider - Punto: "+p.toString());
//            p = new Parada(new Point(-65.04562200453915, -42.75792890613414), "unRanchito");
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
    
//    ####################################################################################
//    ##################################### Esquina y comun ######################################
    @Bean
    public CommandLineRunner cargaInicialEsquinaComun(RepositorioEsquina repoEsquina, RepositorioComun repoComun) {
        return (args) -> {
//            Esquina puntoEsq;
//            Comun puntoComun;
//            
//            puntoEsq = new Esquina(new Point(-65.03970639255681, -42.76892813211024), "esquina1");
//            repoEsquina.save(puntoEsq);
//            
//            puntoComun = new Comun(new Point(-65.03639654663243, -42.76895963634532), "punto comun");
//            repoComun.save(puntoComun);
//
//            // buscamos todas las paradas a modo de prueba
//            log.info("**** Esquina guardadas: ****");
//            for (Esquina esquina : repoEsquina.findAll()) {
//                log.info(esquina.toString());
//            }
//            
//            log.info("*********************************************");
//            
//            // buscamos todas las paradas a modo de prueba
//            log.info("**** Puntos comun guardados: ****");
//            for (Comun ptoComun : repoComun.findAll()) {
//                log.info(ptoComun.toString());
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
//            unidad = new UnidadTransporte("Unidad1", LocalTime.of(8, 0), LocalTime.of(22, 0), "20", "9.50", repoEmpresa.findOne(5L));
//            repoUniTransporte.save(unidad);
//            log.info("Se guardo la unidad 1");
//            
//            unidad = new UnidadTransporte("Unidad2", LocalTime.of(7, 30), LocalTime.of(22, 15), "15", "11.00", repoEmpresa.findOne(6L));
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
    public CommandLineRunner cargaInicialRecorrido(RepositorioRecorrido repoRecorrido, RepositorioEsquina repoEsquina,
                                        RepositorioParada repoParada, RepositorioUnidadTransporte repoUniTRansporte,
                                        RepositorioComun repoComun) {
        return (args) -> {
//            Recorrido reco;
//            PuntoRecorrido ptoRecorrido;
//            Parada parada;
//            List<PuntoRecorrido> paradas = new ArrayList<>();
//            
//            // *********** creamos un recorrido buscando puntos ya creados *************
//            paradas.add(repoParada.findOne(1L));
//            paradas.add(repoParada.findOne(2L));
//            paradas.add(repoEsquina.findOne(7L));
//            paradas.add(repoComun.findOne(8L));
//            
//            reco = new Recorrido("blanco", paradas, repoUniTRansporte.findOne(11L));
//            repoRecorrido.save(reco);
//            log.info("Se creo el recorrido 1, con puntos ya guardados: "+reco.toString());
//            
//            // *********** creamos un recorrido buscando puntos nuevos *************
//            ptoRecorrido = new Parada(new Point(-42.77347646555213, -65.04964397695699), "p1");
//            paradas.add(ptoRecorrido);
//            ptoRecorrido = new Parada(new Point(-42.77303150153067, -65.04829214361348), "p2");
//            paradas.add(ptoRecorrido);
//            ptoRecorrido = new Parada(new Point(-42.772598347642486, -65.0469993188683), "p3");
//            paradas.add(ptoRecorrido);
//            ptoRecorrido = new Esquina(new Point(-42.77214943950719, -65.04572795179524), "esquina 1");
//            paradas.add(ptoRecorrido);
//            ptoRecorrido = new Comun(new Point(-42.76980246330086, -65.0503306224648), "punto comun 2");
//            paradas.add(ptoRecorrido);
//            ptoRecorrido = new Comun(new Point(-42.769349596918005, -65.0491236284081), "pto comun 3");
//            paradas.add(ptoRecorrido);
//            ptoRecorrido = new Esquina(new Point(-42.7688140289225, -65.048565728933), "esquina 2");
//            paradas.add(ptoRecorrido);
//
//            reco = new Recorrido("gris", paradas, repoUniTRansporte.findOne(12L));
//            repoRecorrido.save(reco);
//            log.info("Se creo el recorrido 2, con nuevos puntos: "+reco.toString());
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

package com.example.peliculas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PeliculasController {
    private List<Peliculas> peliculas = new ArrayList<>();

    public PeliculasController(){
        peliculas.add(new Peliculas(1, "Volver al Futuro", 1985, "Robert Zemeckis", "Ciencia ficción, Aventura", 
        "Marty McFly, un adolescente, viaja accidentalmente al pasado en una máquina del tiempo creada por el excéntrico Dr. Emmett Brown."));

        peliculas.add(new Peliculas(2, "Resident Evil", 2002, "Paul W.S. Anderson", "Terror, Ciencia ficción, Acción", 
        "Un grupo de sobrevivientes debe enfrentarse a zombis y criaturas mutantes en una instalación secreta de la corporación Umbrella."));

        peliculas.add(new Peliculas(3, "Terminator", 1984, "James Cameron", "Ciencia ficción, Acción", 
        "Un cyborg asesino del futuro viaja al pasado para matar a Sarah Connor, mientras un soldado del futuro intenta protegerla."));

        peliculas.add(new Peliculas(4, "Jeepers Creepers", 2001, "Victor Salva", "Terror, Suspenso", 
        "Un hermano y una hermana son perseguidos por una criatura que resucita cada 23 años para cazar a los humanos."));

        peliculas.add(new Peliculas(5, "Mad Max: Furia en el Camino", 2015, "George Miller", "Ciencia ficción, Acción",
         "En un futuro distópico, Max y Furiosa se unen para escapar de un tirano en un mundo lleno de persecuciones a alta velocidad."));

        peliculas.add(new Peliculas(6, "Jurassic Park", 1993, "Steven Spielberg", "Ciencia ficción, Aventura", 
        "Un parque temático con dinosaurios clonados se convierte en un lugar de supervivencia cuando el sistema de seguridad falla."));

        peliculas.add(new Peliculas(7, "Alien: El Octavo Pasajero", 1979, "Ridley Scott", "Ciencia ficción, Terror", 
        "La tripulación de una nave espacial lucha por sobrevivir a bordo cuando una criatura extraterrestre pone en peligro sus vidas."));

        peliculas.add(new Peliculas(8, "The Matrix", 1999, "Lana y Lilly Wachowski", "Ciencia ficción, Acción", 
        "Neo descubre que el mundo es una simulación controlada por máquinas y se une a un grupo de rebeldes para liberarse."));

        peliculas.add(new Peliculas(9, "El Exorcista", 1973, "William Friedkin", "Terror", 
        "Una niña de 12 años es poseída por un demonio, y dos sacerdotes intentan realizar un exorcismo para salvarla."));

        peliculas.add(new Peliculas(10, "Star Wars: El Imperio Contraataca", 1980, "Irvin Kershner", "Ciencia ficción, Aventura", 
        "La Rebelión está a punto de ser derrotada por el Imperio Galáctico. Mientras Luke Skywalker recibe entrenamiento del Maestro Yoda, Han Solo y Leia son perseguidos por Darth Vader."));


    }

    //Obtener todas las Peliculas
    @GetMapping("/peliculas")
    public List<Peliculas> getPeliculas(){
        return peliculas;
    }

    //Obtener las peliculas por su ID
    @GetMapping("/peliculas/{id}")
    public Peliculas getPeliculaById(@PathVariable int id) {
        for (Peliculas peliculas: peliculas){
            if(peliculas.getId() == id){
                return peliculas;
            }
        }
        return null;
    }
       
}
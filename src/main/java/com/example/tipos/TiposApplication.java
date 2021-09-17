package com.example.tipos;

import java.util.Calendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TiposApplication {

	public static void main(String[] args) {
		SpringApplication.run(TiposApplication.class, args);

		/*String texto = "99";
		int suma = Integer.parseInt(texto) + 1;
		System.out.println(suma);
		*/

		//String s1 = "EjemploX";
		//String s2 = "EjemploY";
		//Compara dos cadenas
		//int resultado = s1.compareTo(s2);
		//Une dos cadenas
		//String resultado = s1.concat(s2);
		//Nos indica si un caracter apararece en una cadena y nos indica su posicion
		//int resultado = s1.indexOf("j");
		//Extra una cadena a partir de la posición indicada
		//String resultado = s1.substring(1);
		//String resultado = s1.substring(0,7);
		//Longitud de una cadena
		//int resultado = s1.length();
		//System.out.println(resultado);

		//Perro p = new Perro("Hunter", "Pastor Aleman", 3, "Carnivoro");
		//p.setNombre("Hunter");
		//p.setRaza("Pastor aleman");
		//p.setEdad(3);
		//p.setTipoAlimentacion("Carnivoro");
		//p.mostrar();
		//System.out.println(p.getNombre());

		//POLIMORFISMO
		//Lo importante es que la clase que tendrán esta característica
		//Tengan la palabra reservada abstract, no es necesario que las 
		//clases hijas tengan esa palbra reservada
		//Lo que sí es importante es que ese método versatil se escriba dentro
		//de las clases hijas pero solo se declare en la super clase
		//Animal a = new Perro("Hunter", "Pastor aleman", 3, "carnivoro");
		//a.alimentarse();

		//Animal c = new Caballo("Emperador", "herviboro", 5);
		//c.alimentarse();

		//AHORA USEMOS LAS CLASES DATE & CALENDAR
		//Calendar calendario = Calendar.getInstance();
		//int anio = calendario.get(Calendar.YEAR);
		//System.out.println(anio);

		
	}

}

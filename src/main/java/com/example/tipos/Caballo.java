package com.example.tipos;

public class Caballo extends Animal{

    public Caballo(String nombre, String tipo_alimentacion, int edad) {
        super(nombre, tipo_alimentacion, edad);
    }

    @Override
    public void alimentarse() {
        // TODO Auto-generated method stub
        System.out.println("Yo me alimento de hierbas");
        
    }
    
}

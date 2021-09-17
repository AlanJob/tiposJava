package com.example.tipos;
public abstract class Animal {
    private String nombre;
    private String tipo_alimentacion;
    private int edad;

    public Animal(String nombre, String tipo_alimentacion, int edad) {
        this.nombre = nombre;
        this.tipo_alimentacion = tipo_alimentacion;
        this.edad = edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }

    public void setTipoAlimentacion(String alimentacion){
        this.tipo_alimentacion = alimentacion;
    }
    public String getTipoAlimentacion(){
        return tipo_alimentacion;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return edad;
    }

    //Esto es polimorfismo, hacer que los métodos de una clase se comporten
    //diferente dependiendo de caracteristicas peculiares en las clases heredadas
    public abstract void alimentarse();

    public void moverse(){
        System.out.println("El animal se está moviendo");
    }
    
}

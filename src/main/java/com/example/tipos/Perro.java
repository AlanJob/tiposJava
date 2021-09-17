package com.example.tipos;
public class Perro extends Animal{
    private String raza;


    public Perro(String nombre, String tipo_alimentacion, int edad, String raza) {
        super(nombre, tipo_alimentacion, edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void mostrar(){
        System.out.println("Nombre: "+ getNombre() + "\nAlimentacion: " + getTipoAlimentacion() + "\nEdad: " + getEdad() + "\nRaza: " + getRaza());
    }

    
    @Override
    public void alimentarse() {
        // TODO Auto-generated method stub
        System.out.println("Me alimento de carne");
        
    }
}

package org.exampleRectangulo;

import java.util.Objects;

public class Rectangulo {

    private double base;
    private double altura;
    private static final double BORDE=5;

    public Rectangulo(){

       this(10,20);

    }

    public Rectangulo(double base, double altura){

        this.base = base;
        this.altura=altura;

    }

    public Rectangulo(double altura){
        this(0,altura);
    }

    public double getBase(){ // obtiene la base
        return this.base;
    }
    public double getAltura(){ // obtiene la altura
        return this.altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public void setBase(double base){
        this.base = base;
    }

    public static double getBorde(){
        return Rectangulo.BORDE;
    }

    @Override
    public boolean equals(Object o) {
        Rectangulo r=(Rectangulo)o;
        return (this.base==r.base && this.altura==r.altura);
    }

    @Override
    public int hashCode() {
        return Objects.hash(base, altura);
    }

    public double getArea(){
        return this.altura * this.base;
    }

    public double getPerimetro(){
        return  2 * (this.base + this.altura);
    }

    public double sumarArea(Rectangulo r){
        return this.getArea() + r.getArea();
    }

    public double sumarArea(double base, double altura){
        return this.sumarArea(new Rectangulo(base, altura));
    }

    public double sumarArea(Rectangulo ... arg){
        double sumatoria=this.getArea();
        for(Rectangulo r: arg){
            sumatoria+=r.getArea();
        }
        return  sumatoria;
    }
}


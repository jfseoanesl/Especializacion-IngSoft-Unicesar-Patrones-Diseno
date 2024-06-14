package org.exampleRectangulo;

public class Main {
    public static void main(String[] args) {

        Rectangulo r = new Rectangulo();
        Rectangulo r2 = new Rectangulo();
        r2.setAltura(25);
        Rectangulo r3 = new Rectangulo(20,15);
        //r.setBase(50);
        //r=r2;
        printRectangulo(r2);
        printRectangulo(r);
        printRectangulo(r3);
        System.out.println(r2==r);
        System.out.println(r2.equals(r));
        System.out.println("suma:"+ r.sumarArea(r2,r3, new Rectangulo(), new Rectangulo(5,3)));

    }
     public static void printRectangulo(Rectangulo r){
         System.out.printf("base: %.2f, altura: %.2f, borde: %.2f, area: %.2f , perimetro: %.2f%n",
                 r.getBase(), r.getAltura(),Rectangulo.getBorde(), r.getArea(), r.getPerimetro() );

     }
}
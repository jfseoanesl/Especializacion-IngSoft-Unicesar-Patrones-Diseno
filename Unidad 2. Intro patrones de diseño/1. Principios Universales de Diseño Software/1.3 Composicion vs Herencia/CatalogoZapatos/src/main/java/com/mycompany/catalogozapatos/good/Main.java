package com.mycompany.catalogozapatos.good;

public class Main {
    public static void main(String[] args) {
        Casual casual = new Casual(new Cordon(), new Tela());
        System.out.println(casual.getDescripcion());
    }
}

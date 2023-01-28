package org.example;

public class Main {
    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero();

        Canguru canguru = new Canguru();
        Cachorro cachorro = new Cachorro();


        mamifero.setPeso(5.70f);
        mamifero.setIdade(8);
        mamifero.setMembros(4);
        System.out.println(mamifero);
        mamifero.locomover();
        mamifero.alimentar();
        mamifero.emitirSom();

        System.out.println("-------------------------------------");

        canguru.setPeso(55.30f);
        canguru.setIdade(3);
        canguru.setMembros(4);
        System.out.println(canguru);
        canguru.locomover();
        canguru.emitirSom();
        canguru.usarBolsa();

        System.out.println("-------------------------------------");

        cachorro.setPeso(55.30f);
        cachorro.setIdade(3);
        cachorro.setMembros(4);
        System.out.println(cachorro);
        cachorro.locomover();
        cachorro.emitirSom();
        cachorro.abanarRabo();
    }
}
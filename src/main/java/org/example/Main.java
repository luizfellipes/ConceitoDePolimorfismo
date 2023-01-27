package org.example;

public class Main {
    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero();
        Reptil reptil = new Reptil();
        Peixe peixe = new Peixe();
        Ave ave = new Ave();

        mamifero.setPeso(85.3f);
        mamifero.setIdade(2);
        mamifero.setMembros(4);
        System.out.println(mamifero.toString());
        mamifero.locomover();
        mamifero.alimentar();
        mamifero.emitirSom();

        System.out.println("------------------------");

        reptil.setPeso(15.3f);
        reptil.setIdade(3);
        reptil.setMembros(4);
        System.out.println(reptil.toString());
        reptil.locomover();
        reptil.alimentar();
        reptil.emitirSom();







    }
}
package com.example;

public class Main {

    public static void main(String[] args) {

        String[] nombres = {"Miguel", "Angel", "Dante", "Lopez"};

        String resultado = "";
        for (String nombre : nombres) {
            resultado += nombre + " ";
        }
        System.out.println(resultado);

    }
}

package com.yagofellipe.javazero;

class Scratch2 {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        cachorro.cor = "marrom";
        cachorro.dormir();

        class Cachorro {
            String cor;
            int tamanho;
            double peso;

            void correr(){
                System.out.println("correndo");
            }

            void dormir(){
                System.out.println("Dormindo");
            }
        }
    }
}
class Cachorro {
    String cor;
    int tamanho;
    double peso;

    void correr(){
        System.out.println("correndo");
    }

    void dormir(){
        System.out.println("Dormindo");
    }
}
class Passaro {
    String cor;
    int tamanho;
    double peso;

    void correr(){
        System.out.println("correndo");
    }

    void dormir(){
        System.out.println("Dormindo");
    }
}
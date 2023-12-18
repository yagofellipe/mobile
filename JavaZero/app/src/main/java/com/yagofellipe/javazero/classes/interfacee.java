package com.yagofellipe.javazero.classes;

abstract class Pessoa {
    String nome;
    int idade;
    void comer(){
        System.out.println("comer");
    }
}

interface Presidente {
    //void candidatar(){}
}
class Jornalista extends Pessoa {
    void escrever(){

    }
}
class DesenvolvedorAndroid extends Pessoa implements Presidente {
    void programar(){

    }
    //@Override
    public void candidatar(){

    }
}

class Scratcha {
    public static void main(String[] args) {
        DesenvolvedorAndroid desenvolvedor= new DesenvolvedorAndroid();
        desenvolvedor.candidatar();
    }
}

class Animal {
    String cor;
    int tamanho;
    int quatidadePatas;
    double peso;

    void correr(){
        System.out.println("correndo com " + quatidadePatas + "patas");
    }

    void dormir(){
        System.out.println("Dormindo");
    }
}

class Cachorro extends Animal {

    public Cachorro(){}

    public Cachorro(String cor, int tamanho, int qtdPatas, double peso) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.quatidadePatas = qtdPatas;
        this.peso = peso;
    }
    void latir() {
        System.out.println("latir");
    }
    void latir(String pessoa) {
        System.out.println("latir para " + pessoa);
    }

    //Sobrescrita de método -> Sobreposição
    @Override
    void correr() {
        super.correr();// implementação padrão
    }

}

class Passaro extends Animal {
    void voar() {
        System.out.println("voar");
    }
    @Override
    void correr() {
        super.correr();// implementação padrão
    }
}

class Scratch {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("marrom", 4, 8, 1.5);


        /*cachorro.cor = "marrom";
        cachorro.quatidadePatas = 4;
        cachorro.correr();*/
    }
}
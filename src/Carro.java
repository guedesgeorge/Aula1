public class Carro {

    String nome;
    String marca;
    int ano;
    int vel;

    // métodos
    void acelerar(int aceleração){
        vel+=aceleração;

    }
    void frear(int reduzir) {
        vel=reduzir;
    }
    void buzinar(){
        System.out.println("bibi");
    }
}

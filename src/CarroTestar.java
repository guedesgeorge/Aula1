
public class CarroTestar {
    public static void main(String[] args) {

        // Criar um objeto da classe Carro
        Carro c1 = new Carro();

        // Inicializar os atributos do carro
        c1.nome = "Porsche";
        c1.marca = "Fiat";
        c1.ano = 2020;
        c1.vel = 70;

        // Acelerar o carro
        c1.acelerar(10);

        // Exibir a velocidade atual
        System.out.println("Velocidade: " + c1.vel + " km/h"); // Deve imprimir 70 km/h

        // Frear o carro
        c1.frear(40);

        // Exibir a nova velocidade
        System.out.println("Velocidade: " + c1.vel + " km/h"); // Deve imprimir 40 km/h
    }
}
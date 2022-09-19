package composicao;

public class Composicao {
    public static void main(String[] args) {
        // Primeira forma
        //Carro carro = new Carro();
        //Carro carro2 = new Carro(2000);
        // Segunda forma
        //Carro carro3 = new Carro();
        //carro3.ligarCarro(2000);
        //Terceira forma
        Carro carro4 = new Carro();
        Motor motor = new Motor();
        Motor motor2 = new Motor(2000);
        
        carro4.setMotor(motor2);
        
    }
}

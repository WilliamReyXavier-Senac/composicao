package composicao;

public class Motor {
    public int potencia;
    
    public Motor() {
        potencia = 1000; // Valor padrão
    }
    
    public Motor(int potencia) {
        this.potencia=potencia;// valor da variável potência recebe valor definido pela chamada do método
    }
    
    public int getPotencia() {
        return potencia;
    }
    
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    
    
}

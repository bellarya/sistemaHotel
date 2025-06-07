public class Quarto {
    private int numero;
    private String tipo;
    private int capacidade;
    private double preco;

    public Quarto(int numero, String tipo, int capacidade, double preco) {
        this.numero = numero;
        this.tipo = tipo;
        this.capacidade = capacidade;
        this.preco = preco;
    }

    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public int getCapacidade(){
        return capacidade;
    }
    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }

    public boolean verificarDisponibilidade(){ 
        return true;
    }
    public double calcularPrecoEstadia(int numeroDeDias){
        return preco * numeroDeDias;
    }
    public void atualizarPreco(double novoPreco){
        this.preco = novoPreco;
        System.out.println("Preço atualizado para: " + novoPreco);
    }
}
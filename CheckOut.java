public class CheckOut {
    private Reserva reserva;
    private String dataCheckOut;
    private double valorTotal;

    public CheckOut(Reserva reserva, String dataCheckOut) {
        this.reserva = reserva;
        this.dataCheckOut = dataCheckOut;
        this.valorTotal = 0.0; 
    }

    public Reserva getReserva(){
        return reserva;
    }
    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
    public String getDataCheckOut(){
        return dataCheckOut;
    }
    public void setDataCheckOut(String dataCheckOut){
        this.dataCheckOut = dataCheckOut;
    }
    public double getValorTotal(){
        return valorTotal;
    }
    public void setValorTotal(double valorTotal){
        this.valorTotal = valorTotal;
    }

    public void calcularConsumo(){
        double consumoExtra = 80;
        valorTotal = reserva.getQuarto().getPreco() + consumoExtra;
        System.out.println("Valor total: R$" + valorTotal);
    }
    public void registrarSaida(){
        System.out.println("\nCheck-out realizado com sucesso para o hóspede " + reserva.getHospede().getNome() + ".");
        System.out.println("Data do Check-out: " + dataCheckOut);
        System.out.println("Valor total da estadia: R$" + valorTotal);
    }
    public void gerarNotaFiscal(){
        System.out.println("\nNota fiscal de: " + reserva.getHospede().getNome());
        System.out.println("Data de entrada: " + reserva.getDataInicio());
        System.out.println("Data de saída: " + dataCheckOut);
        System.out.println("Valor total: R$" + valorTotal);
    }
}
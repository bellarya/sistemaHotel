public class CheckIn {
    private Reserva reserva;
    private String dataCheckIn;
    private String observacoes;

    public CheckIn(Reserva reserva, String dataCheckIn, String observacoes) {
        this.reserva = reserva;
        this.dataCheckIn = dataCheckIn;
        this.observacoes = observacoes;
    }

    public Reserva getReserva(){
        return reserva;
    }
    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
    public String getDataCheckIn(){
        return dataCheckIn;
    }
    public void setDataCheckIn(String dataCheckIn){
        this.dataCheckIn = dataCheckIn;
    }
    public String getObservacoes(){
        return observacoes;
    }
    public void setObservacoes(String observacoes){
        this.observacoes = observacoes;
    }

    public void registrarEntrada(){
        System.out.println("\nCheck-in realizado com sucesso para o hóspede " + reserva.getHospede().getNome() + " no quarto " + reserva.getQuarto().getNumero());
        System.out.println("Data do Check-in: " + dataCheckIn);
        System.out.println("Observações: " + observacoes);
    }
    public void verificarReserva(){
        System.out.println("Reserva confirmada para o hóspede " + reserva.getHospede().getNome() + ". Código de Reserva: " + reserva.getCodigoReserva());
        
    }
    public void informarNumeroQuarto(){
        System.out.println("Número do quarto: " + reserva.getQuarto().getNumero());
    }
}
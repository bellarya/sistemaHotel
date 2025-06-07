import java.util.Random;

public class Reserva {
    private Hospede hospede;
    private Quarto quarto;
    private String dataInicio;
    private String dataFim;
    private int codigoReserva;

    public Reserva(Hospede hospede, Quarto quarto, String dataInicio, String dataFim) {
        this.hospede = hospede;
        this.quarto = quarto;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.codigoReserva = new Random().nextInt(999999);
    }

    public Hospede getHospede(){
        return hospede;
    }
    public void setHospede(Hospede hospede){
        this.hospede = hospede;
    }
    public Quarto getQuarto(){
        return quarto;
    }
    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }
    public String getDataInicio(){
        return dataInicio;
    }
    public void setDataInicio(String dataInicio){
        this.dataInicio = dataInicio;
    }
    public String getDataFim(){
        return dataFim;
    }
    public void setDataFim(String dataFim){
        this.dataFim = dataFim;
    }
    public int getCodigoReserva(){
        return codigoReserva;
    }

    public void confirmarReserva(){
        System.out.println("Reserva confirmada para o hóspede: " + hospede.getNome() + " no quarto: " + quarto.getNumero() + ". Código da reserva: " + codigoReserva);
    }
    public void alterarDatas(String novaDataInicio, String novaDataFim){
        this.dataInicio = novaDataInicio;
        this.dataFim = novaDataFim;
        System.out.println("Datas da reserva alteradas para: " + dataInicio + " até " + dataFim);
    }
    public void gerarComprovante(){
        System.out.println("\nComprovante de Reserva:") ;
        System.out.println("Hóspede: " + hospede.getNome());
        System.out.println("Quarto: " + quarto.getNumero() + " (" + quarto.getTipo() + ")");
        System.out.println("Data de Início: " + dataInicio);
        System.out.println("Data de Fim: " + dataFim);
        System.out.println("Código de Reserva: " + codigoReserva);
    }
}
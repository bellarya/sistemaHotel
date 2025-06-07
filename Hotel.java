import java.util.ArrayList;

public class Hotel {
    private ArrayList<Hospede> hospedes;
    private ArrayList<Quarto> quartos;
    private ArrayList<Reserva> reservas;
    private ArrayList<CheckIn> checkins;
    private ArrayList<CheckOut> checkouts;

    public Hotel() {
        hospedes = new ArrayList<>();
        quartos = new ArrayList<>();
        reservas = new ArrayList<>();
        checkins = new ArrayList<>();
        checkouts = new ArrayList<>();
    }

    public void adicionarHospede(Hospede hospede){
        hospedes.add(hospede);
        System.out.println("Hóspede " + hospede.getNome() + " adicionado com sucesso.");
    }
    public void adicionarQuarto(Quarto quarto){
        quartos.add(quarto);
        System.out.println("Quarto " + quarto.getNumero() + " adicionado com sucesso.");
    }
    public void realizarReserva(Reserva reserva){
        reservas.add(reserva);
        System.out.println("\nReserva realizada para o hóspede " + reserva.getHospede().getNome() );
    }

    public ArrayList<Hospede> getHospedes(){
        return hospedes;
    }
    public ArrayList<Quarto> getQuartos(){
        return quartos;
    }
    public ArrayList<Reserva> getReservas(){
        return reservas;
    }
    public ArrayList<CheckIn> getCheckins(){
        return checkins;
    }
    public ArrayList<CheckOut> getCheckouts(){
        return checkouts;
    }
}
public class Sistema {
    public static void main(String[] args) {
        
        Hotel hotel = new Hotel();


        Quarto quarto1 = new Quarto(101, "Casal", 1, 250.00);
        Quarto quarto2 = new Quarto(102, "Solteiro", 2, 150.00);
        
        hotel.adicionarQuarto(quarto1);
        hotel.adicionarQuarto(quarto2);


        Hospede hospede1 = new Hospede("Paulo Cláudio", "123.456.789-00", "99999-9999", "paulocla@gmail.com");
        Hospede hospede2 = new Hospede("Cláudia Paula", "987.654.321-00", "98888-8888", "claudiapa@gmail.com");
        
        hotel.adicionarHospede(hospede1);
        hotel.adicionarHospede(hospede2);


        Reserva reserva1 = new Reserva(hospede1, quarto1, "20/04/2025", "02/05/2025");
        Reserva reserva2 = new Reserva(hospede2, quarto2, "21/04/2025", "28/04/2025");
        
        hotel.realizarReserva(reserva1);
        reserva1.confirmarReserva();

        hotel.realizarReserva(reserva2);
        reserva2.confirmarReserva();
        

        CheckIn checkIn1 = new CheckIn(reserva1, "20/04/2025", "Aniversário dia 25/04.");
        CheckIn checkIn2 = new CheckIn(reserva2, "21/04/2025", "Não deseja receber serviço de quarto.");
        
        checkIn1.registrarEntrada();
        checkIn2.registrarEntrada();
        

        CheckOut checkOut1 = new CheckOut(reserva1, "02/05/2025");
        CheckOut checkOut2 = new CheckOut(reserva2, "28/04/2025");
        
        checkOut1.calcularConsumo();
        checkOut2.calcularConsumo();
        
        checkOut1.gerarNotaFiscal();
        checkOut2.gerarNotaFiscal();
        
        checkOut1.registrarSaida();
        checkOut2.registrarSaida();
    }
}

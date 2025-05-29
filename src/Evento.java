import java.time.LocalDate;

public class Evento {
    private String titolo;
    private LocalDate data;
    private int numeroPostiTotali;
    private int numeroPostiPrenotati = 0;

    public Evento (String titolo, LocalDate data, int numeroPostiTotali, int numeroPostiPrenotati){
        this.titolo = titolo;
        this.data = data;
        this.numeroPostiTotali = numeroPostiTotali;
        this.numeroPostiPrenotati = numeroPostiPrenotati;
    }

    public String getTitolo(){
        return titolo;
    }

    public void setTitolo(String titolo){
        this.titolo = titolo;
    }


    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public int getNumeroPostiTotali(){
         return this.numeroPostiTotali;
    }
       

    public int getNumeroPostiPrenotati() {
        return this.numeroPostiPrenotati;
    }



    //PRENOTAZIONE
      public void prenota() {
        if (LocalDate.now().isAfter(data)) {
            throw new IllegalStateException("Impossibile prenotare: l'evento è già passato.");
        } else if (numeroPostiPrenotati >= numeroPostiTotali) {
            throw new IllegalStateException("Impossibile prenotare: non ci sono posti disponibili.");
        } else {
            numeroPostiPrenotati++;
            System.out.println("Prenotazione effettuata con successo.");
        }
    }


    //DISDETTA
      public void disdici() {
        if (LocalDate.now().isAfter(data)) {
            throw new IllegalStateException("Impossibile disdire: l'evento è già passato.");
        } else if (numeroPostiPrenotati <= 0) {
            throw new IllegalStateException("Impossibile disdire: non ci sono prenotazioni.");
        } else {
            numeroPostiPrenotati--;
            System.out.println("Prenotazione disdetta con successo.");
        }
    }

    @Override
    public String toString(){
        return "Data: " + data + " - Titolo: " + titolo;

    }






    
}

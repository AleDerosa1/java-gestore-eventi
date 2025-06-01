package org;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public  class Evento {
    private String titolo;
    private LocalDate data;
    private int numeroPostiTotali;
    private int numeroPostiPrenotati;

    public Evento (String titolo, LocalDate data, int numeroPostiTotali){
        this.titolo = titolo;
         if (LocalDate.now().isAfter(data)) {
            throw new IllegalStateException("Inserire una data nel futuro.");
         }else{
            this.data = data;
         }
         if (numeroPostiTotali <= 0){
             throw new IllegalStateException("Inserire numero di posti positivo.");
         }else{
            this.numeroPostiTotali = numeroPostiTotali;
         }
        this.numeroPostiPrenotati = 0;
    }

    public String getTitolo(){
        return this.titolo;
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
        DateTimeFormatter dataFormattata = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "In data: " + this.getData().format(dataFormattata) + "si terrà il concerto: " + this.getTitolo();

    }






    
}

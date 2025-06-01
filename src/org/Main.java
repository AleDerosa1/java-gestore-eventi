package org;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserire titolo evento");
        String titoloEvento = input.nextLine();

        System.out.println("Inserire la data dell'evento");
        String dataString = input.nextLine();
        LocalDate dataEvento = LocalDate.parse(dataString);

        System.out.println("Inserire il numero posti totali dell'evento");
        String numerPostiTotaliString = input.nextLine();
        Integer numeroPostiTotali = Integer.parseInt(numerPostiTotaliString);

        Evento eventoUtente = new Evento(titoloEvento, dataEvento, numeroPostiTotali);
        System.out.println(eventoUtente.toString());

        System.out.println("Vuoi effettuare delle prenotazioni?");
        String prenotazioniCondizione = input.nextLine();
        if (prenotazioniCondizione.equals("No")) {
            System.out.println("Non verrà effettuata nessuna prenotazione");
        } else {

            System.out.println("Quante prenotazioni vuoi effettuare?");
            String prenotazioniString = input.nextLine();
            Integer prenotazioni = Integer.parseInt(prenotazioniString);

            if (prenotazioni <= 0){
                System.out.println("");
            }

        }

        input.close();

    }

}

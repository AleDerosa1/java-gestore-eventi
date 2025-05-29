package org;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class Concerto extends Evento {
    private LocalTime ora;
    private BigDecimal prezzo;

    public Concerto(String titolo, LocalDate data, int numeroPostiPrenotati, int numeroPostiTotali, LocalTime ora, BigDecimal prezzo){
        super(titolo, data, numeroPostiTotali);
        this.ora = ora;
        this.prezzo = prezzo;
    }
    
}

package org;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Concerto extends Evento {
    private LocalTime ora;
    private BigDecimal prezzo;

    public Concerto(String titolo, LocalDate data, int numeroPostiTotali, LocalTime ora,
            BigDecimal prezzo) {
        super(titolo, data, numeroPostiTotali);
        this.ora = ora;
        this.prezzo = prezzo;
    }

    public LocalTime getOra() {
        return this.ora;
    }

    public void setOra(LocalTime ora) {
        this.ora = ora;
    }

    public BigDecimal getPrezzo() {
        return this.prezzo;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        DateTimeFormatter dataFormattata = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter oraFormattata = DateTimeFormatter.ofPattern("HH:mm");

        return "Il concerto: " + super.getTitolo() + "si terrà in data: " + super.getData().format(dataFormattata)
                + "alle ore: " + this.getOra().format(oraFormattata) + "ed il prezzo del biglietto sarà di $: "
                + String.format("%.2f", prezzo);

    }
}

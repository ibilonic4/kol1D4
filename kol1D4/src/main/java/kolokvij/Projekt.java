/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolokvij;

/**
 *
 * @author Ivor
 */
public class Projekt {
    private String sifra;
    private String naziv;
    private boolean zavrsenost;
    private Voditelj voditelj;

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public boolean isZavrsenost() {
        return zavrsenost;
    }

    public void setZavrsenost(boolean zavrsenost) {
        this.zavrsenost = zavrsenost;
    }

    public Voditelj getVoditelj() {
        return voditelj;
    }

    public void setVoditelj(Voditelj voditelj) {
        this.voditelj = voditelj;
    }

    @Override
    public String toString() {
        return naziv;
    }
    
   
    
}

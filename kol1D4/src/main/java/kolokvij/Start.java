/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolokvij;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Ivor
 */
public class Start {
        private List<Projekt> projekti = new ArrayList<>();
    
    public Start(){
        ucitajProjekte();
        ispisProjekta();
    }
    
    public static void main(String[] args) {
        new Start();
    }

    private void ucitajProjekte() {
String s;
while(true){
ucitajProjekt();
s=JOptionPane.showInputDialog("unesi g za prekid");
if(s.trim().toLowerCase().equals("g")){break;}    }

}

    private void ucitajProjekt() {


JOptionPane.showMessageDialog(null, "unos projekta");

Projekt p = new Projekt();
p.setSifra(Pomocno.ucitajString("sifra"));
p.setNaziv(Pomocno.ucitajString("naziv"));
p.setZavrsenost(Pomocno.ucitajBoolean("jel gotov"));
p.setVoditelj(ucitajVoditelja());

projekti.add(p);

    }

    private Voditelj ucitajVoditelja() {
JOptionPane.showMessageDialog(null, "upis voditelja");
Voditelj v = new Voditelj();
v.setIme(Pomocno.ucitajString("ime"));
v.setPrezime(Pomocno.ucitajString("prezime"));
v.setPlaca(Pomocno.ucitajFloat("placa"));

return v;
    }

    private void ispisProjekta() {
float suma=0;
int v = 0;
for(Projekt p : projekti){
    System.out.println(p.getNaziv() + " " + p.getVoditelj().getPlaca()/12);
    
    if(p.isZavrsenost()== true){suma += p.getVoditelj().getPlaca()/12;
    v++;
    }
}
        System.out.println("prosjek place je " + suma/v);
    }





}
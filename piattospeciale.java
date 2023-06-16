package PiattoSpeciale;

// Creare una classi Piatto Speciale che ha ingredienti di tipo PRIVATE 

//e ingredienti pubblic ( es: un panino normale o di sesamo ) 
// e un prezzo specifico per ognuno di loro ( es ingr1 = 2 euro ) 
// + una base di fisso ( prezzo = 1 euro )

// Creare poi una classe menu che permetta in loop di ordinare 
// il piatto speciale selezionando tra una lista gli ingredienti public 
// e facendo inserire a mano gli ingredienti PRIVATE 
// dopo aver stampato una lista 
// dei possibili casi ( solo quelli devono essere accettati ) 
// a quel punto calcolare il totale e riportare all'inizio

import java.util.ArrayList;
import java.util.Objects;

public class piattospeciale {
    private ArrayList<String> ingredientiPri;
    private ArrayList<String> ingredientiPub;
    private ArrayList<Integer> prezziPri;
    private int prezziPub;

    public piattospeciale(ArrayList<String> ingredientiPri, ArrayList<String> ingredientiPub,
            int prezziPub, ArrayList<Integer> prezziPri) {
        this.ingredientiPri = ingredientiPri;
        this.ingredientiPub = ingredientiPub;
        this.prezziPri = prezziPri;
        this.prezziPub = prezziPub;
    }

    public ArrayList<String> getingredientiPri() {
        return ingredientiPri;
    }
    
    public ArrayList<String> getingredientiPub() {
        return ingredientiPub;
    }

    public ArrayList<Integer> getprezziPri() {
        return prezziPri;
    }
    
    public int getprezziPub() {
        return prezziPub;
    }


    public void stampaInfoPri() {
        for (int i=0;i<ingredientiPri.size();i++) {
            System.out.println("Nome ingrediente: " + ingredientiPri.get(i));
            System.out.println("Prezzo: " + prezziPri);
        }
    }

    public void stampaInfoPub() {
        for (int j=0;j<ingredientiPub.size();j++) {
            System.out.println("Nome ingrediente: " + ingredientiPub.get(j));
            System.out.println("Prezzo: " + prezziPub);
        }
    }

}
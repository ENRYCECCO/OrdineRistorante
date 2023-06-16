package PiattoSpeciale;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

import PrenotazioneVoli.Voli;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> Comanda = new ArrayList<>();
        ArrayList<String> Salse = new ArrayList<>();
        ArrayList<String> Panino = new ArrayList<>();
        ArrayList<Integer> prezziPri = new ArrayList<>();

        int prezziPub = 10; // Prezzo Panino

        // Prova

        Panino.add("Bacon");
        Panino.add("Double");

        Salse.add("Ketchup");
        Salse.add("BBQ");

        prezziPri.add(2); // costo Ketchup
        prezziPri.add(3); // costo BBQ

        piattospeciale piatto1 = new piattospeciale(Panino, Salse, prezziPub, prezziPri);

        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerStr = new Scanner(System.in);

        // Ordinazione
        int scelta = 0;

        do {
            System.out.println(" ");
            System.out.println("1. Visualizza Menu");
            System.out.println("2. Ordina");
            System.out.println("3. Paga");
            System.out.println("4. Esci");
            System.out.println("Cosa vuoi fare?");
            scelta = scannerInt.nextInt();

            switch (scelta) {
                case 1:
                    // Stampa Menu
                    System.out.println("Menu");
                    System.out.println(" ");
                    System.out.println("Piatti Base");
                    System.out.println(" ");
                    System.out.println(Panino);
                    System.out.println("Prezzo " + prezziPub);
                    // for (int y = 0; y<Panino.size(); y++) {
                    //     System.out.println( y + ". " + Panino.get(y) + " | " + prezziPub + " euro");
                    // }
                    System.out.println(" ");
                    System.out.println("Aggiunte");
                    System.out.println(" ");
                    System.out.println(Salse);
                    System.out.println("Prezzo " + prezziPri);
                    // for (int r = 0; r<Salse.size(); r++) {
                    //     System.out.println( r + ". " + Salse.get(r) + " | " + prezziPri.get(r) + " euro");
                    // }
                    break;
                case 2:
                    // Ordina
                    System.out.println("Ordina");
                    System.out.println("Cosa vuoi ordinare?");
                    String ordine = scannerStr.nextLine();
                    System.out.println(ordine);
                    for (int i = 0; i<Panino.size(); i++) {
                        if (ordine==Panino.get(i)) {
                            Comanda.add(ordine);
                            // System.out.println(Comanda.get(0));
                        }  
                    }
                    System.out.println("Quali salse vuoi aggiungere?");
                    String salse = scannerStr.nextLine();
                    System.out.println(salse);
                    for (int q = 0; q<Panino.size(); q++) {
                        if (salse==Salse.get(q)) {
                            Comanda.add(salse);
                            // System.out.println(Comanda.get(1));
                        }  
                    }
                    System.out.println(" ");
                    System.out.println("Hai ordinato:");
                    System.out.println(Comanda);
                    // for (int e = 0; e<Comanda.size(); e++) {
                    //     System.out.println(Comanda.get(e));
                    // }

                    break;
                case 3:
                    // Paga
                    System.out.println("Paga");
                    break;
                case 4:
                    // Esci
                    System.out.println("Grazie e arrivederci");
                    return;
                default:
                    System.out.println("Non hai inserito una scelta giusta");
                    break;

            }

        } while (scelta != 4);

    }
}

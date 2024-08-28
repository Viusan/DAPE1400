import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); //lager scanner object
        System.out.println("Skriv inn fornavnet ditt");
        String forNavn = myObj.nextLine(); //leser av input som ble skrevet

        System.out.println("Skriv inn etternavnet ditt");
        String etterNavn = myObj.nextLine();

        System.out.println("Hvor gammel er du?");
        String age = myObj.nextLine();

        System.out.println("Hva er din adresse?");
        String address = myObj.nextLine();

        System.out.println("Hva dit poststed?");
        String postSted = myObj.nextLine();

        System.out.println("Hva er din postnummer?");
        String postNum = myObj.nextLine();

        System.out.println("Gathered Data so far: \n" + "Name: " + forNavn + " " + etterNavn + "\n Adress: " + address + "\n Postnummer: " + postNum + "\n Poststed: " + postSted + "\n Alder: " + age);
    }
}
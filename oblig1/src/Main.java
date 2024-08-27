import java.util.Scanner;  // Importerer Scanner class

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); //lager scanner object
        System.out.println("Hva heter du?");

        String userName = myObj.nextLine(); //leser av input som ble skrevet
        System.out.println("Tenk at jeg, " + userName + ", har naila oblig 1 allerede!");
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); //lager scanner object
        System.out.println("Hvor gammel er du?");
        String alder = myObj.nextLine();
        System.out.println("Min alder er  " + alder + " år");

        System.out.print("Nå skal vi beregne summen av 3 tall, skriv inn tre tall: \n");
        String numOne = myObj.nextLine();
        String numTwo = myObj.nextLine();
        String numThree = myObj.nextLine();
        int one = Integer.valueOf(numOne);
        int two = Integer.valueOf(numTwo);
        int three = Integer.valueOf(numThree);
        int sumOfNumbers = one + two + three;
        int sum = Integer.valueOf(sumOfNumbers);
        System.out.println("Tallene du har valgt: \n" + numOne + " " + numTwo + " " + numThree + "\n Summen av tallene er " + sumOfNumbers +  " og gjennomsnittet av tallene er " + sum/3);

    }
}
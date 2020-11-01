//must have scanner util to use the scanner
import java.util.Scanner;

public class SortPurchaseArrayApp {

    public static void main(String[] args) {

        Purchase[] purchases = new Purchase[3];

        String message;
        char choice;
        final char QUIT = 'Z';
        int number;
        double price;

        //get input from user is a scanner
        Scanner input = new Scanner(System.in);

        //request purchace information from user and load up array
        //for is a loop
        for(int i = 0; i < purchases.length; ++i)
        {
            System.out.print("Enter invoice number >> ");
            number = input.nextInt();
            System.out.print("Enter sale amount >> ");
            price = input.nextDouble();
            purchases[i] = new Purchase();
            purchases[i].setInvoiceNumber(number);
            purchases[i].setSaleAmount(price);
        }

        input.nextLine();
        System.out.print("\nSort Purchace by (I)nvoice number, or (S)ale amount? ");
        choice = input.nextLine().charAt(0);
        while(choice != QUIT)
        {
            if(choice == 'I')
            {
                sortByInvoice(purchases);
                message = "\nSorted by invoice number\n";
                display(purchases, message);

            }
            else if(choice == 'S')
            {
                sortBySaleAmount(purchases);
                message = "\nSorted by sale amount\n";
                display(purchases, message);
            }
            else
            {
                System.out.println("Invalid choice");

            }
            System.out.print("\nSort Purchace by (I)nvoice number, or (S)ale amount? ");
            System.out.print(" or enter " + QUIT + " to quit >> ");
            choice = input.nextLine().charAt(0);
        }

    }

    public static void sortBySaleAmount(Purchase[] array){
        int a, b;
        Purchase temp;

        int highIndex = array.length - 1;

        for (a = 0; a < highIndex; ++a)
        {
            for (b = 0; b < highIndex; ++b)
            {
                if (array[b].getSaleAmount() > array [b + 1].getSaleAmount())
                {
                    temp = array[b];
                    array[b] = array[b + 1];
                    array[b + 1] = temp;
                }
            }
        }
    }

    public static void sortByInvoice(Purchase[] array){
        //change getSaleAmount to getByInvoice
        int a, b;
        Purchase temp;

        int highIndex = array.length - 1;

        for (a = 0; a < highIndex; ++a)
        {
            for (b = 0; b < highIndex; ++b)
            {
                if (array[b].getInvoiceNumber() > array [b + 1].getInvoiceNumber())
                {
                    temp = array[b];
                    array[b] = array[b + 1];
                    array[b + 1] = temp;
                }
            }
        }
    }

    public static void display(Purchase[] p, String msg)
    {
        System.out.println(msg);
        for(int i = 0; i < p.length; i++)
        {
            p[i].display();
        }
    }

}

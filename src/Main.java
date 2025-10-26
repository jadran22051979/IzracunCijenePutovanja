import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite odredišni planet: M (Mars) ,J(Jupiter)  ili S(Saturn)");
        char planet = scanner.next().charAt(0);

        double osnovnaCijena = 0.0;


        switch (planet) {
            case 'M':
                osnovnaCijena = 50000.0;
                System.out.println("Izabrali ste Mars za kojeg je Osnovna cijena :\t€" + osnovnaCijena);
                break;
            case 'J':
                osnovnaCijena = 80000.0;
                System.out.println("Izabrali ste Jupiter za kojeg je Osnovna cijena :\t€" + osnovnaCijena);
                break;
            case 'S':
                osnovnaCijena = 120000.0;
                System.out.println("Izabrali ste Saturn za kojeg je Osnovna cijena :\t€" + osnovnaCijena);
                break;
            default:
                osnovnaCijena = 0.0;
                System.out.println("Pogrešan unos.Cijena je :\t€" + osnovnaCijena);
                scanner.close();
                return;
        }

        // Status vjernosti
        System.out.println("Unesite status vjernosti: G (Zlatni) ,S (Srebrni)  ili N (Nikakav/nema)");
        char status = scanner.next().charAt(0);


        double statusniPopust = 0.0;

        // Status popust
        if (status == 'G') {
            statusniPopust = 0.15 * osnovnaCijena; // 15% za Gold
            System.out.println("Gold status: 15% popusta.");
            System.out.println("Zbog popusta za status Gold cijena je umanjena za :\t€" + statusniPopust + "\t i trenutno iznosi :\t€" + "\t" + (osnovnaCijena - statusniPopust));
        } else if (status == 'S') {
            statusniPopust = 0.10 * osnovnaCijena; // 10% za Silver
            System.out.println("Silver status: 10% popusta.");
            System.out.println("Zbog popusta za status Silver cijena je umanjena za :\t€" + statusniPopust + "\t i trenutno iznosi :\t€" + "\t" + (osnovnaCijena - statusniPopust));
        } else {
            System.out.println("Nema popusta za Status");
        }

        // Unos dobi
        System.out.println("Unesite vašu dob (Cijeli broj)");
        int dob = scanner.nextInt();

        double popustDob = 0.0;

        // Popust na dob
        if ((dob > 0) && (dob < 16)) {
            popustDob = 5000.0;
            System.out.println("Popust za mlađe od 16 godina je :\t€" + popustDob);
        } else if (dob > 60) {
            popustDob = 2000.0;
            System.out.println("Popust za starije od  60 godina je :\t€" + popustDob);
        } else {
            System.out.println("Nema popusta za Dob");
        }

        double ukupniPopusti = statusniPopust + popustDob;
        System.out.println("Ukupni popusti su :\t€" + ukupniPopusti);

        double konacnaCijena = osnovnaCijena - statusniPopust - popustDob;
        System.out.println("Konačna cijena je:\t€" + konacnaCijena);

        scanner.close();
    }
}
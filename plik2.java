import java.util.Scanner;

public class plik2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę: ");
        double liczba1 = scanner.nextDouble();

        System.out.print("Podaj drugą liczbę: ");
        double liczba2 = scanner.nextDouble();

        System.out.println("Wybierz operację: ");
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnożenie");
        System.out.println("4. Dzielenie");
        System.out.print("Twój wybór: ");
        int wybor = scanner.nextInt();

        double wynik;

        switch (wybor) {
            case 1:
                wynik = liczba1 + liczba2;
                System.out.println("Wynik dodawania: " + wynik);
                break;
            case 2:
                wynik = liczba1 - liczba2;
                System.out.println("Wynik odejmowania: " + wynik);
                break;
            case 3:
                wynik = liczba1 * liczba2;
                System.out.println("Wynik mnożenia: " + wynik);
                break;
            case 4:
                if (liczba2 != 0) {
                    wynik = liczba1 / liczba2;
                    System.out.println("Wynik dzielenia: " + wynik);
                } else {
                    System.out.println("Nie można dzielić przez zero!");
                }
                break;
            default:
                System.out.println("Nieprawidłowy wybór operacji!");
        }
    }
}

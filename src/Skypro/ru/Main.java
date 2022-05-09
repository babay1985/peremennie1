package Skypro.ru;

public class Main {

    public static void main(String[] args) {
	// zadanie 1
        int bull = 5;
        int dog = 7;
        byte cat = 1;
        short mouse = 5;
        double sugarWeight = 7.9;
        char bar = 35;
        float saltWeight = 2.5f;
        long hippo = 125L;
        boolean bullIsAdult = bull > 10;

        System.out.println(bullIsAdult);
        System.out.println(sugarWeight);
        System.out.println("cat + mouse ");
        // Zadanie 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightAllBoxer = boxer1 + boxer2;
        double weightDiffirence = boxer2 - boxer1;
        System.out.println("Obsiy ves boxerov " + weightAllBoxer);
        System.out.println("Raznitsa v vese boxerov " + weightDiffirence);
        // Zadanie 3
        short bananas = 5 * 80;
        short milk = 2 * 105;
        short iceCream = 2 * 100;
        short eggs = 4 * 70;
        int totalWeightInGram = bananas + milk + iceCream + eggs;
        System.out.println("Obsiy ves zavtraka v grammah " + totalWeightInGram + " gr");
        int grTwoKilo = 1000;
        float totalWeightInKilo = (float)  totalWeightInGram / grTwoKilo;
        System.out.println("Obsiy ves zavtraka v kilogrammah "+ totalWeightInKilo + "Kg");

        // Zadanie 4
        int stuffWeightSportsmen =  7;
        double sportsmenLoses1 = 7 / 0.250;
        double sportsmenLoses2 = 7 / 0.500;
        System.out.println(sportsmenLoses1);
        System.out.println(sportsmenLoses2);
        // Zadanie 5
        long masaMonths = 67760 % 10;
        short denisMonths = 83690 % 10;
        short kristinaMonths = 76230 % 10;
        System.out.println(masaMonths);
        System.out.println(denisMonths);
        System.out.println(kristinaMonths);





    }
}

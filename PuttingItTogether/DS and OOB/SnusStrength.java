import java.util.HashMap;
import java.util.Scanner;

public class SnusStrength {
    public HashMap<String, Integer> strengths = new HashMap<>();

    public SnusStrength() {
        strengths.put("Velo", 4);
        strengths.put("Zyn", 1);
        strengths.put("Stark", 3);
        strengths.put("Extra Strong", 5);
    }

    public String getBrandFromStrength(int value) {
        for (String key : strengths.keySet()) {
            if (strengths.get(key) == value) {
                return key;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SnusStrength snus = new SnusStrength();

        System.out.print("Enter strength value: ");
        int inputValue = scan.nextInt();

        String brand = snus.getBrandFromStrength(inputValue);
        System.out.println("Brand: " + brand);

        int y = snus.strengths.get(brand);
        SnusPrice price = new Discount(y);

        double finalPrice = price.discount(100.99);
        System.out.println("Final price: " + finalPrice);
    }
}

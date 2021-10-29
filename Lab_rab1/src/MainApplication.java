import java.util.Arrays;
import java.util.Random;

public class MainApplication {

    public static void main(String[] args)  {
        // Определение ссылок на продукты завтрака

     String argument = "IceCream/Cheese/IceCream";
    Random rand = new Random();



     String[] parts = argument.split("/");
     String parts_Ice_0 = "шоколад/карамель";
        String[] parts_Ice = parts_Ice_0.split("/");

     Food[] breakfast = new Food[parts.length];
    // System.out.println( parts_Ice.length );
     for (int j = 0; j < parts.length; j++ ) {
         if (parts[j].equals("Cheese")) {

             breakfast[j] = new Cheese();
         }
         if (parts[j].equals("IceCream")) {

             breakfast[j] = new IceCream (parts_Ice[rand.nextInt(parts_Ice.length)]);

         } else;
     }

     Arrays.sort (breakfast, new FoodComparator());
     System.out.println( breakfast[0].getName() +" " + breakfast[1].getName() +" "+ breakfast[2].getName() );
    }

}

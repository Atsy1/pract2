import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);






        System.out.println("Введите количество молока в милилитрах");
        int milkAmount = scan.nextInt();

        System.out.println("Введите количество порошка в граммах");
        int powderAmount = scan.nextInt();

        System.out.println("Введите количество яиц");
        int eggsAmount = scan.nextInt();

        System.out.println("Введите количество сахара в граммах");
        int sugarAmount = scan.nextInt();

     System.out.println("Введите количество масла в милилитрах");
       int oilAmount = scan.nextInt();


        System.out.println("Введите количество яблок");
        int appleAmount = scan.nextInt();

        System.out.println("Выберите,что хотите приготовить");
        String action = scan.nextLine();
        action = scan.nextLine();

        switch (action){
            case"Apple juice":

                if (appleAmount>= 5){
                    System.out.println("вы приготовили- Apple juice");
                }
                else {
                    System.out.println("Не достаточно ингредиентов");
                }
                break;


            case"Pancakes":
                if(powderAmount>=400 && sugarAmount >=10 && milkAmount >= 1000 && oilAmount >=30){
                    System.out.println("вы приготовили- Pancakes");
                }
                else {
                    System.out.println("Не достаточно ингредиентов");
                }
                break;


            case"Omelete":
                if (milkAmount >= 300 && powderAmount >= 5 && eggsAmount >=5){
                    System.out.println("вы приготовили- Omelete");
                }
                else {
                    System.out.println("Не достаточно ингредиентов");
                }
                break;


            case"Apple pie":
                if (appleAmount >= 3 && milkAmount >= 100 && powderAmount >= 300 && eggsAmount >= 4){
                    System.out.println("вы приготовили- Apple pie");
                }
                else {
                    System.out.println("Не достаточно ингредиентов");
                }
                break;




        }


    }
}
import java.util.*;
class a{
    String b = "=";

    public void c(){

        for(int i = 0; i < 45; i++){
            System.out.print(b);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        a a = new a();


        List<String> fruits = new ArrayList<>();

        fruits.add("\nApple");
        fruits.add("Banana");
        fruits.add("Casada Melon");
        fruits.add("Dates");
        fruits.add("Peach");
        fruits.add("Mango");
        fruits.add("Rambutan");
        fruits.add("Pineapple");
        fruits.add("Kiwi");

        for(int i = 0; i < fruits.size(); i++){
            System.out.println(fruits.get(i));
        }

        a.c();

        for(String fruist : fruits){
            System.out.println(fruist);
        }
    }
}
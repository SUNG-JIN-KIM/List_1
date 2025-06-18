import java.util.*;

class a{
    String b = "=";

    public void c(){

        for(int i = 0; i < 45; i++){
            System.out.print(b);
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        a a = new a();

        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Casada Melon");
        fruits.add("Dates");
        fruits.add("Tomato");
        fruits.add("Peach");
        fruits.add("Mango");
        fruits.add("Rambutan");
        fruits.add("Pineapple");
        fruits.add("Kiwi");
        fruits.add("Potato");
        fruits.add("strawberry");

        //Collections.sort(fruits);

        for(int i = 0; i < fruits.size(); i++){
            System.out.println(fruits.get(i));
        }

        a.c();

        for(String fruist : fruits){
            System.out.println(fruist);
        }

        a.c();

        if(fruits.contains("strawberry")){
            System.out.println("strawberry가 있습니다.");
        }else {
            System.out.println("strawberry가 없습니다.");
        }

        a.c();

        fruits.remove("Tomato");
        fruits.remove(9);

        for(String fruist : fruits){
            System.out.println(fruist);
        }

        a.c();

        fruits.clear();

        System.out.println(fruits.isEmpty());
    }
}
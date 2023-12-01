import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList <Cats> arrayList = new ArrayList<>();
        Random ran =  new Random();
        for (int i = 0; i < 1000; i++) {
            int a = ran.nextInt(3,6);
            arrayList.add(new Cats("Cat"+i, a));
        }
        System.out.println(arrayList);

    }
}
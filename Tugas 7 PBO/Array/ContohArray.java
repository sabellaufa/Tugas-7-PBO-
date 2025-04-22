package Array;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class ContohArray {
    public static void main(String[] args) {
        //ArrayList
        ArrayList<String> buah = new ArrayList<>();
        buah.add("Manggis");
        buah.add("Pisang");
        buah.add("Rambutan");

        System.out.println("Isi ArrayList:");
        for (String b: buah) {
            System.out.println(b);
        }

        //ArrayDeque
        ArrayDeque<String> antrian = new ArrayDeque<>();
        antrian.add("Nana");
        antrian.add("Zia");
        antrian.add("Gia");

        System.out.println("\nIsi Antrian:");
        while (!antrian.isEmpty()) {
            System.out.println("Diproses: " + antrian.poll());
        }            
    }

}

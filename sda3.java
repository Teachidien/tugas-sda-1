import java.util.ArrayList;

public class sda3
 {
    public static void main(String[] args)
     {
    //String[] nama = {"U","B","I","S"};
    ArrayList<String> nama = new ArrayList<String>();
    nama.add("U");
    nama.add("B");
    nama.add("I");
    nama.add("S");

    //Soal no 3
    //Tentukan hasil yang didapatkan ketika dilakukan perintah berikut ini:
    //get(0), get(2), get(6), get(-3)

    System.out.println(nama.get(0));
    System.out.println(nama.get(2));
    System.out.println(nama.get(6));
    System.out.println(nama.get(-3));
    }
}
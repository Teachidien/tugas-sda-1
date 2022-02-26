import java.util.ArrayList;

public class sda4
 {
    public static void main(String[] args)
     {
    //String[] nama = {"U","B","I","S"};
    ArrayList<String> nama = new ArrayList<String>();
    nama.add("U");
    nama.add("B");
    nama.add("I");
    nama.add("S");
    
    //Soal no 4
    //Tentukan hasil yang didapatkan ketika dilakukan perintah berikut ini:
    //indexOf(a), indexOf(c), indexOf(q)

    System.out.println(nama.indexOf("a"));
    System.out.println(nama.indexOf("c"));
    System.out.println(nama.indexOf("q"));

    }
}
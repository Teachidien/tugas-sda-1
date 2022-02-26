import java.util.ArrayList;

public class sda5
 {
    public static void main(String[] args)
     {
    //String[] nama = {"U","B","I","S"};
    ArrayList<String> nama = new ArrayList<String>();
    nama.add("U");
    nama.add("B");
    nama.add("I");
    nama.add("S");
    

    System.out.println("ArrayList sebelum diremove:");
    for(String var: nama)
    {
         System.out.println(var);
    }

    //Soal no 5
    //Tentukan hasil yang didapat ketika dilakukan perintah berikut :
    //remove(0), remove(3), remove(2)

    // System.out.println(nama.remove(0));
    // System.out.println(nama.remove(3));
    // System.out.println(nama.remove(2));

   // nama.remove(0);
 nama.remove(3);
    nama.remove(2);
    System.out.println("ArrayList setelah diremove:");
       for(String var2: nama){
             System.out.println(var2);

            }
    }
}
import java.util.Scanner;

public class ShtoNumrat {
    public static void main(String[] args){
        int x, y, z;
        System.out.println("Vendosni numrat tuaj");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = x * y;
        System.out.println("Shuma jote e numrave eshte " + z);

    }

}



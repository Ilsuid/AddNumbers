import java.util.Scanner;

public class ShtoNumrat {
    public static void main(String[] args){
        //Simple code
        int x, y, z;
        System.out.println("Add your numbers");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = x * y;
        System.out.println("Sum of your numbers is " + z);

    }

}



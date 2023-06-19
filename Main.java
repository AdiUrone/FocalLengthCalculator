import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the object distance from the lens: ");
        float u = sc.nextFloat();
        System.out.println("Enter the image distance from the lens: ");
        float v = sc.nextFloat();
        float f1 = 0,f2 = 0;
        try{
            f1 = f1 + (u*v)/(u+v);
        }
        catch(Exception e){
            System.out.println("You can't put 0 as the input");
        }
        try{
            f2 = f2 + (u*v)/(v-u);
        }
        catch(Exception e){
            System.out.println("You can't put 0 as the input");
        }
        System.out.println("The focal length of the convex lens is: " + f1);
        System.out.println("The focal length of the concave lens is: " + f2);
    }
}

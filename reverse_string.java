package Java_Learning_Day_9;
import java.util.*;
public class reverse_string {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String reverse_name = "";
        for (int i = name.length() - 1; i>=0; i--){
            reverse_name = reverse_name + name.charAt(i);
        }
        System.out.println(reverse_name);
    }
}
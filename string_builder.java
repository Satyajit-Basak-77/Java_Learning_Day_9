package Java_Learning_Day_9;
import java.util.*;
public class string_builder {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder str_sb = new StringBuilder(str);

        // Insert char
        str_sb.insert(0, 'M');
        System.out.println(str_sb);

        //delete character
        str_sb.delete(3, 4); 
        System.out.println(str_sb);
        /* end index ta exclusive hoy oita thik aager ta obdi theme jay ekhane 3 theke 4 mane originally 3 to 3 mane
        khali 3rd index (4th character) delete hbe */
    }
}
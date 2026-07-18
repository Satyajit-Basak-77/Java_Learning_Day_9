// Append means to add something at the end.

package Java_Learning_Day_9;

public class append {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Satyajit");
        sb.append(" Basak.");

        System.out.println(sb);
        System.out.print(sb.length());
    }
}
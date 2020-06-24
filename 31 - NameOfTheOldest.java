
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String oldest = "None";
        int age = 0;
        
        while (true){
            String text = scanner.nextLine();
            String[] words = text.split(",");
            
            if (text.equals("")){
                break;
            }
            
            if (Integer.valueOf(words[1]) > age){
                age = Integer.valueOf(words[1]);
                oldest = words[0];
            }
        }
        System.out.println("Name of the oldest: " + oldest);

    }
}

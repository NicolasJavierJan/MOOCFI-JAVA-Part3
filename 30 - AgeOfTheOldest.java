
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldest = 0;
        while (true){
            
            
            String text = scanner.nextLine();
            String[] words = text.split(",");
            
            if (text.equals("")){
                break;
            }
            
            if (Integer.valueOf(words[1]) > oldest){
                oldest = Integer.valueOf(words[1]);
            }
        }
        System.out.println("Age of the oldest: " + oldest);
    }
}

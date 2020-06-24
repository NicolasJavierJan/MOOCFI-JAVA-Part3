
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            String text = scanner.nextLine();
            String[] words = text.split(" ");
            
            for (int i = 0; i < words.length; i++){
                if (words[i].contains("av")){
                    System.out.println(words[i]);
                }
            }
            
            if (text.equals("")){
                break;
            }
        }

    }
}

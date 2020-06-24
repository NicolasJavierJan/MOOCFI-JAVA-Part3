
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> years = new ArrayList<>();
        int longest = 0;
        String name = "None";
        
        while (true){
            String text = scanner.nextLine();
            String[] words = text.split(",");
            
            if (text.equals("")){
                break;
            }
            
            if (words[0].length() > longest){
                longest = words[0].length();
                name = words[0];
            }
            
            years.add(Integer.valueOf(words[1]));
            
        }
        
        System.out.println("Longest name: " + name);
        int total = 0;
        for (int i = 0; i < years.size(); i++){
            total = total + years.get(i);
        }
        double average = (total * 1.0)/ (years.size());
        System.out.println("Average of the birth years: " + average);
        
    }
}

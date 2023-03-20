import java.util.Scanner;
public class ValidUsername {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regularExpression = "[a-zA-Z](\\w){7,29}";
        int n = Integer.parseInt(sc.nextLine());
        while (n-- != 0) {
            String userName = sc.nextLine();

            if (userName.matches(regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
        sc.close();
    }
}
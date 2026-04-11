import java.util.Scanner;

public class main {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Register reg = new Register();
        
        //Registration
        System.out.println("=== Registration ===");
        
        System.out.print("Enter username: ");
        String username = input.nextLine();
        
        System.out.print("Enter password: ");
        String password = input.nextLine();
        
        System.out.print("Enter SA phone number (+27):");
        String phone = input.nextLine();
        
        String registerMessage = reg.registerUser(username, password, phone);
        System.out.println(registerMessage);
        
        //Login
        System.out.println("\n=== Login ===");
        
        System.out.print("Enter username: ");
        String loginUser = input.nextLine();
        
        System.out.print("Enter password: ");
        String loginPass = input.nextLine();
        
        boolean loginStatus = reg.loginUser(loginUser, loginPass);
        System.out.println(reg.returnLoginStatus(loginStatus));
    }
}

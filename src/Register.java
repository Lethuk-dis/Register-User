
public class Register {

    
    private String username;
    private String password;
    private String phoneNumber;
    
    //Username check
    public boolean checkUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }
    
    //Password check
    public boolean checkPassword(String password) {
        return password.length() >=8 &&
               password.matches(".*[A-Z]*.")&&
               password.matches(".*[0-9]*.")&&
               password.matches(".*[!@#$%^&*()].*");
    }
    
    //SA phone number check
    public boolean checkPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\+27[0-9]{9}");
    }
    
    //Register user
    public String registerUser(String username, String password, String phoneNumber) {
        
        if (!checkUserName(username)){
            return "Username is not correctly formatted, please unsure it contains an underscore and is no more than 5 characters.";
        }
        if (!checkPassword(password)){
            return"Password is not not correctly formatted, please ensure it contains at least 8 characters, a capital letter, a number and a special character.";
        }
        if(!checkPhoneNumber(phoneNumber)){
            return"Cell phone number incorrectlly formatted. Must start with +27.";
        }
        
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        
        return "User registered successfully.";
    }
    
    //Login check
    public boolean loginUser(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
    
    //Login message
    public String returnLoginStatus(boolean status) {
        if (status) {
            return"Welcome "+ username + " it is great to see you again.";
        } else{
            return "Username or password incorrect, please try again.";
        }
    }

    boolean retunLoginStatus(boolean loginStatus) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


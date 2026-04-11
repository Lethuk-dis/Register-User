
public class login {
    
    private String username;
    private String password;
    private String phoneNumber;
    
    //Constructor
    public login(String username, String password, String phoneNumber) {
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }
    
    //Check username: must be <5 characters and contain an underscore
    public boolean checkName(){
        if(username == null|| username.length() >=5){
            return false;
        }
        return username.contains("_");
    }
    
    //Check password complexity
    public boolean checkPasswordComplexity(boolean Special){
        if(password==null||password.length()<=8){
            return false;
        }
        
        boolean hasUpper = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;
        
        for(char c: password.toCharArray()){
            if(Character.isUpperCase(c))hasUpper = true;
            if(Character.isDigit(c))hasNumber = true;
            
            {
                hasSpecial = true;
            }
        }
        
        return hasUpper&&hasNumber&&hasSpecial;
    }
    
    //Check South African phone number
    public boolean checkphoneNumber(){
        if(phoneNumber==null){
            return false;
        }
        
        String cleaned = phoneNumber.replaceAll("\\s+","");
        
        if(!cleaned.startsWith("+27")){
            return false;
        }
        
        String digits = cleaned.substring(3);
        if(digits.length()!=9){
            return false;
        }
        
        for(char c: digits.toCharArray()){
            if(!Character.isDigit(c)){
                return false;
            }
        }
        
        return true;
    }
}


public class strg {
    public static void main(String[] args) {
        //concatenation
        String firstName= "Tony";
        String lastName= "Stark";
        String fullName= firstName +" 3000 "+ lastName;
        System.out.println("Your full name is: "+ fullName.length());
        
        //charAt
        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }
    }
}



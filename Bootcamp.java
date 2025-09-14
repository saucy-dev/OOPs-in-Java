class TooYoungException extends RuntimeException{
    public TooYoungException(String message){
        super(message);
    }
}
class TooOldException extends RuntimeException{
    public TooOldException(String message){
        super(message);
    }
}


public class Bootcamp {
    public static void enroll(String name, int age){  
    if(age<15) {
        throw new TooYoungException("Sorry "+name+", you are too young");
    }else if (age>50){
        throw new TooOldException("Sorry "+ name + ", you are too old.");
    }else{
        System.out.println("Welcome "+name+", you have successfully enrolled in the bootcamp !");
    }
    }
    public static void main(String[] args) {
    
    }
    
    
}


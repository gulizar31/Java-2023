package Review3;

public class LogicalAnd {
    public static void main(String[] args) {
        boolean rain=true;
        boolean cold=true;

        if (cold && rain){
            System.out.println("I am staying home");
        }

        boolean messageDisplayed=true;
        String errorMessage="invalid credentials";

        if(messageDisplayed)
        System.out.println("Error");
    }
}

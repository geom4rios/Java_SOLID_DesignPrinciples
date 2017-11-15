import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends  CaffeineBeverage{

    @Override
    protected void brew() {
        System.out.println("Brewed Coffee Grinds!");
    }

    @Override
    protected void addContiments() {
        System.out.println("Added sugar and milk into the coffee");
    }

    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInput();

        if(answer.toLowerCase().startsWith("y")){
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;

        System.out.print("Would you like milk and sugar with your coffee?");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe){
            System.err.println("Error trying to read your line");
        }

        if(answer == null) {
            return "no";
        }
        return answer;
    }

}

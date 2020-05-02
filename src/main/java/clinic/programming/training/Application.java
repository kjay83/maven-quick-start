package clinic.programming.training;

import java.util.List;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;

public class Application {
    
	public int countWords(String s){
		String[] separateWords = StringUtils.split(s,' ');
		return (separateWords == null) ? 0 : separateWords.length;
	}
	
	public void greet(){
		List<String> greetings = new ArrayList<>();
		greetings.add("Hello Man");
		
		for (String greet : greetings){
			System.out.println("Greeting : "+greet);
		}
	}
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		Application app = new Application();
		app.greet();
		
		
    	System.out.println ("Word count = "+app.countWords("testing the world with udemy"));
    }
}

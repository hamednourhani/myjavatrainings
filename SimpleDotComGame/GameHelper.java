public class GameHelper{

	public String getUserInput(String message){
		System.out.print("Enter something:");
		String input = (String) System.console().readLine();	
		return input;
	}

}
import java.util.*;

public class DotComGame{

	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComs = new ArrayList<DotCom>();
	private int userHints = 0;

	private void setupGame(){


		DotCom dotOne = new DotCom();
		dotOne.setDotComName("itstar.ir");

		DotCom dotTwo = new DotCom();
		dotTwo.setDotComName("digikala.com");

		DotCom dotThree = new DotCom();
		dotThree.setDotComName("jobinja.com");

		dotComs.add(dotOne);
		dotComs.add(dotTwo);
		dotComs.add(dotThree);
	
		System.out.println("Welcome !");
		System.out.println("Game is Starting ...");
		System.out.println("--------------------");
		
		for(DotCom dotComToSet : dotComs){
			
			ArrayList<String> locat = helper.placeDotCom(3);
			dotComToSet.setLocations(locat);

		}

	}
	private void playGame(){
		while(!dotComs.isEmpty()){
			String newGuess = helper.getUserInput("Enter new Cell : ");
			checkUserGuess(newGuess);
		}
		finishGame();
	}

	private String checkUserGuess(String guess){
		String result = "fail";

		userHints++;

		for(DotCom thisDotCom : dotComs){
			result = thisDotCom.checkYourself(guess);
			if(result.equals("hint")){
				break;
			}
			if(result.equals("kill")){
				dotComs.remove(thisDotCom);
				break;
			}
		}

		return result;
	}

	private void finishGame(){

		System.out.println("All DotComs Are dead !");
		System.out.println("----------------------");
		System.out.println(" ");

		if(userHints < 15){
			System.out.println("Congragulations !");
			System.out.println("Your Score : " + userHints); 
		} else {
			System.out.println("Bad Game!!!");
			System.out.println("Your Score : " + userHints);
		}
	}

	public static void main(String[] args){

		DotComGame game = new DotComGame();
		game.setupGame();
		game.playGame();
	}
}

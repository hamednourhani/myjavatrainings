public class SimpleDotComGame{
	public static void main(String[] args){
		
		int userhints = 0 ;

		GameHelper helper = new GameHelper();

		boolean isAlive = true;

		SimpleDotCom dm = new SimpleDotCom();

		int firstcell = (int) (Math.random()*5);
		int[] locations = {firstcell,firstcell+1,firstcell+2};

		dm.setLocations(locations);

		while(isAlive == true){
			String userGuess = helper.getUserInput("Enter Cell Number 1 to 10");
			
			userhints++;

			String result = dm.checkYourself(userGuess);
			if(result == "kill"){
				break;
			}
			System.out.println(result);
		}

		System.out.println("You've Killed DotCom");
		System.out.println("your Hints : "+ userhints);

	}
}
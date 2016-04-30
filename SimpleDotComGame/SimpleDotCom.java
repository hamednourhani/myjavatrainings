public class SimpleDotCom{
	private int hitCount = 0;
	private int[] locations ;
	
	public void setLocations(int[] loc){
		locations = loc;
	}

	public String checkYourself(String guess){
		int userGuess = Integer.parseInt(guess);
		String result = "fail";
		for(int loc : locations){
			if(loc == userGuess){
				result = "hint";
				hitCount++;
				break;
			}
		}

		if(hitCount == 3){
			return "kill";
		}

		return result;
	}
}
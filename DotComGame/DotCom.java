import java.util.*;

public class DotCom{

	private ArrayList<String> locations ;
	private String dotComName ;
	
	public void setLocations(ArrayList<String> loc){
		locations = loc;
	}

	public void setDotComName(String dtName){
		dotComName = dtName;
	}

	public String checkYourself(String guess){
		String result = "fail";

		int index = locations.indexOf(guess);
		
		if(index >= 0 ){
			locations.remove(guess);

			if(locations.isEmpty()){
				result = "kill";
				System.out.println("You Killed this : " + dotComName);
			} else {
				result = "hint";
			}
		} 

		return result;
	}
}
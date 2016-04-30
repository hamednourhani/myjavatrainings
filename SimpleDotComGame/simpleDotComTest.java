public class SimpleDotComTest {
	
	public static void main(String[] args){

		SimpleDotCom dm = new SimpleDotCom();
		
		int[] locations = {2,3,4};
		dm.setLocations(locations);

		String result = "fail";

		for(String ge : args)
			result = dm.checkYourself(ge);
		

		System.out.println(result);
	}
}
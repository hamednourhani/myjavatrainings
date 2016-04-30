public class PhaseOMatic{
	
	

	private static int listOneLength;
	private static int listTwoLength;
	private static int listThreeLength;

	public static void main(String[] args){

		String[] wrodListOne = {"one","two","three"};
		String[] wrodListTwo = {"four","five","six"};
		String[] wrodListThree = {"seven","eight","nine"};

		listOneLength = wrodListOne.length();
		listTwoLength = wrodListTwo.length();
		listThreeLength = wrodListThree.length();

		int x1 = (int)(Math.random()*listOneLength);
		int x3 = (int)(Math.random()*listTwoLengthLength);
		int x2 = (int)(Math.random()*listThreeLengthLength);

		System.out.println(wrodListOne[x1] + " " + wrodListTwo[x2] + " " + wrodListThree[x3]);
	}
}
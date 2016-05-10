public class NewListClass{
	private Animal[] list = new Animal[5];
	private int nextIndex = 0;

	public void add(Animal a){
		if(nextIndex < list.length){
			list[nextIndex] = a;
			System.out.println("Next Animal Added to list.");
		} else{
			System.out.println("the list is full");
		}

		nextIndex++;
	}
}
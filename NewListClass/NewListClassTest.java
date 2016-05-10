public class NewListClassTest{
	
	public static void main(String[] args){

		NewListClass animalList = new NewListClass();
		
		Dog dog1 = new Dog(); 
		
		dog1.setImage("dog1.png");
		dog1.getImage();

		animalList.add(dog1);

		Dog dog2 = new Dog();

		dog2.setImage("dog2.png");
		dog2.getImage();
		
		dog1.getImage();

		animalList.add(dog2);

		Cat cat1 = new Cat();

		cat1.setImage("cat1.png");
		cat1.getImage();

		
		
		System.out.println(cat1.getClass());
		System.out.println(cat1.hashCode());
		System.out.println(cat1);

		animalList.add(cat1);


	}
}
public class Animal{
	private String image = "default.png";

	public void setImage(String img){
		image = img;
	}

	public String getImage(){
		System.out.println("Image : "+ image);
		return image;
	}
}
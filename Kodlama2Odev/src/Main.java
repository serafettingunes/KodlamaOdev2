
public class Main {

	public static void main(String[] args) {
		Property property1=new Property(1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR) ","Engin Demir��","profileimage.jpeg","image.jpeg");
		
		Property[] properties= {property1};
		
		for (Property property : properties) {
			System.out.println(property.Image);
			System.out.println(property.propertyTitle);
			System.out.println(property.profileImage);
			System.out.println(property.profileName);
			
			
		}
		
		System.out.println("----------------------------------");
		WorkClass workClass=new WorkClass();
		workClass.method1(property1);
		
		workClass.method2(property1);
	System.out.println();
	}

}
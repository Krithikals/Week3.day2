package week3.day2;

public class Desktop implements HardWare,Software{

	public void softwareResources(int ram) {
		System.out.println("the size of the ram is " + ram);
		
	}

	public void hardwareResources(float screenSize, String mouse, String laptop) {
		System.out.println("the Screensize is " + screenSize);
		System.out.println("the mouse brand is " + mouse);
		System.out.println("the laptop brand is " + laptop);
		
	}
	
	public void desktopModel(String desktop) {
		System.out.println("The system model is " + desktop);

	}

	public static void main(String[] args) {
		Desktop dskObj = new Desktop();
		dskObj.hardwareResources(6.5F, "Boat", "Apple");
		dskObj.softwareResources(8);
		dskObj.desktopModel("HP");
	}
}

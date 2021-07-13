package test;

public class Calendar1 {
	
	public static void main(String[] args) {
		 
		
		String name = "file:///D:/Java/Projects/MSEDCL/src/test/resources/featureFiles/HomePage.feature:1"; 
		
		String modName = name.replaceAll("file:///D:/Java/Projects/MSEDCL/src/test/resources/featureFiles/", "");
		
		System.out.println(modName);	
		System.out.println(modName.split(":")[0]);
		
		
	}

}

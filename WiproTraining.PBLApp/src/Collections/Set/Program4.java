package Collections.Set;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Country2 countries = new Country2();
	        countries.saveCountryNames("India");
	        countries.saveCountryNames("Canada");
	        countries.saveCountryNames("Germany");
	        countries.saveCountryNames("Spain");
	        countries.saveCountryNames("France");

	        System.out.println("Nepal: " + countries.getCountry("Nepal"));
	        System.out.println("Spain: " + countries.getCountry("Spain"));
	}

}

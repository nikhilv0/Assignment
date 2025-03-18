class PrintCountry{
		public static void CountryNames(String[] values){
			for(String Country:values){
			if(Country.endsWith("a"))||Country.endsWith("A")){
				System.out.println(Country);
				}
		}
	}
		
		public static void main(String[] values){
			System.out.println("Countries:");
				String[] Countries={"India", "ChinA", "CanadA", "USA", "Australia", "Brazila", "Russia", "Argentina"};
				CountryNames(Countries);
	
	}
	}
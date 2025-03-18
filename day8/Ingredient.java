class Ingredient{
		public static String foodItem(String values){
			if(values.equals("biriyani")){
			return "chicken,spices,rice";
			}
			return "Invalid";
		}
		
		public static void main(String[] args){
		String ref=foodItem("biriyani");
		System.out.println(ref);
		
		}
}
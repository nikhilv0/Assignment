class Broker{
		public static void brokerage(String vegitable,int quantity){
				System.out.println("broker vegitable:"+vegitable+"\n broker quantity:"+quantity);
				
				Farmer.farm(vegitable,quantity);
		
		}
		
	}

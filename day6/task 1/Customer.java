class Customer{
		public static void buy(String vegitable,int quantity){
				System.out.println("vegitable:"+vegitable+"\n quantity:"+quantity);
				Agent.purchase(vegitable,quantity);
		}
	}

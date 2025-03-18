class Agent{
		public static void purchase(String vegitable,int quantity){
				System.out.println("vegitable:"+vegitable+"\n quantity:"+quantity);
				Broker.brokerage(vegitable,quantity);
		}
	}

class SubRegionalPostOffice{
		public static void deliver(String customername,int address){
		
		System.out.println("customername:"+customername+"\naddress:"+address);
		RegionalPostOffice.deliver(customername,address);
		}
	}
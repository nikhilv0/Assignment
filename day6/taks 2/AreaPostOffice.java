class AreaPostOffice{
		public static void deliver(String customername,int address){
		
		System.out.println("customername:"+customername+"\naddress:"+address);
		SubRegionalPostOffice.deliver(customername,address);
		}
	}
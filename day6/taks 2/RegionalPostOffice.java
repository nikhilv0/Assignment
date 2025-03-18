class RegionalPostOffice{
		public static void deliver(String customername,int address){
		
		System.out.println("customername:"+customername+"\naddress:"+address);
		HeadMaster.post(customername,address);
		}
	}
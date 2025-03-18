class HeadMaster{
		public static void post(String customername,int address){
		
		System.out.println("customername:"+customername+"\naddress:"+address);
		PostMaster.post(customername,address);
		}
	}
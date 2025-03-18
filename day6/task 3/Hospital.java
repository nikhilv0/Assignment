class Hospital{
		public static void checkup(String customername,int age,long phno,String email,String sickness){
		
		System.out.println("customername:"+customername+"\nage:"+age+"\nphno:"+phno+"\nemail:"+email+"\nsickness:"+sickness);
		Doctor.treatment(customername,age);
		
		}
	}
	
import java.util.Arrays;
class Ascending{
		public static void PrintMails(char[] values){
			Arrays.sort(values);
			for(char alpha: values){
			System.out.println(alpha);
		
			
		}
		}
		
		
			public static void main(String[] args){
				System.out.println("Ascending order:");
				char[] Nik={'c','b','a','n'};
				PrintMails(Nik);
		}
	}
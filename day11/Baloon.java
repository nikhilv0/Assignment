class Baloon{
		
		String color;  
		int size;  
		String material;  
		float pressure;  
		char grade;
		boolean floating; 

		public Baloon(){
		System.out.println("Boloon:");

		}
		public Baloon(String color){	
		this.color=color;
		}
		
		public Baloon(String color,int size){
		this(color);
		this.size=size;
		}
		
		public Baloon(String color,int size,String material){
		this(color,size);
		this.material=material;
		}
		
		public Baloon(String color,int size,String material,float pressure){
		this(color,size,material);
		this.pressure=pressure;
		}
		
		public Baloon(String color,int size,String material,float pressure,char grade){
		this(color,size,material,pressure);
		this.grade=grade;
		}
		
		public Baloon(String color,int size,String material,float pressure,char grade,boolean floating){
		this(color,size,material,pressure,grade);
		this.floating=floating;
		}
		
		void Display(){
		System.out.println("color:"+color+"\nsize:"+size+"\nmaterial:"+material+"\npressure:"+pressure+"\ngrade:"+grade+"\nfloating:"+floating);
		System.out.println("============================");
	}
}
	
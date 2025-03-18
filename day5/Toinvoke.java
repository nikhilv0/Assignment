class Toinvoke{
		public static void main(String[] args){
			String item="eggpuff";
			String kilo="2";
			Bakery.buy(item,kilo);
			
			boolean yesorno=true;
			Bakery.open(yesorno);
			
			boolean yon=true;
			Bakery.close(yon);
			
			String own="Kattappaa";
			Bakery.owner(own);
			
			String cash="ryan";
			Bakery.cashier(cash);
			
			}
	}
class FoodItem{
		public static int prices(String foodItem){
			
			System.out.println("fooditem:"+foodItem);
			if(foodItem=="Biriyani"){
			return 160;
			}
			if(foodItem == "Burger"){
			return 599;
			}   
			else if(foodItem == "Pizza"){
				return 899;
			}   
			else if(foodItem == "Pasta"){
				return 749;
			}   
			else if(foodItem == "Sandwich"){
				return 499;
			}   
			else if(foodItem == "Tacos"){
				return 699;
			}   
			else if(foodItem == "Sushi"){
				return 1299;
			}   
			else if(foodItem == "Salad"){
				return 549;
			}   
			else if(foodItem == "Fries"){
				return 299;
			}   
			else if(foodItem == "Ice Cream"){
				return 399;
			}   
			else if(foodItem == "Coffee"){
				return 249;
			}   
			else if(foodItem == "Pancakes"){
				return 649;
			}   
			else {
				return -1;
			}

		}			
    }
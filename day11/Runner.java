class  Runner{
		public static void main(String[] values){

		Baloon baloon1 = new Baloon("red",2,"latex",1.2f,'A',true);
		Baloon baloon2 = new Baloon("blue", 3, "rubber", 1.5f, 'B', false);  
		Baloon baloon3 = new Baloon("green", 5, "latex", 2.0f, 'A', true);  
		Baloon baloon4 = new Baloon("yellow", 4, "foil", 1.8f, 'C', false);  
		Baloon baloon5 = new Baloon("pink", 2, "latex", 1.1f, 'B', true);  
		Baloon baloon6 = new Baloon("white", 6, "rubber", 2.2f, 'A', false);  
		Baloon baloon7 = new Baloon("purple", 3, "foil", 1.6f, 'C', true);  

		baloon1.Display();
		baloon2.Display();
		baloon3.Display();
		baloon4.Display();
		baloon5.Display();
		baloon6.Display();
		baloon7.Display();
		
		
		
		Egg egg1 = new Egg("Chicken", "Brown", 60.5f, true, "Farm Fresh", 10);
        Egg egg2 = new Egg("Duck", "White", 70.0f, false, "Local Market", 12);
        Egg egg3 = new Egg("Quail", "Speckled", 15.2f, true, "Organic", 8);
        Egg egg4 = new Egg("Ostrich", "Light Brown", 1500.0f, false, "Wild", 20);
        Egg egg5 = new Egg("Goose", "White", 90.3f, true, "Farm", 14);
        Egg egg6 = new Egg("Turkey", "Cream", 75.5f, false, "Free Range", 11);
        Egg egg7 = new Egg("Pigeon", "Gray", 50.0f, true, "Organic", 7);

        egg1.display();
        egg2.display();
        egg3.display();
        egg4.display();
        egg5.display();
        egg6.display();
        egg7.display();

        
        Bucket bucket1 = new Bucket("Plastic", "Red", 10, 30.5f, true, "Tata");
        Bucket bucket2 = new Bucket("Metal", "Blue", 15, 35.0f, false, "Havells");
        Bucket bucket3 = new Bucket("Plastic", "Green", 8, 25.0f, true, "Generic");
        Bucket bucket4 = new Bucket("Aluminum", "Silver", 12, 40.0f, true, "Local");
        Bucket bucket5 = new Bucket("Steel", "Gray", 20, 50.0f, false, "Strong");
        Bucket bucket6 = new Bucket("Plastic", "Yellow", 5, 20.5f, true, "Durable");
        Bucket bucket7 = new Bucket("Rubber", "Black", 7, 22.0f, false, "Soft");

        bucket1.display();
        bucket2.display();
        bucket3.display();
        bucket4.display();
        bucket5.display();
        bucket6.display();
        bucket7.display();

        
        Tomato tomato1 = new Tomato("Cherry", "Red", 50.5f, true, "Farm Fresh", 7);
        Tomato tomato2 = new Tomato("Beefsteak", "Pink", 200.0f, false, "Market", 10);
        Tomato tomato3 = new Tomato("Roma", "Red", 150.3f, true, "Organic", 9);
        Tomato tomato4 = new Tomato("Heirloom", "Yellow", 180.0f, false, "Wild", 6);
        Tomato tomato5 = new Tomato("Grape", "Green", 40.2f, true, "Farm", 8);
        Tomato tomato6 = new Tomato("Plum", "Orange", 160.5f, false, "Local", 12);
        Tomato tomato7 = new Tomato("Pear", "Red", 110.3f, true, "Organic", 11);

        tomato1.display();
        tomato2.display();
        tomato3.display();
        tomato4.display();
        tomato5.display();
        tomato6.display();
        tomato7.display();

		Gun gun1 = new Gun("Pistol", "Glock 17", 9.0f, 17, "Glock", false);
        Gun gun2 = new Gun("Rifle", "AK-47", 7.62f, 30, "Kalashnikov", true);
        Gun gun3 = new Gun("Shotgun", "Remington 870", 12.0f, 5, "Remington", false);
        Gun gun4 = new Gun("SMG", "MP5", 9.0f, 30, "Heckler & Koch", true);
        Gun gun5 = new Gun("Sniper", "AWM", 7.62f, 5, "Accuracy International", false);
        Gun gun6 = new Gun("Machine Gun", "M249", 5.56f, 200, "FN Herstal", true);
        Gun gun7 = new Gun("Revolver", "Colt Python", 6.0f, 6, "Colt", false);

        gun1.display();
        gun2.display();
        gun3.display();
        gun4.display();
        gun5.display();
        gun6.display();
        gun7.display();

        
        NailPolish polish1 = new NailPolish("Lakme", "Red", 10, true, 199.99f, false);
        NailPolish polish2 = new NailPolish("Maybelline", "Pink", 12, false, 249.99f, true);
        NailPolish polish3 = new NailPolish("Revlon", "Blue", 15, true, 299.99f, false);
        NailPolish polish4 = new NailPolish("Sally Hansen", "Green", 10, false, 189.99f, true);
        NailPolish polish5 = new NailPolish("L'Oreal", "Purple", 14, true, 259.99f, false);
        NailPolish polish6 = new NailPolish("Nykaa", "Black", 13, false, 199.99f, true);
        NailPolish polish7 = new NailPolish("OPI", "White", 11, true, 289.99f, false);
		
		polish1.display();
		polish2.display();
		polish3.display();
		polish4.display();
		polish5.display();
		polish6.display();
		polish7.display();
	

		
		Holi holi1 = new Holi("India", "Festival of Colors", "Spring", true, 3, "Hindus");
        Holi holi2 = new Holi("Nepal", "Festival of Love", "March", true, 2, "Global");
        Holi holi3 = new Holi("USA", "Color Festival", "April", false, 1, "Everyone");
        Holi holi4 = new Holi("UK", "Color Run", "June", false, 1, "Charity Events");
        Holi holi5 = new Holi("Canada", "Festival of Joy", "May", false, 2, "Mixed Culture");
        Holi holi6 = new Holi("Australia", "Color Blast", "July", false, 1, "Public");
        Holi holi7 = new Holi("Fiji", "Hindu Celebration", "March", true, 3, "Hindus");

        holi1.display();
        holi2.display();
        holi3.display();
        holi4.display();
        holi5.display();
        holi6.display();
        holi7.display();

        
        Pichkari pichkari1 = new Pichkari("Plastic", "Red", 500, 3.0f, "Water Gun", true);
        Pichkari pichkari2 = new Pichkari("Metal", "Blue", 600, 3.5f, "Pressure Pump", false);
        Pichkari pichkari3 = new Pichkari("Rubber", "Green", 400, 2.8f, "Squeeze Bottle", true);
        Pichkari pichkari4 = new Pichkari("Plastic", "Yellow", 450, 3.2f, "Holi Blaster", false);
        Pichkari pichkari5 = new Pichkari("Steel", "Black", 700, 4.0f, "Super Soaker", true);
        Pichkari pichkari6 = new Pichkari("Silicone", "Pink", 480, 3.1f, "FunSpray", false);
        Pichkari pichkari7 = new Pichkari("Plastic", "Orange", 550, 3.6f, "Splash Shooter", true);

        pichkari1.display();
        pichkari2.display();
        pichkari3.display();
        pichkari4.display();
        pichkari5.display();
        pichkari6.display();
        pichkari7.display();

       
        Color color1 = new Color("Red", "Powder", true, "Organic", 250, "Holi");
        Color color2 = new Color("Blue", "Liquid", false, "Synthetic", 300, "Art");
        Color color3 = new Color("Green", "Gel", true, "Eco-Friendly", 200, "Makeup");
        Color color4 = new Color("Yellow", "Powder", false, "Non-Toxic", 220, "Festivals");
        Color color5 = new Color("Pink", "Liquid", true, "Natural", 270, "Painting");
        Color color6 = new Color("Orange", "Gel", false, "Artificial", 290, "Decor");
        Color color7 = new Color("Purple", "Powder", true, "Herbal", 310, "Traditional");

        color1.display();
        color2.display();
        color3.display();
        color4.display();
        color5.display();
        color6.display();
        color7.display();

        
        WaterBall ball1 = new WaterBall("Red", 5.5f, "Plastic", true, 500, "FunSplash");
        WaterBall ball2 = new WaterBall("Blue", 6.0f, "Rubber", false, 700, "AquaBall");
        WaterBall ball3 = new WaterBall("Green", 4.8f, "Plastic", true, 450, "HoliBlast");
        WaterBall ball4 = new WaterBall("Yellow", 5.2f, "Silicone", false, 600, "Splashy");
        WaterBall ball5 = new WaterBall("Pink", 6.5f, "Rubber", true, 750, "WaterWave");
        WaterBall ball6 = new WaterBall("White", 5.0f, "Plastic", false, 550, "HoliBall");
        WaterBall ball7 = new WaterBall("Purple", 6.3f, "Silicone", true, 650, "WaterBomb");

        ball1.display();
        ball2.display();
        ball3.display();
        ball4.display();
        ball5.display();
        ball6.display();
        ball7.display();


		
		}
    }
		
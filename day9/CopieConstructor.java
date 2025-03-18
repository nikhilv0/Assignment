class CopieConstructor{
		public static void main(String[] Values){
		Star star1=new Star();
		Star star2=new Star();
		Star star3=new Star();
		Star star4=new Star();
		Star star5=new Star();
		Star star6=new Star();
		Star star7=new Star();
		Star star8=new Star();
		Star star9=new Star();
		Star star10=new Star();
		
		System.out.println("------------------------------------");

		star1.Radius=2;star1.Name="Sun";star1.Mass=10d;star1.SpecctrialType='G';
		System.out.println("star1 Radius:"+star1.Radius+"\nstar1 Name:"+star1.Name+"\nstar1 Mass:"+star1.Mass+"\nstar1 SpecctrialType:"+star1.SpecctrialType);
		System.out.println("------------------------------------");
		
		
		Bag bag1=new Bag();
		Bag bag2=new Bag();
		Bag bag3=new Bag();
		Bag bag4=new Bag();
		Bag bag5=new Bag();
		Bag bag6=new Bag();
		Bag bag7=new Bag();
		Bag bag8=new Bag();
		Bag bag9=new Bag();
		Bag bag10=new Bag();
		
		bag1.Material="Cutton";bag1.Brand="SkyBags";bag1.Capacity='M';bag1.Weight=4;
		System.out.println("bag1 Material:"+bag1.Material+"\nbag1 Brand:"+bag1.Brand+"\nbag1 Capacity:"+bag1.Capacity+"\nbag1 Weight:"+bag1.Weight);
		System.out.println("------------------------------------");



		Metro metro1=new Metro();
		Metro metro2=new Metro();
		Metro metro3=new Metro();
		Metro metro4=new Metro();
		Metro metro5=new Metro();
		Metro metro6=new Metro();
		Metro metro7=new Metro();
		Metro metro8=new Metro();
		Metro metro9=new Metro();
		Metro metro10=new Metro();
		
		metro1.Name="Vande barth";metro1.Speed=100;metro1.Price=40;metro1.Avialability=true;
		System.out.println("metro1 Name:"+metro1.Name+"\nmetro1 speed:"+metro1.Speed+"\nmetro1.Price:"+metro1.Price+"\nmetro1.Avialability:"+metro1.Avialability);
		System.out.println("------------------------------------");
		
		Industry industry = new Industry();
		Industry industry1 = new Industry();
		Industry industry2 = new Industry();
		Industry industry3 = new Industry();
		Industry industry4 = new Industry();
		Industry industry5 = new Industry();
		Industry industry6 = new Industry();
		Industry industry7 = new Industry();
		Industry industry8 = new Industry();
		Industry industry9 = new Industry();
		
        industry.workers = 500; industry.productionRate = 120.5; industry.category = "Manufacturing"; industry.running = true;
		System.out.println("Industry: Workers=" + industry.workers + "\nProductionRate=" + industry.productionRate + "\nCategory=" + industry.category + "\nRunning=" + industry.running);
		System.out.println("------------------------------------");
		
		PowerBank powerBank = new PowerBank();
		PowerBank powerBank = new PowerBank();
		PowerBank powerBank = new PowerBank();
		PowerBank powerBank = new PowerBank();
		PowerBank powerBank = new PowerBank();
		PowerBank powerBank = new PowerBank();
		PowerBank powerBank = new PowerBank();
		PowerBank powerBank = new PowerBank();
		PowerBank powerBank = new PowerBank();
		PowerBank powerBank = new PowerBank();
		
        powerBank.capacity = 20000; powerBank.weight = 0.4; powerBank.brand = "Anker"; powerBank.fastCharging = true;
        System.out.println("PowerBank: Capacity=" + powerBank.capacity + "\nmAh, Weight=" + powerBank.weight + "\nkg Brand=" + powerBank.brand + "\nFastCharging=" + powerBank.fastCharging);
        System.out.println("------------------------------------");
		
		Bottle bottle = new Bottle();
		Bottle bottle = new Bottle();
		Bottle bottle = new Bottle();
		Bottle bottle = new Bottle();
		Bottle bottle = new Bottle();
		Bottle bottle = new Bottle();
		Bottle bottle = new Bottle();
		Bottle bottle = new Bottle();
		Bottle bottle = new Bottle();
		Bottle bottle = new Bottle();
		
        bottle.volume = 1000; bottle.weight = 0.5; bottle.material = "Steel"; bottle.reusable = true;
        System.out.println("Bottle: Volume=" + bottle.volume + "\nml, Weight=" + bottle.weight + "\nkg, Material=" + bottle.material + "\nReusable=" + bottle.reusable);
		System.out.println("------------------------------------");
		
        Lamp lamp = new Lamp();
		Lamp lamp = new Lamp();
		Lamp lamp = new Lamp();
		Lamp lamp = new Lamp();
		Lamp lamp = new Lamp();
		Lamp lamp = new Lamp();
		Lamp lamp = new Lamp();
		Lamp lamp = new Lamp();
		Lamp lamp = new Lamp();
		Lamp lamp = new Lamp();
		
        lamp.brightness = 800; lamp.powerConsumption = 10.5; lamp.type = "LED"; lamp.smartLamp = true;
        System.out.println("Lamp: Brightness=" + lamp.brightness + "\nlm, PowerConsumption=" + lamp.powerConsumption + "\nW, Type=" + lamp.type + "\nSmartLamp=" + lamp.smartLamp);
		System.out.println("------------------------------------");
		
        Earth earth = new Earth();
		Earth earth = new Earth();
		Earth earth = new Earth();
		Earth earth = new Earth();
		Earth earth = new Earth();
		Earth earth = new Earth();
		Earth earth = new Earth();
		Earth earth = new Earth();
		Earth earth = new Earth();
		Earth earth = new Earth();
		
        earth.radius = 6371; earth.gravity = 9.8; earth.planetType = "Terrestrial"; earth.habitable = true;
        System.out.println("Earth: Radius=" + earth.radius + "\nkm, Gravity=" + earth.gravity + "\nm/s², PlanetType=" + earth.planetType + "\nHabitable=" + earth.habitable);
		System.out.println("------------------------------------");
		
        Bullet bullet = new Bullet();
		Bullet bullet = new Bullet();
		Bullet bullet = new Bullet();
		Bullet bullet = new Bullet();
		Bullet bullet = new Bullet();
		Bullet bullet = new Bullet();
		Bullet bullet = new Bullet();
		Bullet bullet = new Bullet();
		Bullet bullet = new Bullet();
		Bullet bullet = new Bullet();
		
        bullet.speed = 900; bullet.caliber = 5.56; bullet.material = "Lead"; bullet.lethal = true;
		System.out.println("Bullet: Speed=" + bullet.speed + "m/s, \nCaliber=" + bullet.caliber + "mm, \nMaterial=" + bullet.material + "\nLethal=" + bullet.lethal);
		System.out.println("------------------------------------");
		
        Flag flag = new Flag();
        flag.height = 3; flag.width = 1.5; flag.country = "USA"; flag.flying = true;
        System.out.println("Flag: Height=" + flag.height + "m \nWidth=" + flag.width + "m \nCountry=" + flag.country + "\nFlying=" + flag.flying);
		System.out.println("------------------------------------");
		
        Chocolate chocolate = new Chocolate();
        chocolate.weight = 250; chocolate.cocoaPercentage = 70.5; chocolate.brand = "Lindt"; chocolate.darkChocolate = true;
        System.out.println("Chocolate: Weight=" + chocolate.weight + "\ng, CocoaPercentage=" + chocolate.cocoaPercentage + "\n%, Brand=" + chocolate.brand + "\nDarkChocolate=" + chocolate.darkChocolate);
		System.out.println("------------------------------------");
		
        Camera camera = new Camera();
        camera.resolution = 48; camera.lensSize = 24.7; camera.brand = "Canon"; camera.digital = true;
        System.out.println("Camera: Resolution=" + camera.resolution + "\nMP, LensSize=" + camera.lensSize + "\nmm, Brand=" + camera.brand + "\nDigital=" + camera.digital);
		System.out.println("------------------------------------");
		
        Train train = new Train();
        train.speed = 300; train.length = 200.5; train.type = "Bullet Train"; train.electric = true;
        System.out.println("Train: Speed=" + train.speed + "\nkm/h, Length=" + train.length + "\nm, Type=" + train.type + "\nElectric=" + train.electric);
        System.out.println("------------------------------------");
		
        Road road = new Road();
		road.length = 1000; road.width = 10.5; road.material = "Asphalt"; road.highway = true;
		System.out.println("Road: Length=" + road.length + "\nkm, Width=" + road.width + "\nm, Material=" + road.material + "\nHighway=" + road.highway);
		System.out.println("------------------------------------");
		}
	}
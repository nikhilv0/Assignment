public class MainMethod {
    public static void main(String[] args) {
        Festival festival1 = new Festival("Diwali", "November", "India");
        Festival festival2 = new Festival("Christmas", "December", "Worldwide");
        Festival festival3 = new Festival("Eid", "Varies", "Worldwide");
        Festival festival4 = new Festival("Holi", "March", "India");
        Festival festival5 = new Festival("Thanksgiving", "November", "USA");
        
        System.out.println(festival1.name + " -" + festival1.date + " - " + festival1.location);
        System.out.println(festival2.name + " -" + festival2.date + " - " + festival2.location);
        System.out.println(festival3.name + " -" + festival3.date + " - " + festival3.location);
        System.out.println(festival4.name + " -" + festival4.date + " - " + festival4.location);
        System.out.println(festival5.name + " -" + festival5.date + " - " + festival5.location);
		
		Chat chat1 = new Chat("Alice", "Bob", "Hello");
        Chat chat2 = new Chat("Charlie", "David", "Hey");
        Chat chat3 = new Chat("Eve", "Frank", "How are you?");
        Chat chat4 = new Chat("Grace", "Hank", "Good morning");
        Chat chat5 = new Chat("Ivy", "Jack", "See you soon");
        
        System.out.println(chat1.sender + " -> " + chat1.receiver + ": " + chat1.message);
        System.out.println(chat2.sender + " -> " + chat2.receiver + ": " + chat2.message);
        System.out.println(chat3.sender + " -> " + chat3.receiver + ": " + chat3.message);
        System.out.println(chat4.sender + " -> " + chat4.receiver + ": " + chat4.message);
        System.out.println(chat5.sender + " -> " + chat5.receiver + ": " + chat5.message);
		
		Charger charger1 = new Charger("Samsung", 25, "Type-C");
        Charger charger2 = new Charger("Apple", 20, "Lightning");
        Charger charger3 = new Charger("Anker", 30, "USB-C");
        Charger charger4 = new Charger("Sony", 18, "Micro-USB");
        Charger charger5 = new Charger("Xiaomi", 33, "Type-C");
        
        System.out.println(charger1.brand + " - " + charger1.power + "W - " + charger1.type);
        System.out.println(charger2.brand + " - " + charger2.power + "W - " + charger2.type);
        System.out.println(charger3.brand + " - " + charger3.power + "W - " + charger3.type);
        System.out.println(charger4.brand + " - " + charger4.power + "W - " + charger4.type);
        System.out.println(charger5.brand + " - " + charger5.power + "W - " + charger5.type);
		
		
		Harpic harpic1 = new Harpic("Original", 500, true);
        Harpic harpic2 = new Harpic("Lavender", 750, true);
        Harpic harpic3 = new Harpic("Floral", 1000, false);
        Harpic harpic4 = new Harpic("Citrus", 500, true);
        Harpic harpic5 = new Harpic("Bleach", 750, false);
        
        System.out.println(harpic1.variant + " - " + harpic1.volume + "ml - Antibacterial: " + harpic1.antibacterial);
        System.out.println(harpic2.variant + " - " + harpic2.volume + "ml - Antibacterial: " + harpic2.antibacterial);
        System.out.println(harpic3.variant + " - " + harpic3.volume + "ml - Antibacterial: " + harpic3.antibacterial);
        System.out.println(harpic4.variant + " - " + harpic4.volume + "ml - Antibacterial: " + harpic4.antibacterial);
        System.out.println(harpic5.variant + " - " + harpic5.volume + "ml - Antibacterial: " + harpic5.antibacterial);
	
		WhatsApp wa1 = new WhatsApp("John", 5, true);
        WhatsApp wa2 = new WhatsApp("Emily", 2, false);
        WhatsApp wa3 = new WhatsApp("Michael", 10, true);
        WhatsApp wa4 = new WhatsApp("Sarah", 0, false);
        WhatsApp wa5 = new WhatsApp("David", 3, true);
        
        System.out.println(wa1.user + " - Unread: " + wa1.unreadMessages + " - Online: " + wa1.onlineStatus);
        System.out.println(wa2.user + " - Unread: " + wa2.unreadMessages + " - Online: " + wa2.onlineStatus);
        System.out.println(wa3.user + " - Unread: " + wa3.unreadMessages + " - Online: " + wa3.onlineStatus);
        System.out.println(wa4.user + " - Unread: " + wa4.unreadMessages + " - Online: " + wa4.onlineStatus);
        System.out.println(wa5.user + " - Unread: " + wa5.unreadMessages + " - Online: " + wa5.onlineStatus);
		
		
		RatPoison rp1 = new RatPoison("BrandA", 100, true);
        RatPoison rp2 = new RatPoison("BrandB", 200, false);
        RatPoison rp3 = new RatPoison("BrandC", 150, true);
        RatPoison rp4 = new RatPoison("BrandD", 180, false);
        RatPoison rp5 = new RatPoison("BrandE", 250, true);
        
        System.out.println(rp1.brand + " - " + rp1.weight + "g - Effective: " + rp1.toxic);
        System.out.println(rp2.brand + " - " + rp2.weight + "g - Effective: " + rp2.toxic);
        System.out.println(rp3.brand + " - " + rp3.weight + "g - Effective: " + rp3.toxic);
        System.out.println(rp4.brand + " - " + rp4.weight + "g - Effective: " + rp4.toxic);
        System.out.println(rp5.brand + " - " + rp5.weight + "g - Effective: " + rp5.toxic);
	
		Anklet anklet1 = new Anklet("Gold", 21, true);
        Anklet anklet2 = new Anklet("Silver", 22, false);
        Anklet anklet3 = new Anklet("Platinum", 23, true);
        Anklet anklet4 = new Anklet("Bronze", 24, false);
        Anklet anklet5 = new Anklet("Diamond", 25, true);
        
        System.out.println(anklet1.material + " - " + anklet1.size + "cm - Adjustable: " + anklet1.adjustable);
        System.out.println(anklet2.material + " - " + anklet2.size + "cm - Adjustable: " + anklet2.adjustable);
        System.out.println(anklet3.material + " - " + anklet3.size + "cm - Adjustable: " + anklet3.adjustable);
        System.out.println(anklet4.material + " - " + anklet4.size + "cm - Adjustable: " + anklet4.adjustable);
        System.out.println(anklet5.material + " - " + anklet5.size + "cm - Adjustable: " + anklet5.adjustable);
        
      
        Magnet magnet1 = new Magnet("Ferrite", 10, "Black");
        Magnet magnet2 = new Magnet("Neodymium", 15, "Silver");
        Magnet magnet3 = new Magnet("Alnico", 20, "Red");
        Magnet magnet4 = new Magnet("Samarium", 12, "Gray");
        Magnet magnet5 = new Magnet("Ceramic", 18, "Brown");
        
        System.out.println(magnet1.type + " - " + magnet1.strength + " - " + magnet1.color);
        System.out.println(magnet2.type + " - " + magnet2.strength + " - " + magnet2.color);
        System.out.println(magnet3.type + " - " + magnet3.strength + " - " + magnet3.color);
        System.out.println(magnet4.type + " - " + magnet4.strength + " - " + magnet4.color);
        System.out.println(magnet5.type + " - " + magnet5.strength + " - " + magnet5.color);
		
		Chain chain1 = new Chain("Gold", 50, true);
        Chain chain2 = new Chain("Silver", 55, false);
        Chain chain3 = new Chain("Platinum", 60, true);
        Chain chain4 = new Chain("Bronze", 45, false);
        Chain chain5 = new Chain("Diamond", 65, true);
        
        System.out.println(chain1.material + " - " + chain1.length + "cm - Lock: " + chain1.lock);
        System.out.println(chain2.material + " - " + chain2.length + "cm - Lock: " + chain2.lock);
        System.out.println(chain3.material + " - " + chain3.length + "cm - Lock: " + chain3.lock);
        System.out.println(chain4.material + " - " + chain4.length + "cm - Lock: " + chain4.lock);
        System.out.println(chain5.material + " - " + chain5.length + "cm - Lock: " + chain5.lock);
        
        Bar bar1 = new Bar("Steel", 100, 20);
        Bar bar2 = new Bar("Iron", 120, 25);
        Bar bar3 = new Bar("Aluminum", 80, 15);
        Bar bar4 = new Bar("Copper", 90, 18);
        Bar bar5 = new Bar("Brass", 110, 22);
        
        System.out.println(bar1.material + " - " + bar1.length + "cm - Diameter: " + bar1.diameter + "mm");
        System.out.println(bar2.material + " - " + bar2.length + "cm - Diameter: " + bar2.diameter + "mm");
        System.out.println(bar3.material + " - " + bar3.length + "cm - Diameter: " + bar3.diameter + "mm");
        System.out.println(bar4.material + " - " + bar4.length + "cm - Diameter: " + bar4.diameter + "mm");
        System.out.println(bar5.material + " - " + bar5.length + "cm - Diameter: " + bar5.diameter + "mm");
	
		Sagar sagar1=new Sagar("Worker",25,true);
		Sagar sagar2=new Sagar("Part tym Worker",25,true);
		Sagar sagar3=new Sagar("Full tym Worker",25,true);
		Sagar sagar4=new Sagar("Work less Worker",25,true);
		Sagar sagar5=new Sagar("Waste Worker",25,true);
		
		System.out.println(sagar1.occupation + " - " + sagar1.age + " - " + sagar1.married);
		System.out.println(sagar2.occupation + " - " + sagar12.age + " - " + sagar1.married);
		System.out.println(sagar3.occupation + " - " + sagar3.age + " - " + sagar1.married);
		System.out.println(sagar4.occupation + " - " + sagar4.age + " - " + sagar1.married);
		System.out.println(sagar5.occupation + " - " + sagar5.age + " - " + sagar1.married);
		
		Face face1=new Face("Circle","Goodlooking",true);
		Face face2=new Face("Circle","Goodlooking",true);
		Face face3=new Face("Circle","Goodlooking",true);
		Face face4=new Face("Circle","Goodlooking",true);
		Face face5=new Face("Circle","Goodlooking",true);
		
		System.out.println(face1.shape + " - " + face1.complexion + " - " + face1.beard);
		System.out.println(face2.shape + " - " + face2.complexion + " - " + face2.beard);
		System.out.println(face3.shape + " - " + face3.complexion + " - " + face3.beard);
		System.out.println(face4.shape + " - " + face4.complexion + " - " + face4.beard);
		System.out.println(face5.shape + " - " + face5.complexion + " - " + face5.beard);
		
	}
}
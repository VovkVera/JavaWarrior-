package capability.org.ua;

public class Warrior {
	protected String name ="Warrior";
	public int health = 0;
	public int attkMax = 0;
	public int blockMax = 0;
	
	public Warrior() {
		
	}
	public Warrior(String name, int health, int attkMax, int blockMax) {
		this.setName(name);
		this.health = health;
		this.attkMax = attkMax;
		this.blockMax = blockMax;
		
	}
		
	public int attack() {
		return 1+(int)(Math.random()*((attkMax -1 )+1));
	}
	
	
	
	public int blockMax() {
		return 1+(int)(Math.random()*((blockMax -1 )+1));
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}

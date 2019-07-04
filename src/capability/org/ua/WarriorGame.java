package capability.org.ua;

public class WarriorGame {

	public static void main(String[] args) throws InterruptedException {
		Warrior thor = new Warrior("Thor", 800, 130, 40);
		Warrior loki = new DodgeWarrior("Loki", 800, 85, 40, 1.25);
		
		Battle.startFight(thor, loki);
		
		System.out.println("Loki "+ loki.teleport());
		loki.setTeleportAbility(new CanTeleport());
		System.out.println("Loki "+ loki.teleport());
		
	}

}

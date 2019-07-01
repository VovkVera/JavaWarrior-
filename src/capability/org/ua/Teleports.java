package capability.org.ua;

public interface Teleports {
	String teleport();

}

class CanTeleport implements Teleports{
	public String teleport() {
		return "teleport Away";
	}
}

class CantTeleport implements Teleports{
	public String teleport() {
		return "Fail at Teleporting";
	}
}

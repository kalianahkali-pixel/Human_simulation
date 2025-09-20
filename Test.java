package Life;

public class Test {
	public static void main(String[] args) {
		Human h1 = new Human("Kalianah", null, "Male", 4, 4, 4);
		Human h2 = new Human("Kali", h1, "Female",2, 3, 2);
		h1.setTargetAffinity(h2);
		System.out.println(Human.inHarmonyMan_s_Vision(h1, h2));
	}
}

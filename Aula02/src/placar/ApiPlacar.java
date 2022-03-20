package placar;

public class ApiPlacar {

	public static void main(String[] args) {
		
		Placar p1 = new Placar();
		Placar p2 = new Placar("Corinthians", "Santos");
		Placar p3 = new Placar("Corinthians", "Santos", 4, 3);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		

}
}
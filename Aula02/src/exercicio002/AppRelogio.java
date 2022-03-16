package exercicio002;

public class AppRelogio {

	public static void main(String[] args) {
		
		Relogio r1 = new Relogio(24, 25, 45);
		r1.mostrahora();
		r1.setHora(58);
		r1.setMinuto(88);
		r1.setSegundo(99);
		r1.mostrahora();
	}

}

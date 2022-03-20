package placar;

public class Placar {
	private String nomeTimeCasa;
	private String nomeTimeVisitante;
	private int golTimeCasa;
	private int golTimeVisitante;
	private int tempoDeJogo;
	
	public Placar() {
		nomeTimeCasa= "Time da casa";
		nomeTimeVisitante = "Time visitante";

	}
	public Placar(String nomeCasa, String nomeVisitante) {
		nomeTimeCasa = nomeCasa;
		nomeTimeVisitante= nomeVisitante;
		golTimeCasa =0;
		golTimeVisitante=0;
	}
	public Placar(String nomeCasa, String nomeVisitante,int golCasa,int golVisitante) {
		nomeTimeCasa = nomeCasa;
		nomeTimeVisitante= nomeVisitante;
		this.golTimeCasa = golCasa;
		this.golTimeVisitante= golVisitante;
		
		
	}
	
	@Override
	public String toString() {
		return nomeTimeCasa+" "+golTimeCasa+" x "+nomeTimeVisitante+" "+golTimeVisitante;
	}
	
	

}

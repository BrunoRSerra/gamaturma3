package exercicio002;

public class Relogio {
	
	private int hora;
	private int minuto;
	private int segundo;
	
	public Relogio(int hora, int minuto, int segundo) {
		if(hora>0 && hora<23){
			this.hora =hora;	
		}		
		if(minuto>0 && minuto<59) {
			this.minuto=minuto;	
		}
		if(segundo>0 && segundo<59) {
			this.segundo= segundo;
		}		
		
	}
	public void mostrahora() {
		System.out.println(hora+":"+minuto+":"+segundo);
	}
	
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		if(hora>0 && hora<23){
		this.hora = hora;	
		}
		
	}
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		if(minuto>0 && minuto<59) {
			this.minuto = minuto;	
		}
		
	}
	public int getSegundo() {
		return segundo;
	}
	public void setSegundo(int segundo) {
		if(segundo>0 && segundo<59) {
			this.segundo = segundo;
		}
		
	}

}

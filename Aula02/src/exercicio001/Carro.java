package exercicio001;

public class Carro {

	private String marca;
	private String modelo;
	private double consumo;
	
	public Carro(String marca,String modelo,int consumo){
		this.marca=marca;
		this.modelo= modelo;
		this.consumo= consumo;
		
	}
	public void mostrar(){
		System.out.println("Marca "+marca+" Modelo "+modelo);
		
	}
	public double getConsumo() {
		return consumo;
	}
	public  void setConsumo(double novoConsumo) {
		if(novoConsumo>0) {
			consumo= novoConsumo;	
		}
		
	}
	
	
	
	
	}


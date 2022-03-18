package exercico03;

public class Ebook {
	
	private String nomeAutor;
	private String tituloLivro;
	private int totalPagina;
	private int paginaAtual;
	
	public Ebook(String nomeAutor, String tituloLivro,int totalPagina) {
		this.nomeAutor = nomeAutor;
		this.tituloLivro =tituloLivro;
		if(totalPagina>0) {
		this.totalPagina = totalPagina;

		}
	}
	public int getPaginaAtual() {
		return paginaAtual;
	}
	public void avancaPagina() {
		if(paginaAtual<totalPagina) {
			paginaAtual++;
		}
		}
	public void voltarPagina() {
		if(paginaAtual>0) {
			paginaAtual--;
		}
	}
	
	public boolean irParaPagina(int pagina) {
		if(pagina>=0 && pagina<=totalPagina) {
			paginaAtual=pagina;
			return true;
		}
		return false;
	}
	public String mostrar() {
		return tituloLivro+" : "+nomeAutor+" : "+totalPagina;
	}
	
	
	
		
	
	

}
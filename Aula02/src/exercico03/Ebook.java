package exercico03;

public class Ebook {
	
	private String nomeAutor;
	private String tituloLivro;
	private int totalPagina;
	private int paginaAtual;
	
	public Ebook(String nomeAutor, String tituloLivro,int totalPagina) {
		this.nomeAutor = nomeAutor;
		this.tituloLivro =tituloLivro;
		this.totalPagina = totalPagina;
	}
	public void mostraLivro() {
		System.out.println(tituloLivro+":"+nomeAutor+":"+totalPagina);
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

	public String getTituloLivro() {
		return tituloLivro;
	}

	public void setTituloLivro(String tituloLivro) {
		this.tituloLivro = tituloLivro;
	}

	public int getTotalPagina() {
		return totalPagina;
	}

	public void setTotalPagina(int totalPagina) {
		this.totalPagina = totalPagina;
	}

	public int getPaginaAtual() {
		return paginaAtual;
	}

	public void setPaginaAtual(int paginaAtual) {
		if(paginaAtual>=0 && paginaAtual<=totalPagina) {
			this.paginaAtual = paginaAtual;
			
		}
	
	
		
	
	
}
}
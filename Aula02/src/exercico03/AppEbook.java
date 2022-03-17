package exercico03;

public class AppEbook {

	public static void main(String[] args) {

		Ebook livro1 = new Ebook("Bruno", "A espera", 190);
		livro1.mostraLivro();
		livro1.setPaginaAtual(-1);
		
		System.out.println(livro1.getPaginaAtual());
	}

}

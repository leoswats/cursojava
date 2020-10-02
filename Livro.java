
public class Livro {
	private String  titulo;
	private String  autor;
	private int     anoPublicacao;
	private String  categoria;
	private int     posE;
	private int     posP;
	private boolean disponivel;
	
	public Livro(String titulo, String autor, int ano, String cat, int posE, int posP) {
		this.titulo        = titulo;
		this.autor         = autor;
		this.anoPublicacao = ano;
		this.categoria     = cat;
		this.posE          = posE;
		this.posP          = posP;
		this.disponivel    = true;
	}
	public Livro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
//		this.anoPublicacao = 2020;
//		this.categoria = "Sem Categoria";
//		this.posE = 0;
//		this.posP = 0;
//		this.disponivel = false;
	}
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getPosE() {
		return posE;
	}
	public void setPosE(int posE) {
		this.posE = posE;
	}
	public int getPosP() {
		return posP;
	}
	public void setPosP(int posP) {
		this.posP = posP;
	}
	public boolean isDisponivel() {
		return disponivel;
	}
	
	public void emprestar() {
		disponivel = false;
	}
	
	public void devolver() {
		disponivel = true;
	}
	
	public void imprimir() {
		System.out.println("LIVRO: "+titulo+"/"+autor+"("+anoPublicacao+")");
		System.out.println("     "+categoria+"  Posicao E: "+posE+"  P:"+posP);
		if (disponivel) {
			System.out.println("     DISPONIVEL");
		}
		else {
			System.out.println("     EMPRESTADO");
		}
	}
	
	
}

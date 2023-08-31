
public class Loja {
	private int codItemloja;
	private String Imagem;
	private int Valor;
	public Loja(int codItemloja, String imagem, int valor) {
		super();
		this.codItemloja = codItemloja;
		Imagem = imagem;
		Valor = valor;
	}
	public void Loja () {}
	public int getCodItemloja() {
		return codItemloja;
	}
	public void setCodItemloja(int codItemloja) {
		this.codItemloja = codItemloja;
	}
	@Override
	public String toString() {
		return "Loja [codItemloja=" + codItemloja + ", Imagem=" + Imagem + ", Valor=" + Valor + "]";
	}
	public String getImagem() {
		return Imagem;
	}
	public void setImagem(String imagem) {
		Imagem = imagem;
	}
	public int getValor() {
		return Valor;
	}
	public void setValor(int valor) {
		Valor = valor;
	}

}

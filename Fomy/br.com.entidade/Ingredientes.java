
public class Ingredientes {
	private int codIngrediente;
	private String Nome;
	public Ingredientes(int codIngrediente, String nome) {
		super();
		this.codIngrediente = codIngrediente;
		Nome = nome;
	}
	public void Ingredientes() {}
	public int getCodIngrediente() {
		return codIngrediente;
	}
	public void setCodIngrediente(int codIngrediente) {
		this.codIngrediente = codIngrediente;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	@Override
	public String toString() {
		return "Ingredientes [codIngrediente=" + codIngrediente + ", Nome=" + Nome + "]";
	}

}

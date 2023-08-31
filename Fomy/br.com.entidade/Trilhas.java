
public class Trilhas {
	private int codTrilha;
	private String NomeTrilha;
	private String Descricao;
	public Trilhas(int codTrilha, String nomeTrilha, String descricao) {
		super();
		this.codTrilha = codTrilha;
		NomeTrilha = nomeTrilha;
		Descricao = descricao;
	}
	public void Trilhas() {}
	public int getCodTrilha() {
		return codTrilha;
	}
	public void setCodTrilha(int codTrilha) {
		this.codTrilha = codTrilha;
	}
	@Override
	public String toString() {
		return "Trilhas [codTrilha=" + codTrilha + ", NomeTrilha=" + NomeTrilha + ", Descricao=" + Descricao + "]";
	}
	public String getNomeTrilha() {
		return NomeTrilha;
	}
	public void setNomeTrilha(String nomeTrilha) {
		NomeTrilha = nomeTrilha;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

}

package cp3;

public class Produto {
	private String nome;
	private String descricao;
	private double valor;
	
	
	
	public Produto() {
		
	}
	
	
	
	public Produto(String nome, String descricao, double valor) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;

	}



	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	public String toString() {
		return "nome: " + nome + " " + "Descrição: " +" " +  descricao + " " + "Valor; " + valor;
	}

}

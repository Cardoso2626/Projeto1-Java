package cp3;

import java.util.List;
import java.util.ArrayList;
public class ItemVenda {
	private int quantidade;
	private double valorUnitario;
	private List<Produto> produtos;
	
	
	
	
	
	public ItemVenda() {
		
	}
	
	
	public ItemVenda(int quantidade, double valorUnitario) {
		super();
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
		
	}
	
	
	
	public List<Produto> getProdutos() {
		return produtos;
	}


	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}


	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	
	
	public void addProdutos(Produto p1) {
		if (this.produtos == null){
			this.produtos = new ArrayList<>();
			
			
		}
		produtos.add(p1);
	}
	
	public String toString() {
		return "Quantidade: " + quantidade + " " + " Valor unistário: " + valorUnitario + " " + " Produtos" + produtos;
	}
	

}

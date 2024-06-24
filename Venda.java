package cp3;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
public class Venda {
	private LocalDate data;
	private String cliente;
	private String cpf;
	private List<ItemVenda> itensVenda;
	
	
	
	public Venda() {
		
	}
	
	
	
	public Venda(LocalDate data, String cliente, String cpf, List<ItemVenda> itensVenda) {
		super();
		this.data = data;
		this.cliente = cliente;
		this.cpf = cpf;
		this.itensVenda = itensVenda;
	}



	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public List<ItemVenda> getItensVenda() {
		return itensVenda;
	}
	public void setItensVenda(List<ItemVenda> itensVenda) {
		this.itensVenda = itensVenda;
	}
	
	 
	public void addItem(ItemVenda i1) {
		if (this.itensVenda == null) {
			this.itensVenda = new ArrayList<>();
		}
		itensVenda.add(i1);
	}
	

}

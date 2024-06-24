package cp3;

import java.time.LocalDate;

public class Aplicacao {
	public static void main(String[] args) {
		
		
		ItemVenda i1 = new ItemVenda(2, 5.00);
		ItemVenda i2 = new ItemVenda(2, 3.00);
		ItemVenda i3 = new ItemVenda(2, 7.00);
		
		Produto p1 = new Produto ("Chocolate", "Chocolate ao leite", 5.00);
		Produto p2 = new Produto ("Pirulito", "Pirulito de morango", 3.00);
		Produto p3 = new Produto ("Bala-fini", "Bala dentadura", 7.00);
		
		i1.addProdutos(p1);
		i2.addProdutos(p2);
		i3.addProdutos(p3);
		
		Venda v1 = new Venda();
		v1.setData(LocalDate.now());
		v1.setCliente("Marcos Vinicius");
		v1.setCpf("43402892201");
		v1.addItem(i1);
		v1.addItem(i2);
		v1.addItem(i3);
		
		double totalItenVenda1 = i1.getQuantidade() * p1.getValor();
		double totalItenVenda2 =  i2.getQuantidade() * p2.getValor();
		double totalItenVenda3 =  i3.getQuantidade() * p3.getValor();
		
		System.out.println("Sua venda foi: " + "Data" + v1.getData() + " " + "Cliente" +" " +  v1.getCliente() + " " + "Cpf: " + v1.getCpf() + " " +  "Itens de venda: " + v1.getItensVenda());
		System.out.println("Os valores de cada venda foi: " + "Valor do chocolate: " + totalItenVenda1 + " " + "Valor do pirulito : " + totalItenVenda2 + " "  + "Valor da bala-fini : " + totalItenVenda3);
		
		
		
		
	}
}

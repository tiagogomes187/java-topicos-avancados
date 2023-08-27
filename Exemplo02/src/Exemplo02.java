import java.util.ArrayList;
import java.util.List;

class Produto{
	private String nome;
	private Double preco;

	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public void imprime() {
		System.out.println(nome + " - R$ " + preco);
	}
}

class Impressora {
	public static void imprime(Produto p) {
		System.out.println(p.getNome() + " - R$ " + p.getPreco());
	}
}

public class Exemplo02 {
	public static void main(String[] args) {

		List<Produto> lista = new ArrayList<>();
		lista.add(new Produto("TV 42", 2000.00));
		lista.add(new Produto("Geladeira 470L", 3200.00));
		lista.add(new Produto("Fogão 4 bocas", 900.00));
		lista.add(new Produto("Video Game", 1999.00));
		lista.add(new Produto("Microondas", 550.00));
		//Lambda expression com argumentos
		System.out.println("SAIDA...");
		//System.out.println("\n=> Lista Desordenada <=");
		//lista.forEach((p) -> System.out.println(p.getNome() + " - R$ " + p.getPreco()));

		//lista.sort((p1, p2) -> p1.getPreco().compareTo(p2.getPreco()));
		//System.out.println("\n=> Lista Ordenada <=");
		//lista.forEach((p) -> System.out.println(p.getNome() + " - R$ " + p.getPreco()));

		//System.out.println("\n=> Method references <=");
		//Method references
		//lista.forEach(Impressora::imprime);

		//Method references
		lista.forEach(Produto::imprime);

	}
}
interface Figura2D {
	void desenha(Double largura, Double altura);
}

class Retangulo {
	public void desenhaRetangulo(Double largura, Double altura) {
		System.out.println("Desenha retângulo de largura: " + largura + " e altura: " + altura);
	}
}

public class Exemplo01 {
	public static void main(String[] args) {
		//Objeto específico
		Retangulo ret = new Retangulo();
		//Method reference
		Figura2D fig2 = ret::desenhaRetangulo;

		fig2.desenha(10.5, 7.0);

	}
}
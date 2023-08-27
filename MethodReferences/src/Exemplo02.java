interface Figura2D2 {
	Retangulo2 desenha(Double largura, Double altura);
}

class Retangulo2 {
	public Retangulo2(Double largura, Double altura) {
		System.out.println("Desenha retângulo de largura: " + largura + " e altura: " + altura);
	}
}

public class Exemplo02 {
	public static void main(String[] args) {

		Figura2D2 fig1 = Retangulo2::new;
		fig1.desenha(10.0, 2.5);
	}
}
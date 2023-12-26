import java.util.List;

public class VarExemplo {
	public static void main(String[] args) {

//		var a1 = "Programando em ";
//		String a2 = "Java";
//		System.out.println(a1 + a2);

		var listaDeFrutas = List.of("Banana","Maçã","Abacaxi");
		//Enhaced For
		for (var fruta : listaDeFrutas){
			System.out.println(fruta);
		}
		System.out.println("**---**");
		//Índice laço For
		for (var i=0; i<listaDeFrutas.size(); i++){
			System.out.println(listaDeFrutas.get(i));
		}

	}
}
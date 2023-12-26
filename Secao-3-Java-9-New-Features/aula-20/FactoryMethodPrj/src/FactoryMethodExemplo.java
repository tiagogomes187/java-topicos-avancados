import java.util.Set;

public class FactoryMethodExemplo {
	public static void main(String[] args) {
		Set<String> lista = Set.of("Banana", "Maçã", "Pera","Banana", "Maçã", "Pera");

		//Exception in thread "main" java.lang.IllegalArgumentException: duplicate element: Banana
		for (String s : lista){
			System.out.println(s);
		}
	}
}
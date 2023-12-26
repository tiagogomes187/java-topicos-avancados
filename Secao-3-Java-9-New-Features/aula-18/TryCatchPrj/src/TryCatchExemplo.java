	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;

	public class TryCatchExemplo {
		public static void main(String[] args) throws IOException {
			try {
				TryCatchExemplo.lerArquivoBlocoTryComRecurso("/mnt/Conteúdos Estudantil (mnt)/Udemy Courses/Marco Aurélio Regis/java-topicos-avancados/Secao-3-Java-9-New-Features/aula-18/TryCatchPrj/file.txt");
			}
			catch (IOException e){
				e.printStackTrace();
			}
		}

		//Antes do java 7 - "modo tradicional"
		public static void lerArquivoComBlocoTryCatchFinally(String path) throws IOException {

		String linha = "";

			BufferedReader br = new BufferedReader(new FileReader(path));

			try {
				while ((linha = br.readLine()) != null){
					System.out.println(linha);
				}
			}
			catch (IOException e){
				throw e;
			}

			finally {
				if ( br != null){
					br.close();
				}
			}
		}

		//A partir do Java 7
		public static void lerArquivoBlocoTryComRecurso (String path) throws IOException {
			String linha = "";

			BufferedReader br = new BufferedReader(new FileReader(path));

			try (br){
				while ((linha = br.readLine()) != null){
					System.out.println(linha);
				}
			}
		}
	}
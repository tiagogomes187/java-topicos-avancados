public class TesteEventos {
	public static void main(String[] args) {
		LogEventosI log = new LogEventosI() {
		};
		log.logError("Conexão Perdida!");
	}
}

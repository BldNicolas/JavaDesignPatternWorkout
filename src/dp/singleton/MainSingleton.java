package dp.singleton;

public class MainSingleton {

	public static void main(String[] args) {
		Logger log = Logger.getInstance();
		log.log("coucou les defaults");
		log.log("coucou les infos", "info");
		log.log("coucou les warnings", "warning");
		log.log("coucou les errors", "error");
	}

}

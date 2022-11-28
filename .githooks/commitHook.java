import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class hook {
	public static void main(String[] args) throws IOException {
		String data = new String(Files.readAllBytes(Paths.get(args[0])));
	    if(data.length()>=5) {
	    	System.out.println("Le message de commit contient au moins 5 caractères !");
	    	System.exit(0);
	    }else {
	    	System.out.println("Le message de commit comment moins de 5 caractères !");
	    	System.exit(1);
	    }
	}
}

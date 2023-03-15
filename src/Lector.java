import java.io.BufferedReader;
import java.io.FileReader;

public class Lector {
	
	private BufferedReader lector;
	private String linea;
	private String partes[];
	
	
	public void leerArchivo(String nombre) {
		try {
			
			lector = new BufferedReader(new FileReader(nombre));
			while ((linea = lector.readLine()) != null ) {
				partes = linea.split(",");
				imprimir();
				System.out.println();
			}
			lector.close();
			linea = null;
			partes = null;
					
		}catch(Exception e) 
		{
			
		}
	}
	
	public void imprimir() {
		
		for(int i=0; i< partes.length; i++) {
			System.out.print(partes[i]+"-");
		}
		
	}
	
	

}

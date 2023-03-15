import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Lector {
	
	private BufferedReader lector;
	private String linea;
	private String[] partes;
	
	String nroHoja;
	String tipoObjeto;
	String IdentTramo;
	String tipoCamino;
	String longitud;
	
	
	public void leerArchivo(String nombre) {
		
		ArrayList <Vial> listaVial = new ArrayList <Vial>();
		try {
			
			lector = new BufferedReader(new FileReader(nombre));
			while ((linea = lector.readLine()) != null ) {
				partes = linea.split(",");
				
				nroHoja = partes[0];
				tipoObjeto  = partes[1];
				IdentTramo  = partes[2];
				tipoCamino  = partes[3];
				longitud  = partes[4];
				
				listaVial.add(new Vial(nroHoja, tipoObjeto, IdentTramo, tipoCamino , longitud));
					
				
				System.out.println();
			}
			for(Vial s : listaVial) {
				
				System.out.println("Numero de hoja: "+s.getNroHoja());
				System.out.println("Tipo objeto: "+s.getTipoObjeto());
				System.out.println("identificador tramo: "+s.getIdentTramo());
				System.out.println("Tipo camino: "+s.getTipoCamino());
				System.out.println("Longitud: "+s.getLongitud());
				System.out.println("\n");
			}
			lector.close();
			linea = null;
			partes = null;
					
		}catch(Exception e) 
		{
			
		}
	}
	

	
	

}

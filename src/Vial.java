
public class Vial {
	
	String nroHoja;
	String tipoObjeto;
	String IdentTramo;
	String tipoCamino;
	String longitud;
	
	public Vial(String nroHoja, String tipoObjeto, String identTramo, String tipoCamino, String longitud) {
		
		this.nroHoja = nroHoja;
		this.tipoObjeto = tipoObjeto;
		IdentTramo = identTramo;
		this.tipoCamino = tipoCamino;
		this.longitud = longitud;
	}


	public String getNroHoja() {
		return nroHoja;
	}


	public void setNroHoja(String nroHoja) {
		this.nroHoja = nroHoja;
	}


	public String getTipoObjeto() {
		return tipoObjeto;
	}


	public void setTipoObjeto(String tipoObjeto) {
		this.tipoObjeto = tipoObjeto;
	}


	public String getIdentTramo() {
		return IdentTramo;
	}


	public void setIdentTramo(String identTramo) {
		IdentTramo = identTramo;
	}


	public String getTipoCamino() {
		return tipoCamino;
	}


	public void setTipoCamino(String tipoCamino) {
		this.tipoCamino = tipoCamino;
	}


	public String getLongitud() {
		return longitud;
	}


	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}





}

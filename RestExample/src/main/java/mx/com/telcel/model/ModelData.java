package mx.com.telcel.model;

import java.io.Serializable;

public class ModelData  implements Serializable{

	private static final long serialVersionUID = 110196236497703850L;
	
	private int code;
	private String message;
	private boolean estatus;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isEstatus() {
		return estatus;
	}
	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}
	
}

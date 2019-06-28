
public class Productos {
	
	//Atributos
	private String nombre;
	private int cantidad;
	private boolean check;
	
	//Constructor vacío
	public Productos() {
		
	}
	//Constructor
	public Productos(String nombre, int cantidad, boolean check) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.check = check;
	}

	//getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public boolean isCheck() {
		return check;
	}
	public void setCheck(boolean check) {
		this.check = check;
	}
	

}

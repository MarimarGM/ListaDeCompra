import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaCompra {
	//Atributo de tipo lista
	private List<Productos> listaProductos = new ArrayList<>();
	//Método para pintar la lista
	public void pintarLista() {
		//variable para manejar las opciones
		int opt = 0;
		//while para recorrer las opciones (mientras opt sea diferente a 6 hace el switch)
		while (opt != 6) {
			System.out.println("1-Añadir producto");
			System.out.println("2-Editar producto");
			System.out.println("3-Borrar producto");
			System.out.println("4-Listar todos los productos");
			System.out.println("5-Marcar como comprado");
			System.out.println("6-Salir");
			//Introducir por teclado la opción
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduzca una opción: ");
			opt = sc.nextInt();
			//estructura de flujos que segun valga opt muestra un mensaje y realiza una accion que le da un metodo
			switch (opt) {
			case 1:
				System.out.println("Opción 1 seleccionada");
				this.addProduct();
				break;
			case 2:
				System.out.println("Opción 2 seleccionada");
				break;
			case 3:
				System.out.println("Opción 3 seleccionada");
				this.deleteProducts();
				break;
			case 4:
				System.out.println("Opción 4 seleccionada");
				this.listProducts();
				break;
			case 5:
				System.out.println("Opción 5 seleccionada");
				break;
			case 6:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Opción no válida");
				break;

			}
		}
	}
	//Método para rellenar la lista con los productos (de uno en uno)
	public void addProduct () {
		System.out.println("Introduce el nombre");
		Productos p = new Productos();
		Scanner sc = new Scanner (System.in);
		p.setNombre(sc.nextLine());
		System.out.println("Introduce la cantidad");
		p.setCantidad(sc.nextInt());
		p.setCheck(false);
		this.listaProductos.add(p);
	}
	//Método para listar los productos introducidos
	public void listProducts () {
		for (int i=0; i<listaProductos.size();i++) {
			System.out.println("Producto nº:"+ (i+1));
			System.out.println("Nombre: "+this.listaProductos.get(i).getNombre());
			System.out.println("Cantidad: "+this.listaProductos.get(i).getCantidad());
			if (this.listaProductos.get(i).isCheck()) {
				System.out.println("Producto ya comprado");
			}else {
				System.out.println("Producto no comprado");
			}
			
		}
	}
	//Método para borrar productos
	public void deleteProducts () {
		System.out.println("¿Qué producto quiere borrar?");
		int n = 0;
		Scanner sc = new Scanner (System.in);
		n = sc.nextInt();
		
		if (this.listaProductos.size() >= n) {
			this.listaProductos.remove(n);
		}else {
			System.out.println("El producto en la posición "+ n +"no existe");
		}
		
	}
}

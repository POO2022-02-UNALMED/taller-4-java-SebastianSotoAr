package classroom;

public enum Tipo {
	DISCIPLINAR(10, "Disciplinar"), FUNDAMENTACION(20, "Fundamentacion"), ELECTIVA(30, "Electiva");
	
	int codigo;
	String nombre;
	
	Tipo(int codigo,String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
}

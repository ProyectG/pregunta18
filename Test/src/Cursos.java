
public class Cursos {
	
	String nombre = "";
	Alumnos[] alumno = null;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Alumnos[] getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumnos[] alumno) {
		this.alumno = alumno;
	}

	
	
	public Cursos()
	{
		super();
	}
	
	public Cursos(int alum)
	{
		alumno = new Alumnos[alum];
	}
	

}


public class Alumnos {
	
	String nombre;
	Notas[] nota;
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public Notas[] getNota() {
		return nota;
	}

	public void setNota(Notas[] nota) {
		this.nota = nota;
	}

	
	public Alumnos()
	{
		super();
	}
	
	public Alumnos(String nombre, int[] notas)
	{
		this.nombre = nombre;
		
		Notas[] no = new Notas[notas.length]; 
		for(int n=0;n<notas.length;n++)
		{
			
			no[n] = new Notas();
			no[n].setNota(notas[n]);
		}
		
	   this.nota = no;
	}
	
	
	public String aprobado()
	{
		double promedio = promedio();
		if(promedio < 4)
		{
			return "Reprobado";
		}
		else
		{
			return "Aprobado";
		}
		
	}
	
	public double promedio()
	{
		double resultado = 0;
		for(int n=0;n<nota.length;n++)
		{
			resultado = resultado+nota[n].getNota();
		}
		
		return resultado/nota.length;
	}
}

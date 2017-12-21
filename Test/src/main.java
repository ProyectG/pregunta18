

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Variables para llenar las clases.
		 * 
		 */
		String[] materias = {"Matematica","Historia", "Programacion"};
		String[] alumnos = {"Pedro","Juan","Miguel"};
		Alumnos[] alum = new Alumnos[alumnos.length];
		int[][] notas = {{1,5,7},{6,5,7},{1,3,7}};
	
		
		Cursos[] curso = new Cursos[materias.length];
		
		for(int x=0;x<materias.length;x++)
		{
			curso[x] = new Cursos();
			curso[x].setNombre(materias[x]);
			for(int a=0;a<alumnos.length;a++)  
			{
				alum[a] = new Alumnos(alumnos[a], notas[a]);
			}
			curso[x].setAlumno(alum);
		}
	
		/**
		 * Fin de llenado
		 */
		
		
		/**
		 * Revisa la primera materia, sus alumnos y promedios
		 * son las mismas notas para cada uno.
		 */
		
		for(int ramos=0;ramos<curso.length;ramos++)
		{
			System.out.println("Ramo: ".concat(curso[ramos].getNombre()));
			Alumnos[] demo = curso[ramos].getAlumno();
			for(int x=0;x<demo.length;x++)
			{
				System.out.println("Nombre:".concat(demo[x].getNombre()));
				System.out.println("Promedio: "+demo[x].promedio());
				System.out.println("Resultado: ".concat(demo[x].aprobado()));
			}
		}
	}

}

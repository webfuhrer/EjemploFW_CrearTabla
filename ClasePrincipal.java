import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ClasePrincipal {

	public static void main(String[] args) {
		Persona p1=new Persona("Juan", "juan@mail.com", "614132323");
		Persona p2=new Persona("Jose", "joselito@mail.com", "32255623");
		Persona p3=new Persona("Ana", "anita@mail.com", "87872323");
		ArrayList<Persona> lista=new ArrayList();
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		String html_tabla=PintarHTML.crearTabla(lista);
		try {
			FileWriter fw=new FileWriter("T:\\ficheros\\contactos.html");
			fw.write(html_tabla);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

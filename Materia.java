import java.util.ArrayList;
import java.util.List;

public class Materia {
  String nombre;
  List<Materia> materiasCorrelativas;

  public Materia(String nombre) {
    this.nombre = nombre;
    this.materiasCorrelativas = new ArrayList<>();
  }

  public String getNombre(){
    return this.nombre;
  }

  public void setMateriasCorrelativas(List<Materia> materiasCorrelativas) {
    this.materiasCorrelativas = materiasCorrelativas;
  }

  public List<Materia> getMateriasCorrelativas(){
    return this.materiasCorrelativas;
  }

  public boolean aceptarInscripcion(Alumno alumno){
    return materiasCorrelativas
        .stream()
        .allMatch(materia -> materia.aprobada(alumno));
  }
  public boolean aprobada(Alumno alumno){
    boolean checkCorrelativas = true;
    System.out.println("vemos la correlativa: "+ this.getNombre());
    if(!this.getMateriasCorrelativas().isEmpty()){
      checkCorrelativas = this.aceptarInscripcion(alumno);
    }
    System.out.println("el alumno aprobo la materia "+ this.getNombre()+ "? resultado: "+alumno.getMateriasAprobadas().contains(this));
      return checkCorrelativas && alumno.getMateriasAprobadas().contains(this);
  }

}

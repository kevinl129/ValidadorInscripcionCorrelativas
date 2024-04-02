import java.util.List;

public class Alumno {

  private String nombre;

  private List<Materia> materiasAprobadas;

  public Alumno(String nombre) {
    this.nombre = nombre;
  }
  public Alumno(String nombre, List<Materia> materiasAprobadas) {
    this.nombre = nombre;
    this.materiasAprobadas = materiasAprobadas;
  }

  public List<Materia> getMateriasAprobadas(){
    return this.materiasAprobadas;
  }

  public void setMateriasAprobadas(List<Materia> materiasAprobadas) {
    this.materiasAprobadas = materiasAprobadas;
  }
}

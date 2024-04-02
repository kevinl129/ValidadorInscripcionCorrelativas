import java.util.List;

public class Inscripcion {

  Alumno alumno;

  List<Materia> materias;
  public Inscripcion(Alumno alumno) {
    this.alumno = alumno;
  }

  public void setMaterias(List<Materia> materias) {
    this.materias = materias;
  }

  public Inscripcion(Alumno alumno, List<Materia> materias) {
    this.alumno = alumno;
    this.materias = materias;
  }

  public boolean aprobada(){
    return materias.stream()
        .filter(materia -> tieneCorrelatividades(materia))
        .allMatch(materia -> aceptar(materia));

  }
  public boolean aceptar(Materia materia){
    return materia.aceptarInscripcion(alumno);
  }

  public boolean tieneCorrelatividades(Materia materia){
    return materia.getMateriasCorrelativas()!=null || !materia.getMateriasCorrelativas().isEmpty();
  }
}

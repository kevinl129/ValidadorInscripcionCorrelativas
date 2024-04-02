import java.util.*;

public class Main {
  public static void main(String[] args) {
    Materia pdp = new Materia("Paradigmas de Programacion");
    Materia syo = new Materia("Sistemas y Organizaciones");
    Materia ayed = new Materia("Algoritmos y Estructura de Datos");
    List<Materia> materiasCorrelativasPdp = new ArrayList<>();
    materiasCorrelativasPdp.add(syo);
    materiasCorrelativasPdp.add(ayed);
    pdp.setMateriasCorrelativas(materiasCorrelativasPdp);

    List<Materia> listaMateriasAprobadas = new ArrayList<>();
    listaMateriasAprobadas.add(pdp);
    listaMateriasAprobadas.add(syo);
    listaMateriasAprobadas.add(ayed);

    Alumno alumno = new Alumno("Raul", listaMateriasAprobadas);

    Materia dds = new Materia("Diseño de Sistemas");
    List<Materia> materiasCorrelativasDds = new ArrayList<>();
    materiasCorrelativasDds.add(pdp);
    dds.setMateriasCorrelativas(materiasCorrelativasDds);

    List<Materia> materiasInscriptas = new ArrayList<>();
    materiasInscriptas.add(dds);

    Inscripcion inscripcion = new Inscripcion(alumno, materiasInscriptas);
    System.out.println("se aprueba la inscripcion a las materias? " + inscripcion.aprobada());

  }
}

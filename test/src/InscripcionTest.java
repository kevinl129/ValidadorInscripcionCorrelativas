import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.*;

public class InscripcionTest {

  Materia pdp;
  Materia syo;
  Materia ayed;
  Materia dds;
  Alumno alumno;
  Inscripcion inscripcion;
  @BeforeEach
  void init() {
    pdp = new Materia("Paradigmas de Programacion");
    syo = new Materia("Sistemas y Organizaciones");
    ayed = new Materia("Algoritmos y Estructura de Datos");
    dds = new Materia("Diseño de Sistemas");

    alumno = new Alumno("Raul");

    inscripcion = new Inscripcion(alumno);
  }

  @Test
  void inscripcionCorrectaAMaterias() {
    List<Materia> materiasCorrelativasPdp = new ArrayList<>();
    materiasCorrelativasPdp.add(syo);
    materiasCorrelativasPdp.add(ayed);
    pdp.setMateriasCorrelativas(materiasCorrelativasPdp);

    List<Materia> materiasCorrelativasDds = new ArrayList<>();
    materiasCorrelativasDds.add(pdp);
    dds.setMateriasCorrelativas(materiasCorrelativasDds);

    List<Materia> listaMateriasAprobadas = new ArrayList<>();
    listaMateriasAprobadas.add(pdp);
    listaMateriasAprobadas.add(syo);
    listaMateriasAprobadas.add(ayed);
    alumno.setMateriasAprobadas(listaMateriasAprobadas);

    List<Materia> materiasInscriptas = new ArrayList<>();
    materiasInscriptas.add(dds);

    inscripcion.setMaterias(materiasInscriptas);

    Assertions.assertTrue(inscripcion.aprobada());
  }
@Test
  void inscripcionAMateriasFallaCorrelatividades() {
    List<Materia> materiasCorrelativasPdp = new ArrayList<>();
    materiasCorrelativasPdp.add(syo);
    materiasCorrelativasPdp.add(ayed);
    pdp.setMateriasCorrelativas(materiasCorrelativasPdp);

    List<Materia> materiasCorrelativasDds = new ArrayList<>();
    materiasCorrelativasDds.add(pdp);
    dds.setMateriasCorrelativas(materiasCorrelativasDds);

    List<Materia> listaMateriasAprobadas = new ArrayList<>();
    listaMateriasAprobadas.add(syo);
    listaMateriasAprobadas.add(ayed);
    alumno.setMateriasAprobadas(listaMateriasAprobadas);

    List<Materia> materiasInscriptas = new ArrayList<>();
    materiasInscriptas.add(dds);

    inscripcion.setMaterias(materiasInscriptas);

    Assertions.assertFalse(inscripcion.aprobada());
  }
}

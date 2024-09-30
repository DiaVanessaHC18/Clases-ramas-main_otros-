package pe.edu.upeu.Tres_raya.service.servicio;

import pe.edu.upeu.Tres_raya.modelo.TERmodelo;
import java.util.List;

public interface Interface_juego {
    void guardarResultados(TERmodelo to); // C
    List<TERmodelo> obtenerResultados(); // R
    void actualizarResultados(TERmodelo to, Long index); // U
    void eliminarResultados(Long index); // D
}


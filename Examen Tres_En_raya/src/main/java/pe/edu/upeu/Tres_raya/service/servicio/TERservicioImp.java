package pe.edu.upeu.Tres_raya.service.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.Tres_raya.modelo.TERmodelo;
import pe.edu.upeu.Tres_raya.repositorio.Tres_en_rayaRepository;

import java.util.List;

@Service
public class TERservicioImp implements Interface_juego {
    @Autowired
    private Tres_en_rayaRepository repository;
    @Override
    public void guardarResultados(TERmodelo to) {
        try {
            repository.save(to);
        } catch (DataIntegrityViolationException e) {
            throw new RuntimeException("Error al guardar los resultados: " + e.getMessage());
        }
    }
    @Override
    public List<TERmodelo> obtenerResultados() {
        return repository.findAll();
    }

    @Override
    public void actualizarResultados(TERmodelo to, Long index) {
        to.setId(index);
        repository.save(to);
    }

    @Override
    public void eliminarResultados(Long index) {
        repository.deleteById(index);
    }
}

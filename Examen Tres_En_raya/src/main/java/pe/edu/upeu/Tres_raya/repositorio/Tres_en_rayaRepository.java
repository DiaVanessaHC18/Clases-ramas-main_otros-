package pe.edu.upeu.Tres_raya.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.Tres_raya.modelo.TERmodelo;

@Repository
public interface Tres_en_rayaRepository extends JpaRepository<TERmodelo, Long> {
}


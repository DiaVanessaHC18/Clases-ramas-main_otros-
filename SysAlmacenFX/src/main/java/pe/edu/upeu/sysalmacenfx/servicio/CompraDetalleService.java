package pe.edu.upeu.sysalmacenfx.servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sysalmacenfx.modelo.Cliente;
import pe.edu.upeu.sysalmacenfx.modelo.CompraDetalle;
import pe.edu.upeu.sysalmacenfx.repositorio.CompraDetalleRepository;

import java.util.List;

@Service
public class CompraDetalleService {
    @Autowired
    CompraDetalleRepository repo;

    //C
    public CompraDetalle save(CompraDetalle to) {
        return repo.save(to);
    }

    //R
    public List<CompraDetalle> list() {
        return repo.findAll();
    }

    //U
    public CompraDetalle update(Cliente to, Long id) {
        try {
            CompraDetalle toe=repo.findById(id).get();
            if(toe!=null) {
                toe.setCantidad(Double.valueOf(to.getNombres()));
            }
            return repo.save(toe);
        }catch (Exception e){
            System.out.println("ERROR:"+e.getMessage());
        }return null;
    }

    public CompraDetalle update(CompraDetalle to){
        return repo.save(to);
    }

    //D
    public void delete(Long id){
        repo.deleteById(id);
    }

    public CompraDetalle searchById(Long id){
        return repo.findById(id).get();
    }

}

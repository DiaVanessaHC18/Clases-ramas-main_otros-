package pe.edu.upeu.sysalmacenfx.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sysalmacenfx.modelo.Compra;
import pe.edu.upeu.sysalmacenfx.repositorio.CompraRepository;

import java.util.List;

@Service
public class CompraService {
    @Autowired
    CompraRepository repo;

    //C
    public Compra save(Compra to) {
        return repo.save(to);
    }

    //R
    public List<Compra> list() {
        return repo.findAll();
    }

    //U
    public Compra update(Compra to, Long id) {
        try {
            Compra toe=repo.findById(id).get();
            if(toe!=null) {
                toe.setCompraDetalles(to.getCompraDetalles());
            }
            return repo.save(toe);
        }catch (Exception e){
            System.out.println("ERROR:"+e.getMessage());
        }return null;
    }

    public Compra update(Compra to){
        return repo.save(to);
    }

    //D
    public void delete(Long id){
        repo.deleteById(id);
    }

    public Compra searchById(Long id){
        return repo.findById(id).get();
    }


}

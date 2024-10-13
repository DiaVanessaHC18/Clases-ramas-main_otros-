package pe.edu.upeu.sysalmacenfx.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sysalmacenfx.modelo.Venta;
import pe.edu.upeu.sysalmacenfx.repositorio.VentaRepository;

import java.util.List;

@Service
public class VentaService {
    @Autowired
    VentaRepository repo;

    //C
    public Venta save(Venta to) {
        return repo.save(to);
    }

    //R
    public List<Venta> list() {
        return repo.findAll();
    }

    //U
    public Venta update(Venta to, Long id) {
        try {
            Venta toe=repo.findById(id).get();
            if(toe!=null) {
                toe.setCliente(to.getCliente());
            }
            return repo.save(toe);
        }catch (Exception e){
            System.out.println("ERROR:"+e.getMessage());
        }return null;
    }

    public Venta update(Venta to){
        return repo.save(to);
    }

    //D
    public void delete(Long id){
        repo.deleteById(id);
    }

    public Venta searchById(Long id){
        return repo.findById(id).get();
    }


}

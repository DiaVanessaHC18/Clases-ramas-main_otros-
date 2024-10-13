package pe.edu.upeu.sysalmacenfx.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sysalmacenfx.modelo.VentaDetalle;
import pe.edu.upeu.sysalmacenfx.repositorio.VentaDetalleRepository;

import java.util.List;

@Service
public class VentaDetalleService {
    @Autowired
    VentaDetalleRepository repo;

    //C
    public VentaDetalle save(VentaDetalle to) {
        return repo.save(to);
    }

    //R
    public List<VentaDetalle> list() {
        return repo.findAll();
    }

    //U
    public VentaDetalle update(VentaDetalle to, Long id) {
        try {
            VentaDetalle toe=repo.findById(id).get();
            if(toe!=null) {
                toe.setProducto(to.getProducto());
            }
            return repo.save(toe);
        }catch (Exception e){
            System.out.println("ERROR:"+e.getMessage());
        }return null;
    }

    public VentaDetalle update(VentaDetalle to){
        return repo.save(to);
    }

    //D
    public void delete(Long id){
        repo.deleteById(id);
    }

    public VentaDetalle searchById(Long id){
        return repo.findById(id).get();
    }



}

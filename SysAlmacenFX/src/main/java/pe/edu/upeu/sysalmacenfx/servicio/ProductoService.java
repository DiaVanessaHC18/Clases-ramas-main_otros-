package pe.edu.upeu.sysalmacenfx.servicio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sysalmacenfx.dto.ModeloDataAutocomplet;
import pe.edu.upeu.sysalmacenfx.modelo.Cliente;
import pe.edu.upeu.sysalmacenfx.modelo.Producto;
import pe.edu.upeu.sysalmacenfx.repositorio.ProductoRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoService {
    private static final Logger logger = LoggerFactory.getLogger(ProductoService.class);
    @Autowired
    ProductoRepository repo;

    //C
    public Producto save(Producto to) {
        return repo.save(to);
    }

    //R
    public List<Producto> list() {
        return repo.findAll();
    }

    //U
    public Producto update(Cliente to, Long id) {
        try {
            Producto toe = repo.findById(id).get();
            if (toe != null) {
                toe.setNombre(to.getNombres());
            }
            return repo.save(toe);
        } catch (Exception e) {
            System.out.println("ERROR:" + e.getMessage());
        }
        return null;
    }

    public Producto update(Producto to) {
        return repo.save(to);
    }

    //D
    public void delete(Long id) {
        repo.deleteById(id);
    }

    public Producto searchById(Long id) {
        return repo.findById(id).get();
    }

    public List<ModeloDataAutocomplet> listAutoCompletProducto (String nombre) {
        List<ModeloDataAutocomplet> listarProducto = new ArrayList<>();
        try {
            for (Producto producto : repo.listAutoCompletProducto
                    (nombre + "%")) {
                ModeloDataAutocomplet data = new ModeloDataAutocomplet();
                data.setIdx
                        (producto.getNombre());
                data.setNameDysplay
                        (String.valueOf(producto.getIdProducto()));
                data.setOtherData
                        (producto.getPu() + ":" + producto.getStock());
                listarProducto.add(data);

            }
        } catch
        (Exception e) {
            logger.error("Error al realizar la busqueda", e);

        }
        return listarProducto;

    }

    public List<ModeloDataAutocomplet> listAutoCompletProducto() {
        List<ModeloDataAutocomplet> listarProducto = new ArrayList<>();
        try {
            for (Producto producto : repo.findAll()) {
                ModeloDataAutocomplet data = new ModeloDataAutocomplet();
                data.setIdx(String.valueOf(producto.getIdProducto()));
                data.setNameDysplay(producto.getNombre());
                data.setOtherData(producto.getPu() + ":" + producto.getStock());
                listarProducto.add(data);

            }
        } catch
        (Exception e) {
            logger.error("Error al realizar la busqueda", e);

        }
        return listarProducto;

    }
}


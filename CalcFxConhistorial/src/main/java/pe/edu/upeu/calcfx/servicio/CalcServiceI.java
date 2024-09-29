package pe.edu.upeu.calcfx.servicio;

import pe.edu.upeu.calcfx.modelo.CalcTO;
import java.util.List;

public interface CalcServiceI {

    public void guardarResultados (CalcTO to);//C
    public List <CalcTO> obtenerResultados();//R
    public void eliminarResultados (Long index);//U
    public void actualizarResultados (CalcTO to,Long index);//D
}

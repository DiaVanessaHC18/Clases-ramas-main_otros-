package pe.edu.upeu.Tres_raya.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tres_en_raya")
public class TERmodelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombrePartida;
    private String nombreJugador1;
    private String nombreJugador2;
    private String ganador;
    private int puntuacion;
    private String estado;

    public TERmodelo(String nombrePartida, String nombreJugador1, String nombreJugador2, String ganador, int puntuacion, String estado) {
        this.nombrePartida = nombrePartida;
        this.nombreJugador1 = nombreJugador1;
        this.nombreJugador2 = nombreJugador2;
        this.ganador = ganador;
        this.puntuacion = puntuacion;
        this.estado = estado;
    }
}

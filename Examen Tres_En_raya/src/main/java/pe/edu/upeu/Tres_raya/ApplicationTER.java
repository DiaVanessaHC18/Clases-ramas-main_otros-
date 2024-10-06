package pe.edu.upeu.Tres_raya;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import pe.edu.upeu.Tres_raya.TERcontroller.juego_Controller;

public class ApplicationTER {
    public static void main(String[] args) {
        SpringApplication.run(TresRayaApplication.class, args);
        TresRayaApplication.main(args);
    }

    @Bean
    public CommandLineRunner run(ApplicationContext context) { return args -> {
        juego_Controller mx = context.getBean(juego_Controller.class);
        mx.initialize();
    };
    }
}

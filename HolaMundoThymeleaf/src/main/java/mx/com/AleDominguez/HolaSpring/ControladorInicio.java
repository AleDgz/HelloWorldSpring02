package mx.com.AleDominguez.HolaSpring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller //controlador tipo spring MVC
@Slf4j 

public class ControladorInicio {

    @GetMapping("/")
    public String inicio() {
        log.info("Ejecutando el controlador de tipo Spring MVC");
        return "index";
    }
}

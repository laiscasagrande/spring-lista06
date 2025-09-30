package exercicio01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecomendadorController {
    @GetMapping("/recomendar")
    public String recomendar(@RequestParam String clima, @RequestParam String estilo) {
        if (clima.equalsIgnoreCase("calor") && estilo.equalsIgnoreCase("natureza")) {
            return "Rio de Janeiro";
        } else if (clima.equalsIgnoreCase("frio") && estilo.equalsIgnoreCase("praia")) {
            return "Santa Catarina";
        } else if (clima.equalsIgnoreCase("calor") && estilo.equalsIgnoreCase("aventura")) {
            return "Chapada Diamantina";
        } else if (clima.equalsIgnoreCase("frio") && estilo.equalsIgnoreCase("cultura")) {
            return "São Paulo";
        } else {
            return "Destinação não encontrada. Tente outro clima ou estilo.";
        }
    }
}

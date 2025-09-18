@RestController
public class ViagemController {

    @GetMapping("/recomendar")
    public String recomendar(@RequestParam String clima, @RequestParam String estilo) {
        if (clima.equals("calor") && estilo.equals("natureza")) return "Rio de Janeiro";
        if (clima.equals("frio") && estilo.equals("aventura")) return "Bariloche";
        if (clima.equals("calor") && estilo.equals("cultura")) return "Salvador";
        if (clima.equals("frio") && estilo.equals("historia")) return "Praga";
        return "Destino não encontrado";
    }
}

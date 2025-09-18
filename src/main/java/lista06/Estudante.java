@RestController
@RequestMapping("/estudantes")
public class EstudanteController {

    private List<Map<String,Object>> lista = new ArrayList<>();

    @PostMapping
    public Map<String,Object> add(@RequestBody Map<String,Object> est) {
        lista.add(est);
        return est;
    }

    @GetMapping
    public List<Map<String,Object>> listar() {
        return lista;
    }

    @GetMapping("/{codigo}")
    public Map<String,Object> obter(@PathVariable int codigo) {
        return lista.stream().filter(e -> ((Integer)e.get("codigo"))==codigo).findFirst().orElse(null);
    }
}

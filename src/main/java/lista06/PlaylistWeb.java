@RestController
@RequestMapping("/playlists")
public class PlaylistController {

    private List<Map<String,Object>> playlists = new ArrayList<>();
    private int idCounter = 1;

    @PostMapping
    public int criar(@RequestBody Map<String,Object> p) {
        p.put("id", idCounter++);
        p.put("musicas", new ArrayList<>());
        playlists.add(p);
        return (int)p.get("id");
    }

    @PostMapping("/{id}/musicas")
    public String addMusica(@PathVariable int id, @RequestBody Map<String,Object> musica) {
        for (Map<String,Object> p : playlists) {
            if ((int)p.get("id") == id) {
                ((List)p.get("musicas")).add(musica);
                return "Música adicionada";
            }
        }
        return "Playlist não encontrada";
    }

    @GetMapping
    public List<Map<String,Object>> listarPlaylists() {
        return playlists;
    }

    @GetMapping("/{id}/musicas")
    public List<Map<String,Object>> listarMusicas(@PathVariable int id) {
        for (Map<String,Object> p : playlists) {
            if ((int)p.get("id") == id) return (List)p.get("musicas");
        }
        return new ArrayList<>();
    }
}

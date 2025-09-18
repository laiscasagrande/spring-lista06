@RestController
public class JogadorController {

    @GetMapping("/jogador/{time}/{posicao}")
    public Map<String, Object> gerarJogador(@PathVariable String time, @PathVariable String posicao) {
        Map<String, Object> jogador = new HashMap<>();
        String[] nomes = {"Ronaldo","Pelé","Neymar"};
        String[] sobrenomes = {"Fenômeno","da Silva","Júnior"};
        Random r = new Random();

        jogador.put("nome", nomes[r.nextInt(nomes.length)]);
        jogador.put("sobrenome", sobrenomes[r.nextInt(sobrenomes.length)]);
        jogador.put("idade", 18 + r.nextInt(20));
        jogador.put("posicao", posicao);
        jogador.put("time", time);

        return jogador;
    }
}

package exercicio02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeradorController {
    private JogadorService jogadorService;

    public GeradorController(JogadorService jogadorService){
        this.jogadorService = jogadorService;
    }

    @GetMapping("/jogador/{time}/{posicao}")
    public Jogador jogadorAleatorio(@PathVariable String time, @PathVariable String posicao){
       return jogadorService.gerarJogador(time, posicao);
    }

}

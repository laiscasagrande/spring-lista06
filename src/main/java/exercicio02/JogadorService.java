package exercicio02;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class JogadorService {
   Random geradorJogadorAleatoria = new Random();

   String[] nomes = {"JoagadorA", "JoagadorB", "JoagadorC"};
   String[] sobrenomes = {"SobrenomeA", "SobrenomeB", "SobrenomeC"};
   String[] sexos = {"Masculino", "Femenino"};

   public JogadorService() {

   }

    public Jogador gerarJogador(String time, String posicao){
        int indiceNomeAleatorio = geradorJogadorAleatoria.nextInt(nomes.length);
        int indiceSobrenomeAleatorio = geradorJogadorAleatoria.nextInt(sobrenomes.length);
        int idadeAleatoria = 18 + geradorJogadorAleatoria.nextInt(22);
        int indiceSexoAleatorio = geradorJogadorAleatoria.nextInt(sexos.length);

        String nome = nomes[indiceNomeAleatorio];
        String sobrenome = sobrenomes[indiceSobrenomeAleatorio];
        String sexo = sexos[indiceSexoAleatorio];

        Jogador jogador = new Jogador(nome, sobrenome, idadeAleatoria, sexo, posicao, time);
        return jogador;
    }

}

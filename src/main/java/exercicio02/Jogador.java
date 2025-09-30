package exercicio02;

public class Jogador {
    private String nome;
    private String sobrenome;
    private int idade;
    private String posicao;
    private String sexo;
    private String time;

    public Jogador(String nome, String sobrenome, int idade, String posicao, String sexo, String time) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.posicao = posicao;
        this.sexo = sexo;
        this.time = time;
    }

    public String getNome() { return nome; } //mesmo não usando as funções get no código, o Spring precisa deles para conseguir transformar o objeto em JSON na resposta da API
    public String getSobrenome() { return sobrenome; }
    public int getIdade() { return idade; }
    public String getPosicao() { return posicao; }
    public String getSexo() { return sexo; }
    public String getTime() { return time; }
}

//package modulo2.criadordepessoasaleatorias;

class Pessoa {
    String nome;
    int idade;
    String cidade;

    public Pessoa(RandomUser randomUser) {
        this.nome = randomUser.name.first;
        this.idade = randomUser.age;
        this.cidade = randomUser.location.city;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}

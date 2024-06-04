package br.com.app.garagem.domain.produto;

public enum Marca {

    CHEVROLET("Chevrolet"),
    HYUNDAI("Hyundai"),
    VOLKSWAGEN("Volkswagen"),
    FIAT("Fiat"),
    FORD("Ford"),
    PEUGEOT("Peugeot"),
    RENAULT("Renault"),
    JEEP("Jeep"),
    HONDA("Honda");

    private String nome;

    Marca(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

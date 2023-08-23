package org.Utils.Enums;

public enum Contato {
    NOME("Pedro"),
    SOBRENOME("Alves"),
    TELEFONE("5551999999999"),
    TIPO_TELEFONE("Home"),
    EMAIL("gabrie.pereira@dbserver.com.br");

    private final String dado;

    Contato(String dado) {
        this.dado = dado;
    }

    public String toString() {
        return dado;
    }
}

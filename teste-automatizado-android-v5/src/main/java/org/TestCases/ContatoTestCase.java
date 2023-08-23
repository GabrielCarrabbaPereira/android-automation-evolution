package org.TestCases;

import org.Tasks.ContatosTask;
import org.Tasks.CriarContatoTask;
import org.Utils.Enums.Contato;
import org.VerificationPoints.ContatosVerificationPoint;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class ContatoTestCase extends TestCaseBase{

    private ContatosTask contatosTask;
    private CriarContatoTask criarContatoTask;
    private ContatosVerificationPoint contatosVerificationPoint;


    @BeforeEach
    void inicializarTasks() {
        contatosTask = new ContatosTask();
        criarContatoTask = new CriarContatoTask();
        contatosVerificationPoint = new ContatosVerificationPoint();
    }

    @Test
    @DisplayName("Validar criação de novo contato")
    void validarCriacaoNovoContato() {
        contatosTask.clicarBotaoContatos();
        contatosTask.clicarBotaoCriarNovoContato();
        criarContatoTask.preencherCampoNome(Contato.NOME);
        criarContatoTask.preencherCampoSobrenome(Contato.SOBRENOME);
        criarContatoTask.preencherCampoTelefone(Contato.TELEFONE);
        criarContatoTask.abrirListaTipoTelefone();
        criarContatoTask.selecionarTipoTelefone(Contato.TIPO_TELEFONE);
        criarContatoTask.descerTela();
        criarContatoTask.preencherCampoEmail(Contato.EMAIL);
        criarContatoTask.clicarBotaoSalvar();
        contatosVerificationPoint.validarContatoFoiSalvo(Contato.NOME, Contato.SOBRENOME);
    }

    @Test
    @DisplayName("Validar exclusão de contato")
    void validarExclusaoContato() {
        //Steps do teste...
    }

    @Test
    @DisplayName("Validar edição de contato")
    void validarEdicaoContato() {
        //Steps do teste...
    }
}
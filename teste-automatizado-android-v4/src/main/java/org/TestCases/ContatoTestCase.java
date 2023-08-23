package org.TestCases;

import org.Tasks.ContatosTask;
import org.Tasks.CriarContatoTask;
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
        criarContatoTask.preencherCampoNome("Gabriel");
        criarContatoTask.preencherCampoSobrenome("Pereira");
        criarContatoTask.preencherCampoTelefone("5551999999999");
        criarContatoTask.abrirListaTipoTelefone();
        criarContatoTask.selecionarTipoTelefone("Home");
        criarContatoTask.descerTela();
        criarContatoTask.preencherCampoEmail("gabrie.pereira@dbserver.com.br");
        criarContatoTask.clicarBotaoSalvar();
        contatosVerificationPoint.validarContatoFoiSalvo("Gabriel Pereira");
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
package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.AppiumDriver;
import pages.Action;

import static support.DriverQA.driver;

public class Steps {


    Action action = new Action((AppiumDriver) driver);


    @Dado("^que o usuario acesse app contato$")
    public void queOUsuarioAcesseAppContato() throws Throwable {
        this.action.adicionarContato();
    }

    @Dado("^digitar dados do contato$")
    public void digitarDadosDoContato() throws Throwable {
    this.action.digitarDadosContato();
    }

    @Quando("^clicar em salvar$")
    public void clicarEmSalvar() throws Throwable {
        this.action.salvarContato();
    }

    @Entao("^contato salvo com sucesso$")
    public void contatoSalvoComSucesso() throws Throwable {
      this.action.validarNovoContatoCriado();
    }


}


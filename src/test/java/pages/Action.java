package pages;

import io.appium.java_client.AppiumDriver;

import screen.Screen;
import support.DriverQA;
import support.GeradorCelular;
import support.GeradorNome;

public class Action extends Screen {

    String nome = GeradorNome.gerarNomeCompleto();
    String celular = GeradorCelular.gerarNumeroCelular();

    public Action(AppiumDriver driver) {
        super();
    }

    public void adicionarContato() throws Exception {
        Thread.sleep(5000);
        cmpAddContato.click();
        cmpCancelar.click();
    }

    public void digitarDadosContato() throws Exception {

        Thread.sleep(1000);
        cmpFirstName.sendKeys(nome);
        cmpLastName.sendKeys("Teste" );
        cmpPhone.sendKeys(celular);
    }

    public void salvarContato() throws Exception {
        Thread.sleep(1000);
         cmpSalvarContato.click();

    }

    public void validarNovoContatoCriado() {
        System.out.println(nome);
        DriverQA.getInstance().validarTextoParcialmente(cmpNovoContato,nome);

    }
}
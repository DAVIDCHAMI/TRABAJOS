package practica.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature/realizar_compra_de_un_producto.feature",
glue="practica.stepdefinitions", tags = {"@PRUEBA"},
snippets =SnippetType.CAMELCASE)
public class PracticaRunner{

}

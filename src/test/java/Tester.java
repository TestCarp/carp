import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:addProduct.feature","classpath:feature.feature","classpath:deleteFeature.feature","classpath:generateStatistics.feature","classpath:distributeWorkerOnProduct.feature","classpath:TracKOrder.feature","classpath:discount.feature"},

                plugin = "html:target/cucumber/wikipedia.html"
)
public class Tester {

}

package modulos.produtos;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import paginas.AdicionarProduto;

import java.time.Duration;

@DisplayName("Teste questão")
public class ProdutosTest {

    private WebDriver navegador;

    @BeforeEach
    public void beforeEach() {
        //Abrir navegador
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        this.navegador = new ChromeDriver();

        //Maximizar a tela
        navegador.manage().window().maximize();

        //Ir para a pagina da loja
        this.navegador.get("http://lojaebac.ebaconline.art.br/");

    }

    @Test
    @DisplayName("Adicionar dois produtos no carrinho")
    public void testAdicionarDoisProdutosNoCarrinho() {

        //Adicionar dois Produto no carrinho
        final AdicionarProduto adicionarProduto = new AdicionarProduto(navegador)
                .telaComprar()
                .incluirItem1()
                .incluirTamanhoItem1()
                .incluirCoritem1()
                .registrarProdutoItem1()
                .incluirItem2()
                .incluirTamanhoItem2()
                .incluirCorItem2()
                .registrarProdutoItem2();





        //Validar se os dois registros foram adicionados ao carrinho

        //String test = navegador.findElement(By.cssSelector("span[class=\"mini-cart-items\"]").getClass();
        //int qtdProdutoCarrinho = Integer.parseInt(test);
       // System.out.println(test);
    }

    @AfterEach
    public void afterEach(){
        navegador.quit();
    }
    }




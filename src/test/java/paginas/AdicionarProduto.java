package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdicionarProduto {
    private WebDriver navegador;


    public AdicionarProduto(WebDriver navegador) {
        this.navegador = navegador;
    }



        // Vou para tela Comprar
        public AdicionarProduto telaComprar() {
        navegador.get("http://lojaebac.ebaconline.art.br/produtos/");
        return this;
    }
        /// Incluir Item 1
        public AdicionarProduto incluirItem1 (){
        navegador.get("http://lojaebac.ebaconline.art.br/product/ajax-full-zip-sweatshirt/");
        return this;
    }
        //Adicionar Tamanho item 1
        public AdicionarProduto incluirTamanhoItem1 () {
        navegador.findElement(By.cssSelector("li[title=\"XS\"]")).click();
        return this;
    }
        //Adicionar Cor item 1
        public AdicionarProduto incluirCoritem1() {
        navegador.findElement(By.cssSelector("li[title=\"Blue\"]")).click();
        return this;
    }

        //Registrar Produto item 1
        public AdicionarProduto registrarProdutoItem1() {
        navegador.findElement(By.cssSelector("button[class=\"single_add_to_cart_button button alt\"]")).click();
        return this;
    }
        // Incluir item 2
        public AdicionarProduto incluirItem2 (){
        navegador.get("http://lojaebac.ebaconline.art.br/product/grayson-crewneck-sweatshirt/");
        return this;
    }
        // Adicionar Tamanho item 2
        public AdicionarProduto incluirTamanhoItem2() {
        navegador.findElement(By.cssSelector("li[title=\"XL\"]")).click();
        return this;
    }
        //Adicionar Cor item 2
        public AdicionarProduto incluirCorItem2(){
        navegador.findElement(By.cssSelector("li[title=\"Red\"]")).click();
        return this;

    }
        //Registrar Produto item 1
        public AdicionarProduto registrarProdutoItem2(){
        navegador.findElement(By.cssSelector("button[class=\"single_add_to_cart_button button alt\"]")).click();
        return this;

    }




}

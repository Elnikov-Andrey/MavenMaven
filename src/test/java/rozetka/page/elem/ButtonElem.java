package rozetka.page.elem;

import org.openqa.selenium.WebElement;

public class ButtonElem {

    private String imageReference;
    private String title;

    private WebElement webElement;

    public ButtonElem(WebElement webElement){
        this.webElement = webElement;
    }
    public  void click(){
        webElement.click();
    }

}

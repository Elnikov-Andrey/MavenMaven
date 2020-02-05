package rozetka.page.elem;

import org.openqa.selenium.WebElement;
import rozetka.page.SearchPage;

public class SearchFieldElem {

    private TextFieldElem input;
    private ButtonElem confirm;

    public SearchFieldElem(WebElement textField, WebElement btn){
        input = new TextFieldElem();

    }

    public SearchPage search(String text){
        input.setText(text);
        confirm.click();

        return new SearchPage();
    }

}

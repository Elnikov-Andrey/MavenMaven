package rozetka.page;

import rozetka.page.elem.ButtonElem;
import rozetka.page.elem.SearchFieldElem;

public class MainPage {

    private SearchFieldElem searchField = new SearchFieldElem(W);
    private ButtonElem bucket = new ButtonElem();
    private ButtonElem wish = new ButtonElem();

    public SearchPage search(String text){
        return searchField.search(text);
    }
    public void clickBucketBtn(){
        bucket.click();
    }

    public void clickWishBtn(){
        wish.click();
    }
//PAGE OBJECT
}

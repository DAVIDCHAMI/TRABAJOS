package practicaCompra.userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaPrincipalPage extends PageObject {
    ////a[@title='T-shirts'][@xpath='1']"

    public static final Target BTN_WOMEN = Target.the("shirt botton").locatedBy("//a[@class='sf-with-ul'][contains(text(),'Women')]");
    public static final Target IMG_SHIRTS = Target.the("Img botton").locatedBy("//div[@class='product-image-container']");
    public static final Target ADD_SHIRTS_CART = Target.the("Img botton").locatedBy("//a[@class='button ajax_add_to_cart_button btn btn-default']");

    //public static final Target ADD_SHIRTS_CART_WEB_ELEMENT= Target.the("Add producto of car").locatedBy("//a[@class='button ajax_add_to_cart_button btn btn-default']");

    public static final String ADD_SHIRTS_CART_WEB_ELEMENT = "//a[@class='button ajax_add_to_cart_button btn btn-default']";
    public static final String ADD_ADD_SHIRTS_CART_WEB_ELEMENT_BLUSA = "//a[@class='button ajax_add_to_cart_button btn btn-default'][@data-id-product='2']";
    public static final Target CONTINUE_SHOPPING = Target.the("continue shopping").locatedBy("//a[@class='button-exclusive btn btn-default']");
    public static final Target BTN_PROCCED_TO_CHECKOUT = Target.the("checkout botton").locatedBy("//span[contains(text(),'Proceed to checkout')]");


    public static final String ADD_SHIRTS_CART_WEB_ELEMENT_DRESS = "//a[@class='button ajax_add_to_cart_button btn btn-default'][@data-id-product='7']";
    public static final Target IMG_DRESS = Target.the("Img botton").locatedBy("//div[@class='product-image-container']//a[@title='Printed Chiffon Dress']");
}

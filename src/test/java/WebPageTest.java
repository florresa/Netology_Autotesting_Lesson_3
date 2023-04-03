import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;


public class WebPageTest {

    @Test
    public void shouldGetMessage() {
        open("http://localhost:9999");
        $x("//span[@data-test-id='name']//input[@class='input__control']").setValue("Андрей Николаев");
        $x("//span[@data-test-id='phone']//input[@class='input__control']").setValue("+78008888888");
        $x("//label[@data-test-id='agreement']").click();
        $x("//button[@type='button']").click();
        $x("//p[@data-test-id='order-success']").shouldBe(visible);
    }
}

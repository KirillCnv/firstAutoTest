import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTests {
    @Test
    void successfulSearchTest() {
        // Открыть google
        open("https://www.google.com/");

        // Ввести "selenide" в поле поиска
        $("[name=q]").setValue("selenide").pressEnter();

        // Проверить, что "selenide" появился в результатах поиска
        $("[id=search]").shouldHave(text("https://ru.selenide.org"));
    }
}

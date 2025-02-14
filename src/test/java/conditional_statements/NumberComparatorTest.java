package conditional_statements;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static conditional_statements.NumberComparator.compareNumbers;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Feature("Тесты на проверку значений на равенство чисел")
public class NumberComparatorTest {

    @Test
    @DisplayName("Тест на то что первое число больше второго")
    public void testFirstNumberGreater() {
        String result = compareNumbers(20, -10);
        assertThat(result).isEqualTo("Первое число больше, чем второе");
    }

    @Test
    @DisplayName("Тест на то что первое число меньше второго")
    public void testFirstNumberLess() {
        String result = compareNumbers(-50, 60);
        assertThat(result).isEqualTo("Первое число меньше, чем второе");
    }

    @Test
    @DisplayName("Тест на то что первое число равно второму")
    public void testFirstNumberEqual() {
        String result = compareNumbers(20, 20);
        assertThat(result).isEqualTo("Первое число равно второму");
    }
}
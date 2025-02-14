package conditional_statements;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static conditional_statements.NumberChecker.checkNumber;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Feature("Тесты на проверку значений на границе промежутка")
public class NumberCheckerTest {

    @ParameterizedTest
    @ValueSource(ints = {11, 20, 100})
    @DisplayName("Проверка чисел на промежутке больше 10")
    public void testNumberGreaterThanTen(int number) {
        assertThat(checkNumber(number)).isEqualTo("Число больше десяти");
    }

    @ParameterizedTest
    @ValueSource(ints = {10, 9, 0})
    @DisplayName("Проверка чисел на промежутке меньше 10")
    public void testNumberLessThanTen(int number) {
        assertThat(checkNumber(number)).isEqualTo("Число меньше десяти");
    }
}
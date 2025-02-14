package conditional_statements;

import io.qameta.allure.Feature;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static conditional_statements.TriangleClassifier.classifyTriangle;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Feature("Тесты на проверку значений длин сторон треугольника")
public class TriangleClassifierTest {

    @ParameterizedTest
    @CsvSource(value = {
            "7, 7, 7, Треугольник равносторонний",
            "3, 4, 3, Треугольник равнобедренный",
            "3, 4, 5, Треугольник разносторонний"
    })
    void testPositiveClassifyTriangle(double a, double b, double c, String expected) {
        String result = classifyTriangle(a, b, c);
        assertThat(result).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "1, 2, 4, Данная фигура не является треугольником",
            "0, 1, 1, Данная фигура не является треугольником",
            "-1, 2, 3, Данная фигура не является треугольником",
            "0, 0, 0, Данная фигура не является треугольником"
    })
    void testNegativeClassifyTriangle(double a, double b, double c, String expected) {
        String result = classifyTriangle(a, b, c);
        assertThat(result).isEqualTo(expected);
    }
}
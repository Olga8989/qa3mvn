import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ServiseTest {

    @Test

    public void speedMax() {
        int [] speedOfPlayer = {0, 2 , 5};



        int expected = 5;
        int actual = Salaries.speedMax(speedOfPlayer);

        Assertions.assertEquals(expected, actual);


    }
}

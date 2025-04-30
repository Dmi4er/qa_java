import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline = new Feline();

    Cat cat = new Cat(feline);

    @Test
    public void soundOfPetIsMeow() throws Exception {
        String sound = cat.getSound();
        Assert.assertEquals("Мяу", sound);
    }

    @Test
    public void foodRetrievalCallsFeline() throws Exception {
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }
}

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    Feline feline = new Feline();

    @Test
    public void eatMeatSuccess() throws Exception {
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void familyTypeReturnsFeline() throws Exception {
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void defaultKittensCountReturnsOne() throws Exception {
        feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
    }

    @Test
    public void specifiedKittensCountReturnsSameNumber() throws Exception {
        Assert.assertEquals(5, feline.getKittens(5));
    }


}

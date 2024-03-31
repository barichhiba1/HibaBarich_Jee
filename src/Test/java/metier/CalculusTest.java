package metier;

import org.junit.Assert;
import org.junit.Test;

public class CalculusTest {
    private Calcul calcul;

    @Test
    public void testSomme(){
        //on cree un scenario de test
        calcul= new Calcul();
        double a=5;
        double b=9;
        double expected=14;
        double res=calcul.somme(a,b);
        Assert.assertTrue(res==expected);
    }
}

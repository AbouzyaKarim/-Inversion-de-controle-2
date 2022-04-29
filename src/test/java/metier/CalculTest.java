package metier;

import org.junit.Assert;
import org.junit.Test;

public class CalculTest {
    private Calcul calcul;
    @Test
    public void testSomme(){
        calcul=new Calcul();
        double a=5;double b=9;
        double expected=14;
        double res=calcul.somme(5,9);

        Assert.assertTrue(res==expected);
    }
    @Test
    public void testSomme1(){
        calcul=new Calcul();
        double a=7;double b=3;
        double expected=10;
        double res=calcul.somme(a,b);

        Assert.assertTrue(res==expected);
    }
}

import jess.JessException;
import jess.Rete;

/**
 * Created by admin on 5/19/14 AD.
 */
public class jessmain {


    public  static void main(String[] args) throws JessException {
        Rete engine = new Rete();
        engine.batch("Templates.clp");
        engine.eval("(facts)");


    }
}

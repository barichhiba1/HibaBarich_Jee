//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Metier")
public class MetierImpl implements IMetier {
    @Autowired
    @Qualifier("dao")
    private IDao daoInter;

    public double Calcul() {
        double temperature = this.daoInter.getData();
        double res = temperature * 540.0 / Math.cos(temperature * Math.PI);
        return res;
    }

    public void setDao(IDao dao) {
        this.daoInter = dao;
    }

    public MetierImpl() {
    }

    public MetierImpl(IDao d) {
        this.daoInter = d;
    }
}

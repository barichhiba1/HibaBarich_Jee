//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package pres;

import dao.DaoImp;
import ext.DaoImpl2;
import metier.MetierImpl;

public class Presentation {
    public Presentation() {
    }

    public static void main(String[] args) {
        MetierImpl metier = new MetierImpl();
        DaoImp dao = new DaoImp();
        metier.setDao(dao);
        System.out.println(metier.Calcul());
        DaoImpl2 dao2 = new DaoImpl2();
        MetierImpl metier2 = new MetierImpl(dao2);
        System.out.println(metier2.Calcul());
    }
}

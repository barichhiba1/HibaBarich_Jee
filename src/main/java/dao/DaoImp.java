//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImp implements IDao {
    public DaoImp() {
    }

    public double getData() {
        System.out.print("Version Base de données : ");
        double temp = Math.random() * 40.0;
        return temp;
    }
}

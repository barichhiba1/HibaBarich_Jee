//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class presSpringAnnotation {
    public presSpringAnnotation() {
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(new String[]{"dao", "Metier", "ext"});
        IMetier metier = (IMetier)context.getBean(IMetier.class);
        System.out.println(metier.Calcul());
    }
}

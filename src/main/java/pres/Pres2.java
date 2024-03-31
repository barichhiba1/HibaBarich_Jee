package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {

        //Instanciation dynamique
        Scanner sc= new Scanner(new File("config.txt")); // 1- dao.DaoImp dans config
        String daoClassName = sc.nextLine();

        Class cDao=Class.forName(daoClassName);
        IDao dao=(IDao ) cDao.newInstance(); // comme new
        System.out.println((dao.getData()));

        //pour metier
        String metierClassName = sc.nextLine();
        Class cmetier=Class.forName(metierClassName);
        IMetier metier=(IMetier) cmetier.newInstance();

        //on doit faire appel a la methode set dao dans la class metier
        Method methode= cmetier.getMethod("setDao", IDao.class); //le deuxieme para c les para de la methode
        //metier.setDao(dao)
        methode.invoke(metier,dao);

        System.out.println("Resultat : "+ metier.Calcul());


        //Creation d'un projet Maven au lieu d'un projet java
        //on aura besoin d'un framework spring
        //projet maven contient un fichier xml
        //permet de gerer les dependances


        /*
        1 > mvn compile (maven va compiler)
        2 > mvn test (test unitaire)
        3 > mvn package => .jar ou .war (Archivage dans un fichier .jar ou .war)


         */



    }
}

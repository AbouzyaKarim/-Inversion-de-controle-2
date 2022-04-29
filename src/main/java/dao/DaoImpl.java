package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao{
    @Override
    public double getData() {

        /*
        Se connecter à la BD pour récuperer l'information
         */
        System.out.println("Version de base de donnée");
        double temp=Math.random()*40;
        return temp;
    }
}

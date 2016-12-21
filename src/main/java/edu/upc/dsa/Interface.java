package edu.upc.dsa;

/**
 * Created by Alberto on 21/12/2016.
 */
public interface Interface {
     String getUsuariInJSON( String usuari);
     String newEtakemon(String usuari, Etakemon etakemon);
     String iniciarSesion(Usuari user);
     String registro(Usuari user);
     int comprobar(Usuari user);
}

package edu.upc.dsa;

import com.google.gson.Gson;

/**
 * Created by Alberto on 21/12/2016.
 */
public class Manager implements Interface {
    @Override
    public String getUsuariInJSON(String usuari) {
        int pos=0;
        for (int i=0; i<Singleton.getInstance().getList().size();i++){
            if (Singleton.getInstance().getList().get(i).getNom().equals(usuari)){
                pos=i;
            }
            else {}
        }

        String json = new Gson().toJson(Singleton.getInstance().getList().get(pos).getList());
        return json;
    }

    @Override
    public String newEtakemon(String usuari, Etakemon etakemon) {
        int pos=0;
        for (int i=0; i<Singleton.getInstance().getList().size();i++){
            if (Singleton.getInstance().getList().get(i).getNom().equals(usuari)){
                pos=i;
            }
            else {}
        }
        Singleton.getInstance().getList().get(pos).getList().add(etakemon);

        return "200";
    }

    @Override
    public String iniciarSesion(Usuari user) {
        int i=comprobar(user);
        if (i==0){
            return "200";
        }

        else {return "500";}
    }

    @Override
    public String registro(Usuari user) {
        int i=comprobar(user);
        if (i==0){return "500";}
        else {
            Singleton.getInstance().getList().add(user);
            return "200";
        }
    }

    @Override
    public int comprobar(Usuari user) {
        int sol=1;
        for (int i = 0; i < Singleton.getInstance().getList().size(); i++) {
            if (Singleton.getInstance().getList().get(i).getNom().equals(user.getNom()) &&
                    Singleton.getInstance().getList().get(i).getContra().equals(user.getContra())) {
                sol = 0;
                i=Singleton.getInstance().getList().size();
            } else {
                sol = 1;
            }
        }
        return sol;
    }
}

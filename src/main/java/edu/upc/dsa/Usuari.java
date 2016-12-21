package edu.upc.dsa;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alberto on 19/12/2016.
 */
public class Usuari {
    public String nom;
    public String contra;
    public List<Etakemon> list=new ArrayList<>();
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public List<Etakemon> getList() {
        return list;
    }

    public void setList(List<Etakemon> list) {
        this.list = list;
    }
}

package edu.upc.dsa;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alberto on 21/12/2016.
 */
public class Singleton {
    private static Singleton ourInstance = new Singleton();
    List<Usuari> list=new ArrayList<>();
    public static Singleton getInstance() {
        if (ourInstance==null) ourInstance=new Singleton();
        return ourInstance;
    }
    private Singleton() {
    }
    public List<Usuari> getList(){
        return this.list;
    }
    }


package com.sintel.informatique3me;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataCorriges {

    public static HashMap<String, List<String>> getData() {
        HashMap<String,List<String>> expandablelistDetail= new HashMap<String, List<String>>();
        List<String> Integration = new ArrayList<String>();
        Integration.add("Fiche d'intégration 1");
        Integration.add("Fiche d'intégration 2");
        Integration.add("Fiche d'intégration 3");
        Integration.add("Fiche d'intégration 4");
        Integration.add("Fiche d'intégration 5");
        Integration.add("Fiche d'intégration 6");
        Integration.add("Fiche d'intégration 7");
        Integration.add("Fiche d'intégration 8");
        Integration.add("Fiche d'intégration 9");

        List<String> Examen = new ArrayList<String>();
        Examen.add("BEPC 2018");
        Examen.add("BEPC 2019");

        expandablelistDetail.put("FICHES D'INTEGRATION",Integration);
        expandablelistDetail.put("SUJETS D'EXAMEN",Examen);

        return expandablelistDetail;
    }
}

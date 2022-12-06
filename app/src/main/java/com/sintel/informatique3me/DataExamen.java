package com.sintel.informatique3me;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataExamen {
    public static HashMap<String, List<String>> getData() {
        HashMap<String,List<String>> expandablelistDetail= new HashMap<String, List<String>>();

        List<String> theorique = new ArrayList<String>();
        theorique.add("BEPC 2018");
        theorique.add("BEPC 2019");

        List<String> pratique = new ArrayList<String>();
        pratique.add("BEPC 2018");
        pratique.add("BEPC 2019");

        expandablelistDetail.put("SUJETS THEORIQUES",theorique);
        expandablelistDetail.put("SUJETS PRATIQUES",pratique);


        return expandablelistDetail;
    }
}

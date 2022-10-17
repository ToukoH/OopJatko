package fi.utu.tech.ooj.exercise2.tehtava1;

import java.util.ArrayList;

public class Gkohta {
    ArrayList<Integer> createList(int[] tableToUse) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (final int j : tableToUse) {
            integerArrayList.add(j);
        }
        return integerArrayList;
    }
}

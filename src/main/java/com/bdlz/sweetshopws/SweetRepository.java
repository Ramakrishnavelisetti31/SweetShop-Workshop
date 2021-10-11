package com.bdlz.sweetshopws;

import java.util.ArrayList;
import java.util.List;

public class SweetRepository {
    private List sweetList = new ArrayList();

    public List getSweetList() {
        return sweetList;
    }

    public void add(BundharLaddu bundharLaddu) {
        sweetList.add(bundharLaddu);
    }

    public void add(KakinadaKaja kakinadaKaja) {
        sweetList.add(kakinadaKaja);
    }

    public void add(Jelibi jelibi) {
        sweetList.add(jelibi);
    }

    public void add(Kalakhand kalakhand) {
        sweetList.add(kalakhand);
    }

    public void add(Putharekulu putharekulu) {
        sweetList.add(putharekulu);
    }
}

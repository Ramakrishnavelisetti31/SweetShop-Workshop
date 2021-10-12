package com.bdlz.sweetshopws;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SweetRepository {

    private Set<Sweet> sweetList = new HashSet();

    public Set getSweetList() {
        return sweetList;
    }

    public void add(Sweet sweet) {
        sweetList.add(sweet);
    }

    public void delete(BundharLaddu bundharLaddu) {
        sweetList.remove(bundharLaddu);
    }

    public void delete(Kalakhand kalakhand) {
        sweetList.remove(kalakhand);
    }

    public void delete(KakinadaKaja kakinadaKaja) {
        sweetList.remove(kakinadaKaja);
    }
}

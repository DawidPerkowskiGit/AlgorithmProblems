package org.example.latestorderlist;

import java.util.ArrayList;
import java.util.List;

public class LatestOrderList {

    private List<Integer> orderList = new ArrayList<>();

    public void record(int orderId) {
        this.orderList.add(orderId);
    }

    public int get_last(int element) {
        return this.orderList.get(this.orderList.size() - element);
    }
}

/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 */

package com.huawei.mini;

import java.util.ArrayList;

public abstract class AbstractParkingBoy {
    protected final ArrayList<ParkingLot> parkingLots = new ArrayList<>();

    public void assignParkingLots(ParkingLot lot) {
        parkingLots.add(lot);
    }

    abstract Ticket park();

    public Ticket unPark(Ticket ticket) {
        for(ParkingLot lot: parkingLots) {
            if (lot.getLotId() == ticket.getLotId() && !ticket.getUsed()) {
                ticket.expire();
                lot.unPark();

                return ticket;
            }
        }

        return null;
    }
}

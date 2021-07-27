/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 */

package com.huawei.mini;
import java.util.Comparator;

public class NormalParkingBoy extends AbstractParkingBoy {

    @Override
    Ticket park() {
        parkingLots.sort(new Comparator<ParkingLot>() {
            @Override
            public int compare(ParkingLot o1, ParkingLot o2) {
                return o2.left() - o1.left();
            }
        });

        int lotId = parkingLots.get(0).unPark();

        return new Ticket(lotId);
    }
}

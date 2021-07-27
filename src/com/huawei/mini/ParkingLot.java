/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 */

package com.huawei.mini;

public class ParkingLot {
    private int lotId;

    private int total;

    private int used;

    public ParkingLot(int lotId, int total) {
        this.lotId = lotId;
        this.total = total;
    }

    public int getLotId() {
        return lotId;
    }

    public int getUsed() {
        return used;
    }

    public int left() {
        return total - used;
    }

    public void park() {
        used += 1;
    }

    public int unPark() {
        used -= 1;

        return lotId;
    }
}

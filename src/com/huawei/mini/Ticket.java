/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 */

package com.huawei.mini;

public class Ticket {
    private int lotId;

    private boolean used;

    public Ticket(int lotId) {
        this.lotId = lotId;
    }

    public int getLotId() {
        return lotId;
    }

    public void setLotId(int lotId) {
        this.lotId = lotId;
    }

    public boolean getUsed() {
        return used;
    }

    public void expire() {
        this.used = true;
    }
}

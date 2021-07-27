/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 */

package corejava.v1ch05.JavaAnnotation;
import corejava.v1ch05.JavaAnnotation.FruitColor.Color;

/**
 * 注解使用
 */
public class Apple {
    @FruitName("Apple")
    private String appleName;

    @FruitColor(fruitColor = Color.BLUE)
    private String appleColor;

    @FruitProvider(id = 1, name="gougou", address = "xian")
    private String appleProvider;

    public String getAppleName() {
        return appleName;
    }

    public void setAppleName(String appleName) {
        this.appleName = appleName;
    }

    public String getAppleColor() {
        return appleColor;
    }

    public void setAppleColor(String appleColor) {
        this.appleColor = appleColor;
    }

    public String getAppleProvider() {
        return appleProvider;
    }

    public void setAppleProvider(String appleProvider) {
        this.appleProvider = appleProvider;
    }


    public void displayName() {
        System.out.println("水果的名字是: 苹果");
    }
}

package com.livestudy.twelveth;

import study.Car;

public class AnnotationTest implements Car {
    @Override
    public boolean isHybrid() {
        return false;
    }
}

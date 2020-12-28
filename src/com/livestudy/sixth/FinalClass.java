package com.livestudy.sixth;
public  class FinalClass {
    final double PI = 3.141592;
    int x = 10;
    int y = 20;
    int sum() {
        return this.x + this.y;
    }

    final int mul() {
        return this.x - this.y;
    }

    class Test extends FinalClass {
        @Override
        int sum() {
            return super.sum();
        }
    }
}

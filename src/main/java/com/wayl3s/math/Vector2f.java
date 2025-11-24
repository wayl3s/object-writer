package com.wayl3s.math;

public class Vector2f {
    private final float EPS = 10e-7f;

    public float x;
    public float y;

    public Vector2f(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Vector2f other) {
        return Math.abs(this.x - other.x) < EPS && Math.abs(this.y - other.y) < EPS;
    }
}

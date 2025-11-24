package com.wayl3s.math;

public class Vector3f {
    private final float EPS = 10e-7f;

    public float x;
    public float y;
    public float z;

    public Vector3f(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public boolean equals(Vector2f other) {
        return Math.abs(this.x - other.x) < EPS && Math.abs(this.y - other.y) < EPS && Math.abs(this.y - other.y) < EPS;
    }
}

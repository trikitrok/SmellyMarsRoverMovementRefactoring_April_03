package com.dodevjutsu.rover;

public class Vector {
    private final Coordinates origin;
    private final Direction direction;

    public Vector(Coordinates origin, Direction direction) {
        this.origin = origin;
        this.direction = direction;
    }

    public Vector rotateRight() {
        return new Vector(origin, direction.rotateRight());
    }

    public Vector rotateLeft() {
        return new Vector(origin, direction.rotateLeft());
    }

    public Vector displace(int displacement) {
        return new Vector(direction.displace(origin, displacement), direction);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vector vector = (Vector) o;

        if (origin != null ? !origin.equals(vector.origin) : vector.origin != null) return false;
        return direction != null ? direction.equals(vector.direction) : vector.direction == null;

    }

    @Override
    public int hashCode() {
        int result = origin != null ? origin.hashCode() : 0;
        result = 31 * result + (direction != null ? direction.hashCode() : 0);
        return result;
    }
}

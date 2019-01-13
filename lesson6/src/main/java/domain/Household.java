package domain;

import java.util.Objects;

public abstract class Household<H, D, W> {
    private H heigth;
    private D depth;
    private W width;

    public Household() {
    }

    public Household(H heigth, D depth, W width) {
        this.heigth = heigth;
        this.depth = depth;
        this.width = width;
    }

    public H getHeigth() {
        return heigth;
    }

    public D getDepth() {
        return depth;
    }

    public W getWidth() {
        return width;
    }

    public void setHeigth(H heigth) {
        this.heigth = heigth;
    }

    public void setDepth(D depth) {
        this.depth = depth;
    }

    public void setWidth(W width) {
        this.width = width;
    }

    //abstract method
    public abstract void plugIn();

    public abstract void getSize();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Household<?, ?, ?> household = (Household<?, ?, ?>) o;
        return Objects.equals(heigth, household.heigth) &&
                Objects.equals(depth, household.depth) &&
                Objects.equals(width, household.width);
    }

    @Override
    public int hashCode() {
        return Objects.hash(heigth, depth, width);
    }

    @Override
    public String toString() {
        return "Household{" +
                "heigth=" + heigth +
                ", depth=" + depth +
                ", width=" + width +
                '}';
    }
}

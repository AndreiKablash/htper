package util;



import domain.EnumStore;
import domain.Household;

import java.util.Objects;

public class WashingMachine extends Household<String, String, String> implements Play {
    private String name;
    private EnumStore type;
    private String color;
    private double maxLoad;

    public WashingMachine() {
    }

    public WashingMachine(String heigth, String depth, String width, String name, EnumStore type, String color, double maxLoad) {
        super(heigth, depth, width);
        this.name = name;
        this.type = type;
        this.color = color;
        this.maxLoad = maxLoad;
    }

    public String getName() {
        return name;
    }

    public EnumStore getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public double getMaxLoad() {
        return maxLoad;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(EnumStore type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxLoad(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    @Override
    public void plugIn() {
        System.out.println("Plug in " + getType() + " " + this.name);
    }

    @Override
    public void setSettings() {
        System.out.println("Choose program for  " + this.type + " " + this.name);
    }

    @Override
    public void start() {
        System.out.println("Start laundry: press play");
    }

    @Override
    public void load() {
        System.out.println("Please, load the washer");
    }

    //Overload
    public void load(double load) {
        if (this.maxLoad >= load)
            System.out.println("You can start laundry");
        else
            System.out.println("Overload! Your load bigger than maxLoad of washing machine.");
    }

    @Override
    public void getSize() {
        System.out.println(getDepth() + "x" + getHeigth() + "x" + getHeigth());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        WashingMachine that = (WashingMachine) o;
        return Double.compare(that.maxLoad, maxLoad) == 0 &&
                Objects.equals(name, that.name) &&
                type == that.type &&
                Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, type, color, maxLoad);
    }

    @Override
    public String toString() {
        return "WashingMachine{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", color='" + color + '\'' +
                ", maxLoad=" + maxLoad +
                '}';
    }
}

package py.nelson.lz.iwvg_devops.practica;

import java.util.ArrayList;
import java.util.List;
//se ha agregado una mejora xxx
// se ha agregado la segunda mejora yy
public class DecimalCollection {
    private List<Double> collection;

    public DecimalCollection() {
        this.collection = new ArrayList<>();
    }

    public void add(double value) {
        this.collection.add(value);
    }

    public int size() {
        return this.collection.size();
    }

    public double sum() {
        double sum = Double.NaN;
        for (double item : this.collection) {
            sum = getSum(sum, item);
        }
        return sum;
    }

    private double getSum(double sum, double item) {
        if (Double.isNaN(sum)) {
            sum = item;
        } else {
            sum += item;
        }
        return sum;
    }

    public double sumEvenValues() {
        assert this.collection != null;
        double sum = Double.NaN;
        for (double item : this.collection) {
            if (0 == item % 2) {
                sum = getSum(sum, item);
            }
        }
        return sum;
    }

    public double max() {
        assert this.collection != null;
        double max = Double.NaN;
        for (double item : this.collection) {
            if (Double.isNaN(max) || item > max) {
                max = item;
            }
        }
        return max;
    }
}

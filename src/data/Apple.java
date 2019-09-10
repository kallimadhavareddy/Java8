package data;

import com.osp.utils.Color;

public class Apple {
    private int sequence;
    private Color color;
    private int weight;
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Apple(int sequence, Color color, int weight) {
        this.sequence = sequence;
        this.color = color;
        this.weight = weight;
    }

    public Apple(Color color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }
}

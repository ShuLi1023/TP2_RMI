package part2.entity;

import java.io.Serializable;

public class Exam implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    double score;
    double coefficient;

    public Exam(String name, float score, double coefficient) {
        this.name = name;
        this.score = score;
        this.coefficient = coefficient;
    }

    public String getName() {
        return name;
    }


    public double getScore() {
        return score;
    }


    public double getCoefficient() {
        return coefficient;
    }

}

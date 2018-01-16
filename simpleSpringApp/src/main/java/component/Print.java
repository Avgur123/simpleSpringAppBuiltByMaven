package component;

import component.figure.Figure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Print {
    @Autowired
    @Qualifier("rectangle")
    private Figure figure;

    public Print() {
        System.out.println("Bean print is being created");
    }

    public void setFigure(Figure figure) {
        this.figure = figure;
    }

    public void showSquare() {
        System.out.println("Square of " + this.figure.getName() + " is " + this.figure.getSquare());
    }
}
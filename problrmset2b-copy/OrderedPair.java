
/**
 * ProblemSet2B
 *
 * William Zheng
 * Sept 21, 2023
 */
public class OrderedPair {

    double X,Y;

    public OrderedPair(){
        X = 0;
        Y = 0;
    }

    public OrderedPair(double x, double y){
        X = x;
        y = y;

    }

    public String toString(){
        return "("+X+","+Y+")";

    }

    public double getX(){
        return X;
    }

    public double getY(){
        return Y;
    }
    
}

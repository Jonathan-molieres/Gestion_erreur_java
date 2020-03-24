import java.util.ArrayList;

public class IntSet {
    private int low;
    private int high;
    private ArrayList<Integer> ensemble;
    public IntSet(int l, int h) throws WrongDimensionException {
        if (h > l) {
            this.high = h;
            this.low = l;
        } else {
            throw new WrongDimensionException();
        }
        ensemble= new ArrayList<Integer>();
    }

    public void setlow(int l) throws WrongDimensionException {
        if (this.high > l) {
            this.low = l;
        } else {
            throw new WrongDimensionException();
        }
    }

    public void setHigh(int h) throws WrongDimensionException {
        if (h > this.low) {
            this.high = h;
        } else {
            throw new WrongDimensionException();
        }
    }
    public void addValue(int value) throws NotInTheLimitsException {
            if(value<=this.high && value>=this.low && !ensemble.contains(value)){
                ensemble.add(value);
            }else{
                throw  new NotInTheLimitsException();
            }

    }
    public Boolean removeValue(int value) throws NotInTheLimitsException {
        if(value<=this.high && value>=this.low && ensemble.contains( value)) {
            ensemble.remove(value);
            return true;

        }else{
            throw  new NotInTheLimitsException();
        }
    }
}



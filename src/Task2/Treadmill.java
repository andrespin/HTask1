package Task2;

import Interfaces.MovingObject;

public class Treadmill implements Barrier  {

    private int length;

    public int getLength() {
        return length;
    }

    public Treadmill(int length)
    {
        this.length = length;
    }

}

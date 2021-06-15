public class RoomDimension {
    private double length;
    private double width;

    public RoomDimension(double l, double w)
    {
        length =l;
        width =w;
    }

    public RoomDimension(RoomDimension room1)
    {
        length = room1.length;
        width = room1.width;
    }

    public double getArea()
    {
        return length*width;
    }

    public String toString()
    {
        String str= "The area of room is " + getArea() + " sq.ft .";
        return str;
    }
}

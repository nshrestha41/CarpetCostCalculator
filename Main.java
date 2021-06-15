public class Main {
    public static void main (String[] args)
    {
        RoomDimension a1 = new RoomDimension(5,5);
        RoomCarpet r1 = new RoomCarpet(a1,100);

        System.out.println(a1);
        System.out.println(r1);
    }
}

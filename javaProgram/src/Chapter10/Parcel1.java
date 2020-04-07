package Chapter10;

public class Parcel1 {
    class Contents{
        private int i = 11;
        public int value(){return i;}
    }

    class Destination{
        private String label;

        Destination(String whereTo) {
            label = whereTo;
        }
        String readLabel(){return label;}
    }

    public Destination to(String dest) {
        return new Destination(dest);
    }

    public Contents contents(){
        return new Contents();
    }

    public void ship(String test) {
        Contents c = contents();
        Destination b = to(test);
        System.out.println(b.readLabel());
    }

    public static void main(String[] args) {
        Parcel1 p = new Parcel1();
        p.ship("lxydsg");
        Parcel1 q = new Parcel1();
        Parcel1.Destination c = q.to("Bruce");
        Contents d = q.contents();
    }

}

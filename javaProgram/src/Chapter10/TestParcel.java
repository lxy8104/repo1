package Chapter10;

interface Destination{
    String readLabel();
}

interface Contents{
    int value();
}

class Parcel4{
    private class PContents implements Contents{
        private int i = 11;
        public int value(){return i;}
    }
    protected class PDestination implements Destination{
        private String label;

        /*private PDestination(String whereTo) {
            label=whereTo;//把构造函数设置为private无法创建对象实例。
        }*/
        public PDestination(String whereTo) {
            label=whereTo;
        }
        public String readLabel(){return label;}
    }
    public Destination destination(String s){
        return new PDestination(s);
    }

    public Contents contents() {
        return new PContents();
    }

    public static void main(String[] args) {
        Parcel4 p1 = new Parcel4();
        Parcel4.PContents pc2 = p1.new PContents();//可以访问
        System.out.println(pc2.i);
    }

}

public class TestParcel {
    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Contents c = p.contents();
        Destination d = p.destination("asd");
        Parcel4.PDestination pc = p.new PDestination("wher");
        //Parcel4.PContents    PContents设置为private，cannot access to private class
        //p.PContents
    }
}

package Chapter9;

import java.util.Arrays;
interface Processor{
    String name();//默认是public 后面导出类覆盖该方法必须为public
    Object process(Object input);
}

class Upcase implements Processor{
    public String name(){return getClass().getSimpleName();}
    public String process(Object input){
        return ((String)input).toUpperCase();
    }
}

class DownCase implements Processor{
    public String name(){return getClass().getSimpleName();}
    @Override public String process(Object input){
        return ((String)input).toLowerCase();
    }
}

class Splitter implements Processor{
    public String name(){return getClass().getSimpleName();}
    @Override public String process(Object input){
        return Arrays.toString(((String)input).split(" "));
    }
}

public class Apply {
    public static void process(Processor p, Object s){
        System.out.println("Using Processor "+ p.name());
        System.out.println(p.process(s));
    }
    public static String s= "Disaggreement with beliefs is by definition incorrect";
    public static void main(String[] args){
        process(new Upcase(), s);
        process(new DownCase(), s);
        process(new Splitter(), s);
        Processor bb;
    }
}

package Chapter6;



import java.util.Arrays;

class Connection{
    private static Connection connection = new Connection();
    private Connection(){

    }
    public static Connection makeConnection(){
        return connection;
    }

}

public class ConnectionManager {
    public static Connection[] cons = new Connection[5];
    static {
        System.out.println("初始化Connection");
        for(int i =0;i<5;i++){
            cons[i] = Connection.makeConnection();
        }
    }
    public static Connection getConnection(){
        int l = cons.length;
        if(l>0){
            Connection con = cons[--l];
            cons = Arrays.copyOf(cons,l);
            return con;
        }else{
            return null;
        }
    }
    public static void main(String[] args){
        try{
            for(int i = 0;i<7;i++){
                Connection con = ConnectionManager.getConnection();
                System.out.println(i+"、"+con);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(cons);
    }
}

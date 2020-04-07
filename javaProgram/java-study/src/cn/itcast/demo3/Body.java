package cn.itcast.demo3;

 class Body {

     private String name;

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public class Heart{
         private String name;
         public void beat(){
             System.out.println("心脏跳动");
             System.out.println("我叫"+this.name);
         }

         public String getName() {
             return name;
         }

         public void setName(String name) {
             this.name = name;
         }
     }

     public void methodBody(){
         int bb = 10;
         //bb++;
         System.out.println("外部类方法");
         new Heart().beat();
         class InnerBody{
             int num = 99;
             Integer ii =111;
             public void methodInner(){
                 System.out.println(num);
                 System.out.println(ii);
             }
         }
         InnerBody  innerBody = new InnerBody();
         innerBody.methodInner();
     }

     public static void main(String[] args) {
         Body body = new Body();
         body.setName("lxy");
         body.methodBody();
         Body.Heart hhh  = new Body().new Heart();
         hhh.setName("zzz");
         hhh.beat();
     }
}

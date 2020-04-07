package JavaCoreTech.Chapter5.inheritance;

import javax.sound.midi.SysexMessage;
import java.util.Arrays;

public class ManagerTest {
    public static void main(String[] args){
        Manager boss = new Manager("Carl Cracker", 80000, 1987, 12 ,15);
        boss.setBonus(5000);
        boss.bonus++;//Manager类设置为final类，其方法自动转换为final，但不包括域
        System.out.println(boss.bonus);
        Employee[] staff = new Employee[3];
        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 50000,1987,10,1);
        staff[2] = new Employee("Tom Tester",40000, 1990,3,15);
        for(Employee e:staff)
            System.out.println("name="+e.getName()+",salary = " + e.getSalary() + "");
        Manager[] managers = new Manager[3];
        Employee[] staff2 = managers; //managers 和 staff2 引用的是同一个数组
        staff[0] = new Employee("Harry Hacker2", 40000,1987,10,2);
        //managers[0].setBonus(1000);//似乎吧一个普通雇员擅自归入经理行列中了。
        System.out.println(staff[0].getName());
        Employee.play();
        //Manager boss2 = (Manager) staff[1];
        System.out.println(boss.hashCode());

        Employee alice1 = new Employee("Alice Adams",7500,1987,12,14);
        Employee alice2 = alice1;
        Employee alice3 = new Employee("Alice Adams",7500,1987,12,14);
        Employee bob = new Employee("Bob Brandson",5000,1989,10,14);

        System.out.println("alice1 == alice2" + (alice1 == alice2));
        System.out.println("alice1 == alice3" + (alice1 == alice3));
        System.out.println("alice1.equals(alice3):" + alice1.equals(alice3));
        System.out.println("alice1.equals(bob):" + alice1.equals(bob));
        System.out.println("bob.toString():" + bob.toString());

        Arrays.sort(staff);
        for(Employee t: staff)
            System.out.println(t.salary);

    }
}

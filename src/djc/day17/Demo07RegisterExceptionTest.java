package djc.day17;

import java.util.Scanner;

/*
 * 模拟注册操作：
 *   如果用户名已经存在，则抛出异常并提示：
 *       该用户名已被注册。
 *   分析：
 *       1：使用数组保存已经注册过的用户名（数据库）
 *       2：使用Scanner获取用户输入的注册的用户名
 *       3：定义一个方法，对用户输入的注册的用户的用户名进行判断：
 *           遍历存储已经注册过的用户名的数组，获取每一个用户名；
 *           使用获取到的用户名和用户输入的用户名比较：
 *               true：
 *                   用户名已经存在，抛出RegisterException异常。告知用户"用户名已经被注册"
 *               false：
 *                   继续遍历比较
 *           如果循环结束了，还没有找到重复的用户名，提示用户"恭喜您注册成功！"
 */
public class Demo07RegisterExceptionTest { //模拟注册操作
    //创建一个数组保存已经注册过的用户名
    static String[] usernames = {"张三", "李四", "王五"};

    public static void main(String[] args) /*throws RegisterException*/ {
        //使用Scanner获取用户输入的注册的用户名
        Scanner sc = new Scanner(System.in);
        String rgname = sc.next();

        //编译期异常
        /*
          djc.day17.RegisterException: 用户名已经被注册
	      at djc.day17.Demo07RegisterExceptionTest.check1(Demo07RegisterExceptionTest.java:43)
	      at djc.day17.Demo07RegisterExceptionTest.main(Demo07RegisterExceptionTest.java:30)
	    */
        check1(rgname);
        System.out.println("===========");

        //运行期异常
        /*
          Exception in thread "main" djc.day17.RegisterException: 用户名已经被注册
	      at djc.day17.Demo07RegisterExceptionTest.check2(Demo07RegisterExceptionTest.java:61)
	      at djc.day17.Demo07RegisterExceptionTest.main(Demo07RegisterExceptionTest.java:33)
	    */
        check2(rgname);
    }

    //对用户输入的注册的用户的用户名进行判断的方法
    //继承Exception，编译期异常
    public static void check1(String rgname) /*throws RegisterException*/ {
        for (String s : usernames) {
            if (s.equals(rgname)) {
                //true，用户名已经存在，抛出RegisterException异常
                // 告知用户"用户名已经被注册"
                try {
                    throw new RegisterException("用户名已经被注册");
                } catch (RegisterException e) {
                    e.printStackTrace();
                    return; //结束方法
                }
            }
        }
        //循环结束了，还没有找到重复的用户名
        //提示用户"恭喜您注册成功！"
        System.out.println("恭喜您注册成功！");
    }

    //对用户输入的注册的用户的用户名进行判断的方法
    //继承RuntimeException，运行期异常
    public static void check2(String rgname) /*throws RegisterException*/ {
        for (String s : usernames) {
            if (s.equals(rgname)) {
                //true，用户名已经存在，抛出RegisterException异常
                // 告知用户"用户名已经被注册"
                throw new RegisterException("用户名已经被注册"); //运行期异常直接交给JVM处理
            }
        }
        //循环结束了，还没有找到重复的用户名
        //提示用户"恭喜您注册成功！"
        System.out.println("恭喜您注册成功！");
    }

}

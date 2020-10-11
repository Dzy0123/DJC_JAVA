package djc.day11;

//继承父类并实现多个接口的实现类
public class MyInterfaceImpl extends Object implements MyInterfaceExtends {
    /*相当于implements MyInterfaceA,MyInterfaceB*/

    //覆盖重写接口A抽象方法
    @Override
    public void methodA() {
        System.out.println("覆盖重写了A抽象方法");
    }

    //覆盖重写接口B抽象方法
    @Override
    public void methodB() {
        System.out.println("覆盖重写了B抽象方法");
    }

    //覆盖重写了接口A和接口B都有的抽象方法
    @Override
    public void method() {
        System.out.println("覆盖重写了接口A和接口B冲突的抽象方法");
    }

    //对接口A和接口B冲突的默认方法进行覆盖重写，但是在子接口MyInterfaceExtends中已经重写过了，所以可以不写
    //如果没有注释掉，相当于二次覆盖重写
    /*@Override
    public void methodDefault() {
        //System.out.println("对多个接口中冲突的默认接口进行了覆盖重写");
    }*/

}

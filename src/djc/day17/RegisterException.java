package djc.day17;

public class RegisterException extends /*Exception*/ RuntimeException { //自定义异常类，注册异常，编译期异常或运行期异常
    //添加一个空参构造方法
    public RegisterException() {
        super();
    }

    /*添加一个带异常信息的构造方法
     * 所有异常类都会有一个带异常信息的构造方法，
     * 方法内部会调用父类带异常信息的构造方法，让父类来处理这个异常信息
     */
    public RegisterException(String message) {
        super(message);
    }
}

package djc.day20;

import java.io.File;
import java.io.FileFilter;

/*
创建过滤器FileFilter的实现类
重写过滤方法accept，定义过滤规则
*/
public class FileFilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        String name = pathname.getName();
        //如果pathname是文件夹也返回true
        if (pathname.isDirectory()) {
            return true;
        }
        return name.endsWith(".java");
    }
}

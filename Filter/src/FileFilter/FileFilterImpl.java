package FileFilter;

import java.io.File;
import java.io.FileFilter;

public class FileFilterImpl implements FileFilter {
    //accept方法返回true:会把传递过去的File对象保存到File数组中
    //false:不会把传递过去的File对象保存到File数组中
    @Override
    public boolean accept(File pathname) {
        /*
        过滤的规则:
        在accept方法中,判断File对象是否是以.java结尾
        如果pathname是一个文件夹,返回true,继续遍历
         */
        if(pathname.isDirectory()){
            return true;
        }
        return pathname.getName().toLowerCase().endsWith(".java");
    }
}

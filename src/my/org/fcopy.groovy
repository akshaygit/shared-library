package my.org

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

 def func()
 {
        String source = "C:/Users/abisht2/Desktop/source";
        File srcDir = new File(source);  
        String destination = "C:/Users/abisht2/Desktop/destination";
        File destDir = new File(destination);
        FileUtils.copyDirectory(srcDir, destDir);  
 }

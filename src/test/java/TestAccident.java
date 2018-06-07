import com.google.gson.Gson;
import com.swjtu.SYWeiServers.util.DBHelper;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/10/22.
 */
public class TestAccident {

    @Test
    public void test() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/spring/applicationContext-*.xml");

        DBHelper.createNewDB("YYH");

    }

//    private  boolean deleteDir(File dir) {
//        if (dir.isDirectory()) {
//            String[] children = dir.list();
//            //递归删除目录中的子目录下
//            for (int i=0; i<children.length; i++) {
//                boolean success = deleteDir(new File(dir, children[i]));
//                if (!success) {
//                    return false;
//                }
//            }
//        }
//        // 目录此时为空，可以删除
//        return dir.delete();
//    }
}

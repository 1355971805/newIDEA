import cn.happy.mysqltools.TableOperate;
import org.junit.Test;

/**
 * Created by 王 on 2017/8/2.
 */
public class mysqlToos {
    @Test
    public void test() throws Exception {
        TableOperate tool=new TableOperate();
        tool.tableToClass("src/main/java/cn/happy/mysqltools/wk");

    }
}

package cn.happy.day03;

import java.util.List;
import java.util.Map;
import java.util.Properties;
/**
 * Created by 王 on 2017/7/26.
 */
public class Connection {
    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    private String[]names;
    private List<Car>list;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    private  Properties properties;

    public List<Car> getList() {
        return list;
    }

    public void setList(List<Car> list) {
        this.list = list;
    }

    private Map<String,Car>map;

    public Map<String, Car> getMap() {
        return map;
    }

    public void setMap(Map<String, Car> map) {
        this.map = map;
    }
}

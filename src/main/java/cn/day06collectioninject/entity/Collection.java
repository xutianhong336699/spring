package cn.day06collectioninject.entity;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Collection {
    private String[] array;
    private List<String> list;
    private Set<String> setlist;
    private Map<String,String> map;
    private Properties properties;

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public List <String> getList() {
        return list;
    }

    public void setList(List <String> list) {
        this.list = list;
    }

    public Set <String> getSetlist() {
        return setlist;
    }

    public void setSetlist(Set <String> setlist) {
        this.setlist = setlist;
    }

    public Map <String, String> getMap() {
        return map;
    }

    public void setMap(Map <String, String> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

}

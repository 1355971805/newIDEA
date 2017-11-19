package cn.wk.entity;

import java.util.List;

public class category {
    private int id;
    private String text;
    private int pid;
    private List<thrr> children;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<thrr> getChildren() {
        return children;
    }

    public void setChildren(List<thrr> children) {
        this.children = children;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }
}

package cn.happy.prints.pranter;

import cn.happy.prints.ink.Ink;
import cn.happy.prints.ppaper.Paper;

/**
 * Created by 王 on 2017/7/23.
 */
public class printers {
    private Ink ink;
    private Paper paper;

    public Ink getInk() {
        return ink;
    }

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    public void print()
    {
        System.out.println("用"+ink.getColor()+"\t颜色的墨盒在"+paper.getPaper()+"\t类型的纸张上答应出来我爱你困堃堃");
    };
}

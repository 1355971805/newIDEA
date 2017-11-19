package cn.blog.entity;

/**
 * Created by 王 on 2017/7/2.
 */
public class BlogInfo {
    	private  int BlogId;
            private  String BlogAuthor;
            private  String BlogAddress;

    public int getBlogId() {
        return BlogId;
    }

    public void setBlogId(int blogId) {
        BlogId = blogId;
    }

    public String getBlogAuthor() {
        return BlogAuthor;
    }

    public void setBlogAuthor(String blogAuthor) {
        BlogAuthor = blogAuthor;
    }

    public String getBlogAddress() {
        return BlogAddress;
    }

    public void setBlogAddress(String blogAddress) {
        BlogAddress = blogAddress;
    }

    public boolean isBlogDel() {
        return BlogDel;
    }

    public void setBlogDel(boolean blogDel) {
        BlogDel = blogDel;
    }

    private  boolean BlogDel;
}

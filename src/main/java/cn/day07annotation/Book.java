package cn.day07annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Book {
    @Value("1")
    private Integer bookid;
    @Value("成长的烦恼")
    private String bookname;

    /*@Autowired
    @Qualifier("publisher")*/
    @Resource(name="publisher")
    private Publisher pub; // 域属性赋值方法Autowired,按照byType进行装配,
    // 因为在Spring容器内还有一个Publisher类的子类PublisherChild，容器内有2个Type < xml配置里面的Class > 为Publisher的Bean,故会报错找到2个。
    // 如果域属性的名称 < 此处为publisher > 与容器内2个Type < xml配置里面的Class > 为Publisher的Bean中的某一个Bean的id相同,则按照该Bean进行装配。
    // @Component ：默认Spring容器内 该Bean的id 为其类名<首字母小写>
    // 可以通过加 @Qualifier 为域属性配置名称,名称与容器内某个Bean的id 相同时,就装配该Bean.
    // @Qualifier 必须和 @Autowired 一起使用.
    // JDK注解：使用@Resource时，如果没有设置 name 属性值,就会默认取变量名称当做name < 此处为 pub >。

    public Publisher getPub() {
        return pub;
    }

    public void setPub(Publisher pub) {
        this.pub = pub;
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

}

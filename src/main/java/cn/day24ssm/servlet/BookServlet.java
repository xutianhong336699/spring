// Servlet Annotated Class.java模板(带注解的Servlet)

package cn.day24ssm.servlet;

import cn.day24ssm.entity.Book;
import cn.day24ssm.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description TODO
 * @ClassName BookServlet
 * @Author xutianhong
 * @Date 2019/4/19 11:50
 * @Version V1.0
 */
@WebServlet(name = "BookServlet", urlPatterns = "/BookServlet")
public class BookServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");  // 处理post请求乱码问题
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8"); // 处理响应乱码问题:字节流需getBytes("UTF-8")
        // str = new String(str.getBytes("ISO-8859-1"), "UTF-8");   // 处理get请求乱码问题
        // response.getWriter().write("你好 servlet!");

        /*ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext24.xml");*/
        ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
        BookService bookService = ctx.getBean("bookService", BookService.class);
        Book book = new Book();
        String bookname = request.getParameter("bookname");
        int bookprice = Integer.parseInt(request.getParameter("bookprice"));
        book.setBookname(bookname);
        book.setBookprice(bookprice);
        bookService.addBook(book);
        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }
}

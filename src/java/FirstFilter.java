import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by lisa on 2016/9/12.
 */

public class FirstFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init FirstFilter.........................."+filterConfig.toString());

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("start doFilter FirstFilter....................." + servletRequest.toString() + "|||||||||" + servletResponse.toString());
//        filterChain.doFilter(servletRequest, servletResponse);
//        HttpServletRequest req=(HttpServletRequest)servletRequest;
//        HttpServletResponse response2 =(HttpServletResponse) servletResponse;

//        response2.sendRedirect(req.getContextPath()+"/main.jsp");
//        req.getRequestDispatcher("main.jsp").forward(servletRequest, servletResponse);
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println(" end  DoFilter FirstFilter....................."+servletRequest.toString()+"|||||||||"+servletResponse.toString());
    }

    @Override
    public void destroy() {

        System.out.println("destroy FirstFilter.................");
    }
}

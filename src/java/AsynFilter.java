import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by lisa on 2016/9/13.
 */

@WebFilter(filterName ="AsynFilter",value = {"/servlet/AsynServlet"},dispatcherTypes = {DispatcherType.REQUEST,DispatcherType.ASYNC},asyncSupported=true)
public class AsynFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init AsynFilter.........................."+filterConfig.toString());
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("start doFilter AsynFilter.....................");

        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("end doFilter AsynFilter.....................");
    }

    @Override
    public void destroy() {
        System.out.println("destroy AsynFilter.................");

    }
}

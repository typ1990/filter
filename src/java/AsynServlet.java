
import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * Created by lisa on 2016/9/13.
 */

@WebServlet(name = "AsynServlet",asyncSupported = true,urlPatterns = "/servlet/AsynServlet")
public class AsynServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AsyncContext asyncContext=req.getAsyncContext();
        System.out.println("servlet ********************"+new Date());
        new Thread(new Excutor(asyncContext)).start();
        System.out.println("servlet ********************" + new Date());


    }

    public class Excutor implements Runnable{
        private AsyncContext asyncContext;

        public Excutor(AsyncContext asyncContext) {
            this.asyncContext = asyncContext;
        }

        @Override
        public void run() {

            System.out.println("Thread ********************"+new Date());
            try {

//                asyncContext.getRequest();
//                asyncContext.getResponse();
                Thread.sleep(10000L);
                System.out.println("Thread ********************"+new Date());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


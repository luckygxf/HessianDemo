package main.java.com.gxf.client;

import com.caucho.hessian.client.HessianProxyFactory;
import com.gxf.model.User;
import com.gxf.service.IService;

import java.net.MalformedURLException;

/**
 * Created by 58 on 2018/1/8.
 */
public class Test {

    /**
     * 测试
     * */
    public static void main(String[] args) throws MalformedURLException {
        String url = "http://localhost:8080/server-1.0-SNAPSHOT/ServiceServlet";
        HessianProxyFactory factory = new HessianProxyFactory();
        IService service = (IService) factory.create(IService.class, url);
        User user = service.getUser();
        System.out.println("user: " + user);
    }
}

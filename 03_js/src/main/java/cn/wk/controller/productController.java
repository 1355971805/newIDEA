package cn.wk.controller;

import cn.wk.entity.product;
import cn.wk.entity.takeout;
import cn.wk.service.IProductServcie;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * Created by 王 on 2017/8/28.
 */
@Controller
public class productController {
    @Resource(name = "productService")
    private IProductServcie servcie;


    @RequestMapping("/getAll")
    public String getAll(HttpServletRequest request){
        List<product> list = servcie.getAll();
        request.setAttribute("list",list);
        return "/product.jsp";
    }

    @RequestMapping(value = "/adds",method = RequestMethod.POST)
    public String addtae(takeout take){
        take.setQuantity(take.getQuantity());
        take.setOutdate(new Date());
        take.setHandler(take.getHandler());
        take.setProductid(take.getProductid());
        int i = servcie.add(take);
        if (i>0) {
            return "/updateAll";
        }else {
            System.out.println("////////////////////");
            return "/index.jsp";
        }
    }

    @RequestMapping("/updateAll")
    public String updateAll(int productid,int quantity){
        product product=new product();
        product.setId(productid);
        product.setQuantity(quantity);
        int i = servcie.updateAll(product);
        System.out.println(i);
       if (i>0) {
           return "/getAll";
       }else {
           System.out.println("++++++++++++++++++++++");
           return "/index.jsp";
       }
    }
}

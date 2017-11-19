package cn.wk.controller;

import cn.wk.entity.Houseinfo;
import cn.wk.entity.Housetype;
import cn.wk.entity.category;
import cn.wk.service.IHouseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
public class HouseControoler {
    @Resource(name = "houseservice")
    IHouseService service;

    @RequestMapping("/dolist")
    public String dolist(HttpSession session) {
        List<Houseinfo> houselist = service.houselist();
        session.setAttribute("houselist",houselist);
        return "/house.jsp";
    }

    @RequestMapping("/typelist")
    public String typelist(HttpSession session){
        List<Housetype> typelist = service.typelist();
        session.setAttribute("typelist",typelist);
        return "/house1.jsp";
    }

    @RequestMapping("/add")
    public String add(Houseinfo info){
         info.setTypeid(info.getTypeid());
         info.setHousedesc(info.getHousedesc());
        info.setPublishdate(new Date());
        info.setMonthlyrent(info.getMonthlyrent());
        int inser = service.inser(info);
        if (inser>0){
            return "/dolist";
        }
        return "/house1.jsp";
    }

    @RequestMapping("/info/{id}")
    public String info(@PathVariable int id, HttpSession session){
        List<Houseinfo> infolist = service.infolist(id);
        session.setAttribute("houselist",infolist);
        return "/house2.jsp";
    }

    @RequestMapping("/dolists")
    public String dolists(HttpSession session,String housedesc){

        List<Houseinfo> houselist = service.infolists(housedesc);
        session.setAttribute("houselist",houselist);
        session.setAttribute("housedesc",housedesc);
        return "/house.jsp";
    }


    @ResponseBody
    @RequestMapping("/one")
    public Object one(){
        List<category> list=service.one();

        return list;
    }

}

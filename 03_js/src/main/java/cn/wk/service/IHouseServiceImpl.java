package cn.wk.service;

import cn.wk.dao.IHouseDAO;
import cn.wk.entity.Houseinfo;
import cn.wk.entity.Housetype;
import cn.wk.entity.category;
import cn.wk.service.IHouseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("houseservice")
public class IHouseServiceImpl implements IHouseService {
@Resource(name = "IHouseDAO")

    IHouseDAO dao;


    public List<Houseinfo> houselist() {
        return dao.houselist();
    }

    public List<Housetype> typelist() {
        return dao.typelist();
    }

    public int inser(Houseinfo houseinfo) {
        return dao.inser(houseinfo);
    }

    public List<Houseinfo> infolist(int id) {
        return dao.infolist(id);
    }

    public List<Houseinfo> infolists(String housedesc) {
        return dao.infolists(housedesc);
    }

    public List<category> one() {
        return dao.one();
    }

    public IHouseDAO getDao() {
        return dao;
    }

    public void setDao(IHouseDAO dao) {
        this.dao = dao;
    }

}

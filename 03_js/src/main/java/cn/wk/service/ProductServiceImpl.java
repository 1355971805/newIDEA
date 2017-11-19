package cn.wk.service;

import cn.wk.dao.IProductDao;
import cn.wk.entity.product;
import cn.wk.entity.takeout;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 王 on 2017/8/28.
 */
@Service("productService")
public class ProductServiceImpl implements IProductServcie {

    @Resource(name = "IProductDao")
    private IProductDao dao;

    public IProductDao getDao() {
        return dao;
    }

    public void setDao(IProductDao dao) {
        this.dao = dao;
    }

    public List<product> getAll() {
        return dao.getAll();
    }

    public int updateAll(product product) {
        return dao.updateAll(product);
    }

    public int add(takeout take) {
        return dao.add(take);
    }
}

package cn.wk.service;

import cn.wk.entity.product;
import cn.wk.entity.takeout;

import java.util.List;

/**
 * Created by 王 on 2017/8/28.
 */
public interface IProductServcie {
    public List<product>getAll();
    public int updateAll(product product);
    public int add(takeout take);
}

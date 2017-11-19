package cn.wk.dao;

import cn.wk.entity.product;
import cn.wk.entity.takeout;

import java.util.List;

/**
 * Created by 王 on 2017/8/28.
 */
public interface IProductDao {
 public List<product>getAll();
 public int add(takeout take);

 public int updateAll(product product);
}

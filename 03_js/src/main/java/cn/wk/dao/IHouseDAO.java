package cn.wk.dao;

import cn.wk.entity.Houseinfo;
import cn.wk.entity.Housetype;
import cn.wk.entity.category;

import java.util.List;


public interface IHouseDAO {
    public List<Houseinfo> houselist();
    public List<Housetype>typelist();

    public int inser(Houseinfo houseinfo);
    public List<Houseinfo>infolist(int id);
    public List<Houseinfo>infolists(String housedesc);
    public List<category> one();

}

package cn.happy.Springtx.cn.happy.service;


import cn.happy.Springtx.cn.happy.entity.Account;
import cn.happy.Springtx.cn.happy.entity.Stock;
import cn.happy.Springtx.cn.happy.entity.StockException;

/**
 * Created by Happy on 2017-08-04.
 */
public interface IAccountService {
    //开户的方法
    public boolean addAccount(Account account);
    //股票初始化的方法
    public boolean addStock(Stock account);
    //購買股票的方法

    /**
     * @param sid  股票代號
     * @param count  購買股數
     * @param aid    賬戶代號
     * @param money  賬戶支出金額
     */
    public void buyStock(int sid, int count, int aid, double money) throws StockException;

}

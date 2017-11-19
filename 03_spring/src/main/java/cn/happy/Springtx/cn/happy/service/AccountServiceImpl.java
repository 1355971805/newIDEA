package cn.happy.Springtx.cn.happy.service;


import cn.happy.Springtx.cn.happy.dao.IAccountDAO;
import cn.happy.Springtx.cn.happy.dao.IStockDAO;
import cn.happy.Springtx.cn.happy.entity.Account;
import cn.happy.Springtx.cn.happy.entity.Stock;
import cn.happy.Springtx.cn.happy.entity.StockException;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Happy on 2017-08-04.
 */
@Transactional(rollbackFor = StockException.class)
public class AccountServiceImpl implements IAccountService {

    //植入AccountDao對象
    private IAccountDAO accountDAO;
    //植入StockDAO對象
    private IStockDAO stockDAO;

    public boolean addAccount(Account account) {
        return false;
    }

    public boolean addStock(Stock account) {
        return false;
    }

    //
    public void buyStock(int sid, int count, int aid, double money) throws StockException {
        //默认是购买股票
        boolean isBuy=true;

         //01.賬戶
         accountDAO.updateAccount(aid,money,isBuy);
            //编译时异常  SPring处理 方式
            //编译时 SPring事务自动提交
            //运行时   SPring 自动回滚
           if(1==1) {
               throw new StockException();
           }
        //02.股票表
        stockDAO.updateStock(sid,count,isBuy);
    }

    public IAccountDAO getAccountDAO() {
        return accountDAO;
    }

    public void setAccountDAO(IAccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    public IStockDAO getStockDAO() {
        return stockDAO;
    }

    public void setStockDAO(IStockDAO stockDAO) {
        this.stockDAO = stockDAO;
    }
}

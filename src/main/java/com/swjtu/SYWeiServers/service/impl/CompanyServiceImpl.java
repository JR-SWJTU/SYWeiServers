package com.swjtu.SYWeiServers.service.impl;

import com.swjtu.SYWeiServers.entity.Company;
import com.swjtu.SYWeiServers.entity.CompanyExample;
import com.swjtu.SYWeiServers.mapper.CompanyMapper;
import com.swjtu.SYWeiServers.service.CompanyService;
import com.swjtu.SYWeiServers.util.MainDataSourceFactory;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/3/19.
 */
@Service
public class CompanyServiceImpl implements CompanyService {

    private static SqlSession sqlSession = null;

    /**
     * 根据公司id从数据库获取一个公司信息
     *
     * @param companyId
     * @return
     */
    public Company loadCompany(String companyId) {
        Company company = null;
        try{
            //获取主数据库连接
            sqlSession = MainDataSourceFactory.sqlSessionFactory.openSession();
            //获取操作Company表的dao
            CompanyMapper companyMapper =  sqlSession.getMapper(CompanyMapper.class);
            //创建查询条件对象
            CompanyExample companyExample = new CompanyExample();
            companyExample.createCriteria().andCompanyidEqualTo(companyId);
            //调用dao中方法进行数据查询
            company = companyMapper.selectByExample(companyExample).get(0);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            //关闭主数据库连接，防止连接过多造成内存溢出
            if(sqlSession != null)
                sqlSession.close();
        }
        return company;
    }

    /**
     * 创建数据库
     *
     * @param dbName
     */
    public void createDataBase(String dbName) {

    }
}

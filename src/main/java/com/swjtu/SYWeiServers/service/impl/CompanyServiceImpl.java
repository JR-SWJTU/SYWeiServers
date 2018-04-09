package com.swjtu.SYWeiServers.service.impl;

import com.swjtu.SYWeiServers.entity.Company;
import com.swjtu.SYWeiServers.entity.CompanyExample;
import com.swjtu.SYWeiServers.mapper.CompanyMapper;
import com.swjtu.SYWeiServers.mapper.CompanyMapperCustom;
import com.swjtu.SYWeiServers.service.CompanyService;
import com.swjtu.SYWeiServers.util.MainDataSourceFactory;
import com.swjtu.SYWeiServers.util.ToolHelper;
import com.swjtu.SYWeiServers.web.exception.CustomException;
import org.apache.commons.collections.CollectionUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/3/19.
 */
@Service
public class CompanyServiceImpl implements CompanyService {

    private static SqlSession sqlSession = null;

    @Override
    public boolean addCompany(Company company) throws Exception {
        if(company.getDbname() == null || company.getDbname().equals("")) {
            throw  new CustomException("数据库名为空");
        }

        if(findCompanyByDbName(company.getDbname()) != null){
            throw new CustomException("数据库名称已经存在");
        }

        if(findCompany(company.getCompanyno()) != null) {
            throw new CustomException("账号已经存在");
        }

        CompanyMapper companyMapper;
        try{
            //获取主数据库连接
            sqlSession = MainDataSourceFactory.sqlSessionFactory.openSession();
            //获取操作Company表的dao
            companyMapper =  sqlSession.getMapper(CompanyMapper.class);
            company.setCompanyid(ToolHelper.autoID());
            return companyMapper.insert(company) == 1;
        }
        catch(Exception e){
            throw new Exception();
        }
        finally{
            sqlSession.commit();
            //关闭主数据库连接，防止连接过多造成内存溢出
            if(sqlSession != null)
                sqlSession.close();
        }
    }

    @Override
    public Company login(Company company) throws CustomException {
        Company company1 = findCompany(company.getCompanyno());

        if(company1 == null) {
            throw new CustomException("账号不存在");
        }

        if(!company1.getPassword().equals(company.getPassword())) {
            throw new CustomException("密码不正确");
        }

        return company1;
    }

    @Override
    public List<Company> findCompanyByCompanyNo(List<String> companyNos) throws Exception {
        CompanyMapperCustom companyMapperCustom;
        try{
            //获取主数据库连接
            sqlSession = MainDataSourceFactory.sqlSessionFactory.openSession();
            //获取操作Company表的dao
            companyMapperCustom =  sqlSession.getMapper(CompanyMapperCustom.class);

            List<Company> companies = companyMapperCustom.findCompanyByCompanyNo(companyNos);
            if(CollectionUtils.isEmpty(companies)) {
                return new ArrayList<Company>();
            }
            return  companies;
        }
        catch(Exception e){
            throw new Exception();
        }
        finally{
            //关闭主数据库连接，防止连接过多造成内存溢出
            if(sqlSession != null)
                sqlSession.close();
        }
    }

    @Override
    public Company findCompany(String companyNo) {
        Company company = null;
        try{
            //获取主数据库连接
            sqlSession = MainDataSourceFactory.sqlSessionFactory.openSession();
            //获取操作Company表的dao
            CompanyMapper companyMapper =  sqlSession.getMapper(CompanyMapper.class);
            //创建查询条件对象
            CompanyExample companyExample = new CompanyExample();
            companyExample.createCriteria().andCompanynoEqualTo(companyNo);
            //调用dao中方法进行数据查询
            List<Company> companies = companyMapper.selectByExampleWithBLOBs(companyExample);
            if( companies != null && companies.size() != 0) {
                company = companies.get(0);
            }
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

    @Override
    public Company findCompanyByDbName(String dbName) {
        Company company = null;
        try{
            //获取主数据库连接
            sqlSession = MainDataSourceFactory.sqlSessionFactory.openSession();
            //获取操作Company表的dao
            CompanyMapper companyMapper =  sqlSession.getMapper(CompanyMapper.class);
            //创建查询条件对象
            CompanyExample companyExample = new CompanyExample();
            companyExample.createCriteria().andDbnameEqualTo(dbName);
            //调用dao中方法进行数据查询
            List<Company> companies = companyMapper.selectByExampleWithBLOBs(companyExample);
            if( companies != null && companies.size() != 0) {
                company = companies.get(0);
            }
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

    public List<Company> getCompanyForPage(Integer pageNum, Integer pageSize) throws Exception {
        if(pageNum == null || pageSize == null)
            throw  new CustomException("参数缺失");
        CompanyMapper companyMapper;
        try{
            //获取主数据库连接
            sqlSession = MainDataSourceFactory.sqlSessionFactory.openSession();
            //获取操作Company表的dao
            companyMapper =  sqlSession.getMapper(CompanyMapper.class);

            List<Company> companies = companyMapper.selectForPage( (pageNum - 1) * pageSize, pageSize);
            return companies;
        }
        catch(Exception e){
            e.printStackTrace();
            throw new Exception();
        }
        finally{
            //关闭主数据库连接，防止连接过多造成内存溢出
            if(sqlSession != null)
                sqlSession.close();
        }
    }

    @Override
    public boolean deleteCompany(List<String> companyIds) throws Exception {
        CompanyMapper companyMapper;
        try{
            //获取主数据库连接
            sqlSession = MainDataSourceFactory.sqlSessionFactory.openSession();
            //获取操作Company表的dao
            companyMapper =  sqlSession.getMapper(CompanyMapper.class);

            //创建查询条件对象
            CompanyExample companyExample = new CompanyExample();
            companyExample.createCriteria().andCompanyidIn(companyIds);

            return companyMapper.deleteByExample(companyExample) != 0;
        }
        catch(Exception e){
            throw new Exception();
        }
        finally{
            sqlSession.commit();
            //关闭主数据库连接，防止连接过多造成内存溢出
            if(sqlSession != null)
                sqlSession.close();
        }
    }

    @Override
    public boolean updateCompany(Company company) throws Exception {
        CompanyMapper companyMapper;
        try{
            //获取主数据库连接
            sqlSession = MainDataSourceFactory.sqlSessionFactory.openSession();
            //获取操作Company表的dao
            companyMapper =  sqlSession.getMapper(CompanyMapper.class);

            //创建查询条件对象
            CompanyExample companyExample = new CompanyExample();
            companyExample.createCriteria().andCompanyidEqualTo(company.getCompanyid());

            company.setCompanyid(null);
            company.setCompanyno(null);
            return companyMapper.updateByExampleSelective(company, companyExample) != 0;
        }
        catch(Exception e){
            throw new Exception();
        }
        finally{
            sqlSession.commit();
            //关闭主数据库连接，防止连接过多造成内存溢出
            if(sqlSession != null)
                sqlSession.close();
        }
    }

    @Override
    public Integer getCommanyNumber() throws Exception {
        CompanyMapperCustom companyMapperCustom;
        try{
            //获取主数据库连接
            sqlSession = MainDataSourceFactory.sqlSessionFactory.openSession();
            //获取操作Company表的dao
            companyMapperCustom =  sqlSession.getMapper(CompanyMapperCustom.class);

            //创建查询
            Integer number = companyMapperCustom.getCompanyNumber();

            return number;
        }
        catch(Exception e){
            throw new Exception();
        }
        finally{
            sqlSession.commit();
            //关闭主数据库连接，防止连接过多造成内存溢出
            if(sqlSession != null)
                sqlSession.close();
        }
    }
}

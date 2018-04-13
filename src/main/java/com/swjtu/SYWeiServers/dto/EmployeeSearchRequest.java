package com.swjtu.SYWeiServers.dto;

/**
 * Created by Administrator on 2018/4/12.
 */
public class EmployeeSearchRequest {

    private String sex;

    private String status;

    private String empname;

    private String tel;

    private String empno;

    public String getEmpno() { return empno; }

    public void setEmpno(String empno) { this.empno = empno; }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

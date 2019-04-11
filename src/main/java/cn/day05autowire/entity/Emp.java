package cn.day05autowire.entity;

public class Emp {  // 员工类
    private Integer empno;
    private String empname;
    private Dept dept;

    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno +
                ", empname='" + empname + '\'' +
                ", dept=" + dept +
                '}';
    }

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

}

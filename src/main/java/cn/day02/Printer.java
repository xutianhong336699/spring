package cn.day02;

public class Printer {
    private Ink ink;
    private Paper paper;

    public void print(){
        System.out.println("我在用惠普的"+ink.getColor()+"打印机打印"+paper.getSize());
    }

    public Ink getInk() {
        return ink;
    }

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }
}

package Task8.ContractConversion;

import java.util.Date;

public class Act {
    private int number;
    private Date date;
    private String[] list;

    public Act(int number, Date date, String[] list) {
        this.number = number;
        this.date = date;
        this.list = list;
    }
    public static Act contractToAct(Contract contract) {
        return new Act(contract.getNumber(), contract.getDate(), contract.getProductList());
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String[] getList() {
        System.out.println();
        return list;
    }

    public void setList(String[] list) {
        this.list = list;
    }
}

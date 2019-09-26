package Task8.ContractConversion;

import java.util.Date;

public class Contract {
   private int number;
   private Date date;
    private String[] productList;

    public Contract(int number, Date date, String[] productList) {
        this.number = number;
        this.date = date;
        this.productList = productList;
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

    public String[] getProductList() {
        return productList;
    }

    public void setProductList(String[] productList) {
        this.productList = productList;
    }
}

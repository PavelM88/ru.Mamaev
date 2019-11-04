package task8.ContractConversion;

import java.util.Arrays;
import java.util.Date;

public class Conversion {
    public static void main(String[] args) {
        Contract contract = new Contract(123, new Date(), new String[]{"товар1", "товар2"});
        Act act = Act.contractToAct(contract);
        System.out.println(act.getNumber() + " " + act.getDate() + " " + Arrays.toString(act.getList()));
    }
}

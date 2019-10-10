package Task14;

import Task7.DrinkList;
import org.apache.log4j.Logger;

import java.util.Scanner;

  class VendingMachine1 extends MachineLogic {
    private final static Logger logger = Logger.getLogger(VendingMachine1.class);
    public static void main(String[] args) {
        listMenu();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Внесите сумму для выбора напитка:");
        int enterAmount = scanner.nextInt();
        logger.trace("средства на счете" + enterAmount);
        if (enterAmount > 0) {
            selectionMenu(enterAmount);
        } else {
            System.out.println("Вы не внесли деньги");
            logger.error("Нет денег на счете");
            return;
        }
        try {
            actionMenu(scanner, enterAmount);

        } catch (Exception ex) {
            logger.debug("Вы ввели букву вместо цифры");
        }
    }

}


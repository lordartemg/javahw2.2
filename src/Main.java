//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int currentBalance = 250;
        int topUpAmount = 1400;

        int bonus = 0;

        if (topUpAmount > 1000) {
            bonus = topUpAmount /100;
        } else bonus = 0;

        int totalBalance = currentBalance + topUpAmount + bonus;

        System.out.println("Начальная сумма: " + currentBalance + " руб.");
        System.out.println("Сумма пополнения: " + topUpAmount + " руб.");
        System.out.println("Бонус: " + bonus + " руб.");
        System.out.println("Итоговая сумма на счету: " + totalBalance + " руб.");
    }
}
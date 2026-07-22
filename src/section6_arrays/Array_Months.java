package section6_arrays;
/*нужно сделать так, чтобы у нас в консоли были не просто названия месяцев, но при этом после
каждого названия месяца выводилась запятая и пробел, а после последнего месяца выводилась точка.*/
public class Array_Months {
    static void main() {
        String[] nameOfMonths = new String[12];
        nameOfMonths[0] = "January";
        nameOfMonths[1] = "February";
        nameOfMonths[2] = "March";
        nameOfMonths[3] = "April";
        nameOfMonths[4] = "May";
        nameOfMonths[5] = "June";
        nameOfMonths[6] = "July";
        nameOfMonths[7] = "August";
        nameOfMonths[8] = "September";
        nameOfMonths[9] = "October";
        nameOfMonths[10] = "November";
        nameOfMonths[11] = "December";
        for (int i = 0; i < nameOfMonths.length; i++) {
            System.out.print(nameOfMonths[i]);
            if (i < nameOfMonths.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println(".");
            }
        }
        System.out.println(nameOfMonths[11] + ".");
    }
}

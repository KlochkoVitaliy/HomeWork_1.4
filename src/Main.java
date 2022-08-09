public class Main {
    public static void main(String[] args) {

// Задание 1

        int i=1;
        while (i<11){
            System.out.print(i + " ");
            i++;
        }
        System.out.println("");
        for( int a = 10; a >0;a--) {
            System.out.print(a + " ");
        }
        System.out.println("");
// Задание 2

        int firstFriday= 5;
        int daysInMonth = 31;
        int daysInWeeks = 7;
        while (firstFriday <= daysInMonth) {
            System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчёт.");
            firstFriday += daysInWeeks;
        }

// Задание 3
        int year = 0;
         int yearBefore = 1822;
         int yearAfter = 2122;
         for  (i =yearBefore; i<=yearAfter; i++ ) {
             if (i % 79 == 0) {
                 System.out.println(i);
             }
         }
    }
}
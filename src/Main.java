//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Задание1
        int age = 10;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }


//        Задание2
        int temp = 4;
        if (temp < 5) {
            System.out.println("На улице холодно, нужно надеть шапку.");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки.");
        }

//        Задание3
        int speed = 100;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        }

//        Задание4
        int humanAge = 25;
        if (humanAge >= 2 && humanAge <= 6) {
            System.out.println("Если возраст человека равен " + humanAge + " лет, то ему нужно ходить в детский сад.");
        }
        if (humanAge >= 7 && humanAge <= 17) {
            System.out.println("Если возраст человека равен " + humanAge + " лет, то ему нужно ходить в школу.");
        }
        if (humanAge >= 18 && humanAge <= 24) {
            System.out.println("Если возраст человека равен " + humanAge + " лет, то ему нужно ходить в университет.");
        }
        if (humanAge > 24) {
            System.out.println("Если возраст человека равен " + humanAge + " лет, то ему нужно ходить на работу.");
        }


//        Задание5
        int childAge = 15;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + " , то ему нельзя кататься на аттракционе.");
        }
        if (childAge >= 5 && childAge < 14) {
            System.out.println("Если возраст ребенка равен " + childAge + " лет, то ему можно кататься на аттракционе в сопровождении взрослого.");
        }
        if (childAge >= 14) {
            System.out.println("Если возраст ребенка равен " + childAge + " лет, то ему можно кататься на аттракционе без сопровождения взрослого.");
        }

//        Задание6
        int coachSeat = 106;
        if (coachSeat >= 0 && coachSeat <= 60) {
            System.out.println("В вагоне есть сидячее место.");
        } else {
            if (coachSeat > 60 && coachSeat <= 102) {
                System.out.println("В вагоне есть стоячее место.");
            } else {
                System.out.println("В вагоне нет места.");
            }
        }

//        Задание7
        int one = 58;
        int two = 39;
        int three = 25;
        if (one > two && one > three) {
            System.out.println(one);
        } else {
            if (two > one && two > three) {
                System.out.println(two);
            } else {
                if (three > one && three > two) {
                    System.out.println(three);
                }
            }
        }


    }
}

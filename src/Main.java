public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        int age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " лет, то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " лет, он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println("Задача 2");

        int temperature = 4;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        System.out.println("Задача 3");

        int speed = 155;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придётся заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        }

        System.out.println("Задача 4");

        int peopleAge = 24;
        if (peopleAge >= 2 && peopleAge <= 6) {
            System.out.println("Если возраст человека равен " + peopleAge + ", то ему нужно ходить в детский сад");
        } else if (peopleAge >= 7 && peopleAge <= 17) {
            System.out.println("Если возраст человека равен " + peopleAge + ", то ему нужно ходить в школу");
        } else if (peopleAge >= 18 && peopleAge <= 24) {
            System.out.println("Если возраст человека равен " + peopleAge + ", то ему нужно ходить в университет");
        } else if (peopleAge > 24) {
            System.out.println("Если возраст человека равен " + peopleAge + ", то ему нужно ходить на работу");
        }

        System.out.println("Задача 5");

        int childAge = 6;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе");
        } else if (childAge >= 5 && childAge < 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else if (childAge >= 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        System.out.println("Задача 6");

        int carriageCapacity = 102;
        int seatPlace = 60;
        int occupiedSeatInTheCarriage = 55;
        if (occupiedSeatInTheCarriage < carriageCapacity && occupiedSeatInTheCarriage < seatPlace) {
            System.out.println("Есть сидячее место в вагоне");
        } else if (occupiedSeatInTheCarriage < carriageCapacity && occupiedSeatInTheCarriage > seatPlace) {
            System.out.println("Есть стоячее место в вагоне");
        } else {
            System.out.println("Вагон полностью забит");
        }

        System.out.println("Задача 7");

        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Самое большое число " + one);
        } else if (two > one && two > three) {
            System.out.println("Самое большое число " + two);
        } else {
            System.out.println("Самое большое число " + three);
        }


    }
}
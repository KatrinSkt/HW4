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
        int standPlace = carriageCapacity - seatPlace;
        int occupiedSeatPlaces = 55;
        int occupiedStandPlaces = 32;
        int freeSeatPlaces = seatPlace - occupiedSeatPlaces;
        int freeStandPlaces = standPlace - occupiedStandPlaces;

        if (freeSeatPlaces <= 0 && freeStandPlaces <= 0) {
            System.out.println("Вагон полностью забит");
        } else {
            if (freeSeatPlaces > 0) {
                System.out.println("В вагоне есть сидячие места в количестве " + freeSeatPlaces + " мест");
            }
            if (freeStandPlaces > 0) {
                System.out.println("В вагоне есть стоячие места в количестве " + freeStandPlaces + " мест");
            }
        }
        System.out.println("Задача 7");

        int one = 1;
        int two = 2;
        int three = 3;
        int max;
        if (one >= two ) {
            max = one;
        } else {
            max = two;
        }
        if (three >= max) {
           max = three;
        }
        System.out.println("Максимальное из 3х чисел: " + max);



    }
}
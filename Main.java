public class Main {
    public static void main(String[] args) {

//        System.out.println(1 + " - № завдання" + "\n");
//        int n = 50;
//        if (n <= 50) {
//            System.out.println("Число " + n + " не міститься на проміжку (50:100)");
//        } else if (n >= 100) {
//            System.out.println("Число " + n + " не міститься на проміжку (50:100)");
//        } else {
//            System.out.println("Число " + n + " є на проміжку (50:100)");
//        }

//        System.out.println(2 + " - № завдання" + "\n");
//        int n = 345;
//        int a = n / 100;
//        int b = n / 10 % 10;
//        int c = n % 10;
//        System.out.println(a+"\n"+b+"\n"+c);
//
//        if ((a > b) & (a > c)) {
//            System.out.println("перше число найбільше ");
//        }
//        else if((b > a) & (b > c)) {
//            System.out.println("друге число айбільше");
//        }
//        else if((c > a) & (c > b)) {
//            System.out.println("третє число найбільше");
//        }
//        else if((c == a) & (a == b)) {
//            System.out.println("всі рівні");
//        }

//        System.out.println(3 + " - № завдання" + "\n");
//        String up_down = "down";
//        int floor = 2;
//        if (up_down == "up") {
//            if (floor == 1) {
//                System.out.println("ви піднялися " + floor);
//            } else if (floor == 2) {
//                System.out.println("ви піднялися " + ++floor);
//            } else if (floor == 3) {
//                System.out.println("ви піднялися " + floor);
//            } else if (floor == 4) {
//                System.out.println("ви піднялися " + floor);
//            } else if (floor == 5) {
//                System.out.println("ви піднялися " + floor);
//            } else if (floor == 6) {
//                System.out.println("ви піднялися " + floor);
//            } else if (floor == 7) {
//                System.out.println("ви піднялися " + floor);
//            } else if (floor == 8) {
//                System.out.println("ви піднялися " + floor);
//            } else if (floor == 9) {
//                System.out.println("ви піднялися " + floor);
//            } else {
//                System.out.println("не існує " + floor);
//            }
//        } else if (up_down == "down") {
//            if (floor == 9) {
//                System.out.println("ви опустилися " + floor);
//            } else if (floor == 8) {
//                System.out.println("ви опустилися " + floor);
//            } else if (floor == 7) {
//                System.out.println("ви опустилися " + floor);
//            } else if (floor == 6) {
//                System.out.println("ви опустилися " + floor);
//            } else if (floor == 5) {
//                System.out.println("ви опустилися " + floor);
//            } else if (floor == 4) {
//                System.out.println("ви опустилися " + floor);
//            } else if (floor == 3) {
//                System.out.println("ви опустилися " + floor);
//            } else if (floor == 2) {
//                System.out.println("ви опустилися " + --floor);
//            } else if (floor == 1) {
//                System.out.println("ви опустилися " + floor);
//            } else if (floor < 1) {
//                System.out.println("не існує" + floor);
//            }
//        }

//        System.out.println(4 + " - № завдання" +  "\n");
//        String yes_no ="Kkdlbn";
//        switch (yes_no) {
//            case "+":
//                System.out.println("Я погоджуюся");
//                break;
//            case "OK":
//                System.out.println("Я погоджуюся");
//                break;
//            case "ok":
//                System.out.println("Я погоджуюся");
//                break;
//            case "Yes":
//                System.out.println("Я погоджуюся");
//                break;
//            case "YES":
//                System.out.println("Я погоджуюся");
//                break;
//            case "-":
//                System.out.println("Я не погоджуюся");
//                break;
//            case "NO":
//                System.out.println("Я не погоджуюся");
//                break;
//            case "No":
//                System.out.println("Я не погоджуюся");
//                break;
//            case "N":
//                System.out.println("Я не погоджуюся");
//                break;
//            case "n":
//                System.out.println("Я не погоджуюся");
//                break;
//            default:
//                System.out.println("errooor");
//                break;
//        }

//        System.out.println(5 + " - № завдання" + "\n");
//        int a = -3;
//        int b = 1;
//        int c = -9;
//        int min = Math.min(Math.min(a,b),Math.min(b,c));
//        int max = Math.max(Math.max(a,b),Math.max(b,c));
//        int mid ;
//        if (a > min && a < max){
//            mid = a;
//        } else if (b > min && b <max) {
//            mid = b;
//        }else {
//            mid = c;
//        }
//        System.out.println("min = "+ min + "; mid = "+ mid+ "; max = "+max+";");


//        System.out.println(6 + " - № завдання" + "\n");
//        short time_sec = 2;
//        if ((28800 <= time_sec) | (time_sec >= 27000)) {
//            System.out.println("До кінця робочого дня залишилось 7год.30 хв.");
//        } else if ((27000 <= time_sec) | (time_sec >= 25200)) {
//            System.out.println("До кінця робочого дня залишилось 7год.");
//        } else if ((25200 <= time_sec) | (time_sec >= 23400)) {
//            System.out.println("До кінця робочого дня залишилось 6год.30 хв.");
//        } else if ((23400 <= time_sec) | (time_sec >= 21600)) {
//            System.out.println("До кінця робочого дня залишилось 6год");
//        } else if ((21600 <= time_sec) | (time_sec >= 19800)) {
//            System.out.println("До кінця робочого дня залишилось 5год.30 хв.");
//        } else if ((19800 <= time_sec) | (time_sec >= 18000)) {
//            System.out.println("До кінця робочого дня залишилось 5год.");
//        } else if ((18000 <= time_sec) | (time_sec >= 16200)) {
//            System.out.println("До кінця робочого дня залишилось 4год.30 хв.");
//        } else if ((16200 <= time_sec) | (time_sec >= 14400)) {
//            System.out.println("До кінця робочого дня залишилось 4год.");
//        } else if ((14400 <= time_sec) | (time_sec >= 12600)) {
//            System.out.println("До кінця робочого дня залишилось 3год.30 хв.");
//        } else if ((12600 <= time_sec) | (time_sec >= 10800)) {
//            System.out.println("До кінця робочого дня залишилось 3год");
//        } else if ((10800 <= time_sec) | (time_sec >= 9000)) {
//            System.out.println("До кінця робочого дня залишилось 2год.30 хв.");
//        } else if ((9000 <= time_sec) | (time_sec >= 7200)) {
//            System.out.println("До кінця робочого дня залишилось 2год.");
//        } else if ((7200 <= time_sec) | (time_sec >= 5400)) {
//            System.out.println("До кінця робочого дня залишилось 1год.30 хв.");
//        } else if ((5400 <= time_sec) | (time_sec >= 3600)) {
//            System.out.println("До кінця робочого дня залишилось 1год.");
//        } else if ((3600 <= time_sec) | (time_sec >= 1800)) {
//            System.out.println("До кінця робочого дня залишилось 30 хв.");
//        } else if ((1800 <= time_sec) | (time_sec >= 0)) {
//            System.out.println("ЩЕ трішки , давай через неможу !!!");
//        } else if (time_sec > 28800) {
//            System.out.println("Ооооо ще довгоо");
//        } else if (time_sec < 0) {
//            System.out.println("Чоловіче заспокійся ти норму здав)");
//        }
    }
}


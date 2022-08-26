public class Main {
    public static void main(String[] args) {

       // Задача 1
        System.out.println("Задача №1");
        byte a = 124;
        System.out.println("Значение переменной a с типом byte равно " + a);
        short b = 3333;
        System.out.println("Значение переменной b с типом short равно " + b);
        int c = 25000;
        System.out.println("Значение переменной c с типом int равно " + c);
        long d = 1000000L;
        System.out.println("Значение переменной d с типом long равно " + d);
        float e = 1.006f;
        System.out.println("Значение переменной e с типом float равно " + e);
        double f = 23.12345678;
        System.out.println("Значение переменной f с типом double равно " + f);

        // Задача 2
        System.out.println("Задача №2");
        float first = 27.12f;
        long second = 987_678_965_549L;
        double thirst = 2.786;
        boolean fourth = false;
        short fifth = 569;
        int sixth = -159;
        int seventh = 27897;
        short eighth = 67;
        System.out.println("Задача решена. По условиям задачи решение не нужно выводить в консоль.");

        // Задача 3
        System.out.println("Задача №3");
        int ludmilaPetrovna = 23;
        int annaSergeevna = 27;
        int ekaterinaAndreevna = 30;
        int paperAll = 480;
        int paperForPupils = paperAll / (ludmilaPetrovna + annaSergeevna + ekaterinaAndreevna);
        System.out.println("На каждого ученика расчитано " + paperForPupils + " листов бумаги.");

        // Задача 4
        System.out.println("Задача №4");
        int productivityMinute = 16 / 2;
        int day = 24;
        int hour = 60;
        int mounth = 30;

        int timeOne = 20;
        int productivityOne = productivityMinute * timeOne;
        System.out.println("За " + timeOne + " минут машина произвела " + productivityOne + " штук.");

        int timeSecondInDays = 1;
        int timeSecond = timeSecondInDays * day * hour;
        int productivitySecond = productivityMinute * timeSecond;
        System.out.println("За " + timeSecondInDays + " сутки машина произвела " + productivitySecond + " штук.");

        int timeThirstInDays = 3;
        int timeThirst = timeThirstInDays * day * hour;
        int productivityThirst = timeThirst * productivityMinute;
        System.out.println("За " + timeThirstInDays + " дня машина произвела " + productivityThirst + " штук.");

        int timeFourthInMounth = 1;
        int timeFourth = timeFourthInMounth * mounth * day * hour;
        int productivityFourth = timeFourth * productivityMinute;
        System.out.println("За " + timeFourthInMounth + " месяц машина произвела " + productivityFourth + " штук.");

        // Задача №5
        System.out.println("Задача №5");
        int all = 120;
        int whiteOneClass = 2;
        int brownOneClass = 4;
        int whiteAndBrownOneClass = whiteOneClass + brownOneClass;
        int classAll = all / whiteAndBrownOneClass;
        int whiteAll = classAll * whiteOneClass;
        int brownAll = classAll * brownOneClass;
        System.out.println("В школе, где " + classAll + " классов, нужно " + whiteAll + " банок белой краски и " + brownAll + " банок коричневой краски.");

        // Задача №6
        System.out.println("Задача №6");
        int banana = 80;
        int milk = 105;
        int icecream = 100;
        int egg = 70;
        int cocktail = banana * 5 + milk * 2 + icecream * 2 + egg * 4;
        int grPerKg = 1000;
        float weighKg = cocktail / (float)grPerKg;
        System.out.println("Общий вес спорт-завтрака составляет " + weighKg + " кг.");

        // Задача №7
        System.out.println("Задача №7");
        int gramm = 1000;
        int weight = 7 * gramm;
        int min = 250;
        int max = 500;
        int weightMin = weight / min;
        int weightMax = weight / max;
        System.out.println("Если спортсмен будет терять по 250 грамм ежедневно, то уйдет " + (weight / min) + " дней на похудение.");
        System.out.println("Если спортсмен будет терять по 500 грамм ежедневно, то уйдет " + (weight / max) + " дней на похудение.");
        System.out.println("В среднем уйдет " + ((weightMin + weightMax) / 2) + " день на похудение.");

        // Задача №8
        System.out.println("Задача №8");
        int percent = 10;
        double multiplayer = percent / (100 * 1.0);
        int mashaSalary = 67_760;
        int denisSalary = 83_890;
        int christinaSalary = 76_230;

        int mashaNewSalary = (int) (mashaSalary + (mashaSalary * multiplayer));
        int denisNewSalary = (int) (denisSalary + (denisSalary * multiplayer));
        int christinaNewSalary = (int) (christinaSalary + (christinaSalary * multiplayer));

        int mashaDifference = (mashaNewSalary - mashaSalary) * 12;
        int denisDifference = (denisNewSalary - denisSalary) * 12;
        int christinaDifference = (christinaNewSalary - christinaSalary) * 12;

        System.out.println("Теперь зарплата Маши составляет " + mashaNewSalary + " рублей. Годовой доход вырос на " + mashaDifference + " рублей.");
        System.out.println("Теперь зарплата Дениса составляет " + denisNewSalary + " рублей. Годовой доход вырос на " + denisDifference + " рублей.");
        System.out.println("Теперь зарплата Кристины составляет " + christinaNewSalary + " рублей. Годовой доход вырос на " + christinaDifference + " рублей.");
    }
}
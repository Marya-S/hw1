package com.company;

public class Main {

    public static void main(String[] args) {
        byte a = 3;
        short b = 220;
        int c = 1150;
        long d = 2346L;

        float e = 2.6f;
        double f = 34.789008;

        char g = 'a';
        boolean h = true;

        float boxer1 = 78.2f;
        float boxer2 = 82.7f;

        System.out.println("******Задача № 2 *********");
        System.out.println("Общий вес боксеров: " + (boxer1 + boxer2));
        System.out.println("Разница в весе боксеров: " + (boxer2 - boxer1));

        int banana = 8;
        int milk = 105;
        int iceCream = 100;
        int egs = 70;

        float result = (float) (banana * 5 + milk * 2 + iceCream * 2 * 100 + egs * 4 * 70) / 1000;
        System.out.println("******Задача № 3 *********");
        System.out.println("Общий вес завтрака: " + result + " кг");

        int weight = 7;
        int lossOne = 250;
        int lossTwo = 500;
		float first = weight*1000/(float)lossOne;
		float second = weight*1000/(float)lossTwo;
		System.out.println("******Задача № 4 *********");
		System.out.println("Если терять по 250гр, то нужно " + first + " дней");
		System.out.println("Если терять по 500гр, то нужно " + second + " дней");
		System.out.println("В среднем для похудения нужно " + (first+second)/2 + " дней");

		int currentSalaryMasha = 67760;
		int currentSalaryDenis = 83690;
		int currentSalaryCristina = 76230;

		double newSalaryMasha = currentSalaryMasha + currentSalaryMasha * 0.1;
		double newSalaryDenis = currentSalaryDenis + currentSalaryDenis * 0.1;
		double newSalaryCristina = currentSalaryCristina + currentSalaryCristina * 0.1;

		System.out.println("******Задача № 5 *********");
		System.out.println("Маша теперь получает " + newSalaryMasha +" рублей. Годовой доход вырос на " + (newSalaryMasha*12 - currentSalaryMasha*12)  + " рублей");
		System.out.println("Денис теперь получает " + newSalaryDenis +" рублей. Годовой доход вырос на " + (newSalaryDenis*12 - currentSalaryDenis*12)  + " рублей");
		System.out.println("Кристина теперь получает " + newSalaryCristina +" рублей. Годовой доход вырос на " + (newSalaryCristina*12 - currentSalaryCristina*12)  + " рублей");

    }
}

public class Main {
    public static void main(String[] args) {

// Задание 1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
// Задание 2
        int СlientOS = 0;
        int СlientDeviceYear = 2017;
        if (СlientOS == 0 && СlientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (СlientOS == 0 && СlientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (СlientOS == 1 && СlientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (СlientOS == 1 && СlientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

// Задание 3
        int year = 2033;
        switch (year) {
            case 2024:
            case 2028:
            case 2032:
            case 2036:
            case 2040:
            case 2044:
            case 2048:
            case 2052:
            case 2056:
            case 2060:
            case 2064:
            case 2068:
            case 2072:
            case 2076:
            case 2080:
            case 2084:
            case 2088:
            case 2092:
            case 2096:
            case 2104:
                System.out.println(+year + " год является високосным»");
                break;
            case 2100:
                System.out.println(+year + " год не является високосным»");
                break;
            default:
                System.out.println(+year + " год не является високосным»");
        }

// Задание 4

        int deliveryDistance = 101;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней на доставку: 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней на доставку: 2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней на доставку: 3");
        } else {
            System.out.println("Мы не можем осуществить доставку");
        }

// Задание 5
        int monthNumber = 13;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("месяц принадлежит к сезону: Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("месяц принадлежит к сезону: Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("месяц принадлежит к сезону: Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("месяц принадлежит к сезону: Осень");
                break;
            default:
                System.out.println("Введено некорректное значение месяца");
        }

// Задание 6
        int age = 19;
        int salary = 58000;
        if (age >= 23 && salary < 50000) {
            System.out.println("Мы готовы выдать Вам кредитную карту с лимитом " + salary * 3 + " рублей");
        } else if (age < 23 && salary < 50000) {
            System.out.println("Мы готовы выдать Вам кредитную карту с лимитом " + salary * 2 + " рублей");
        } else if (age >= 23 && salary >= 50000 && salary < 80000) {
            System.out.println("Мы готовы выдать Вам кредитную карту с лимитом " + (salary * 3) * 1.2 + " рублей");
        } else if (age < 23 && salary >= 50000 && salary < 80000) {
            System.out.println("Мы готовы выдать Вам кредитную карту с лимитом " + (salary * 2) * 1.2 + " рублей");
        } else if (age >= 23 && salary >= 80000) {
            System.out.println("Мы готовы выдать Вам кредитную карту с лимитом " + (salary * 3) * 1.5 + " рублей");
        } else if (age < 23 && salary >= 80000) {
            System.out.println("Мы готовы выдать Вам кредитную карту с лимитом " + (salary * 2) * 1.5 + " рублей");}

// Задание 7
        int Age = 30;
        int Salary = 85000;
        int wantedSum = 600000;
        int BaseRate = 10;              // базовая ставка
        int RateForYang = 11;           // ставка для клиентов до 23 лет
        double RateForMidLife = 10.5;    // ставка для клиентов до 30 лет
        double RateForHighSalary = 9.3;  // ставка для клиентов c ЗП > 80 000 руб.
        int StandartPayYear = (wantedSum * BaseRate / 100) + wantedSum;
        int StandartPayMonth = StandartPayYear / 12; // стандартный ежемесячный платеж
        int PayYearForYang = (wantedSum * RateForYang / 100) + wantedSum;
        int PayMonthForYang = PayYearForYang / 12; // ежемесячный платеж для клиентов до 23 лет
        double PayYearForMidLife = (wantedSum * RateForMidLife / 100) + wantedSum;
        double PayMonthForMidLife = PayYearForMidLife / 12; // ежемесячный платеж для клиентов до 30 лет
        double PayYearForHighSalary = (wantedSum * RateForHighSalary / 100) + wantedSum;
        double PayMonthForHighSalary = PayYearForHighSalary / 12; // ежемесячный платеж для клиентов c ЗП > 80 000
        int MaxPayMonth = Salary / 2;
        if (Age < 23 && Salary < 80000 && PayMonthForYang < MaxPayMonth) {
           System.out.println("Максимальный платеж при ЗП " +Salary+ " равен " +MaxPayMonth+" рублей. Платеж по кредиту " +PayMonthForYang+ " рублей. Одобрено");
        } else if (Age < 23 && Salary < 80000 && PayMonthForYang > MaxPayMonth) {
          System.out.println("Максимальный платеж при ЗП " + Salary + " равен " + MaxPayMonth + " рублей. Платеж по кредиту " + PayMonthForYang + " рублей. Отказано");
        } else if (Age > 23 && Age < 30 && Salary < 80000 && PayMonthForMidLife < MaxPayMonth) {
          System.out.println("Максимальный платеж при ЗП " + Salary + " равен " + MaxPayMonth + " рублей. Платеж по кредиту " + PayMonthForMidLife + " рублей. Одобрено");
        } else if (Age > 23 && Age < 30 && Salary < 80000 && PayMonthForMidLife > MaxPayMonth) {
            System.out.println("Максимальный платеж при ЗП " + Salary + " равен " + MaxPayMonth + " рублей. Платеж по кредиту " + PayMonthForMidLife + " рублей. Отказано");
        } else if (Age >= 30 && Salary < 80000 && StandartPayMonth < MaxPayMonth) {
            System.out.println("Максимальный платеж при ЗП " + Salary + " равен " + MaxPayMonth + " рублей. Платеж по кредиту " + StandartPayMonth + " рублей. Одобрено");
        } else if (Age >= 30 && Salary < 80000 && StandartPayMonth > MaxPayMonth) {
            System.out.println("Максимальный платеж при ЗП " + Salary + " равен " + MaxPayMonth + " рублей. Платеж по кредиту " + StandartPayMonth + " рублей. Отказано");
        } else if (Salary > 80000 && StandartPayMonth < MaxPayMonth) {
            System.out.println("Максимальный платеж при ЗП " + Salary + " равен " + MaxPayMonth + " рублей. Платеж по кредиту " + PayMonthForHighSalary + " рублей. Одобрено");
        } else if (Salary > 80000 && StandartPayMonth > MaxPayMonth) {
            System.out.println("Максимальный платеж при ЗП " + Salary + " равен " + MaxPayMonth + " рублей. Платеж по кредиту " + PayMonthForHighSalary + " рублей. Отказано");
        }
       
   }
}


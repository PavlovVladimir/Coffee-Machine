package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static int water = 400;
    public static int milk = 540;
    public static int beans = 120;
    public static int cups = 9;
    public static int money = 550;
    public static Scanner scanner = new Scanner(System.in);
    public static String whatToDo = "";

    public static void main(String[] args) {

        while (!"exit".equals(whatToDo)) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            whatToDo = scanner.nextLine();

            switch (whatToDo) {
                case "buy":
                    buy();
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    printState();
                    break;
                case "exit":
                    break;
            }

        }
    }


    public static void printState() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");
    }

    public static void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String doing = scanner.nextLine();

        if ("back".equals(doing)) {
            return;
        }

        if (cups == 0) {
            System.out.println("Sorry, not enough disposable cups!");
            return;
        }

        int coffee = Integer.parseInt(doing);

        switch (coffee) {
            case 1:
                if (water >= 250) {
                    water -= 250;
                } else {
                    System.out.println("Sorry, not enough water!");
                    return;
                }
                if (beans >= 16) {
                    beans -= 16;
                } else {
                    System.out.println("Sorry, not enough coffee beans!");
                    return;
                }
                cups--;
                money += 4;
                System.out.println("I have enough resources, making you a coffee!");
                break;
            case 2:
                if (water >= 350) {
                    water -= 350;
                } else {
                    System.out.println("Sorry, not enough water!");
                    return;
                }
                if (milk >= 75) {
                    milk -= 75;
                } else {
                    System.out.println("Sorry, not enough milk!");
                    return;
                }
                if (beans >= 20) {
                    beans -= 20;
                } else {
                    System.out.println("Sorry, not enough coffee beans!");
                    return;
                }
                cups--;
                money += 7;
                System.out.println("I have enough resources, making you a coffee!");
                break;
            case 3:
                if (water >= 200) {
                    water -= 200;
                } else {
                    System.out.println("Sorry, not enough water!");
                    return;
                }
                if (milk >= 100) {
                    milk -= 100;
                } else {
                    System.out.println("Sorry, not enough milk!");
                    return;
                }
                if (beans >= 12) {
                    beans -= 12;
                } else {
                    System.out.println("Sorry, not enough coffee beans!");
                    return;
                }
                cups--;
                money += 6;
                System.out.println("I have enough resources, making you a coffee!");
                break;
        }

    }

    public static void take() {
        System.out.println("I gave you $" + money);
        money = 0;

    }

    public static void fill() {
        System.out.println("Write how many ml of water do you want to add: ");
        water += scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add: ");
        milk += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        beans += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        cups += scanner.nextInt();

    }
}

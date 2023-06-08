import java.util.LinkedHashMap;

import java.util.Scanner;

/**
 * реализовывает методы из интерфейса QueueBehaviour, которые имитируют работу
 * очереди. Содержит методы I_MarketBehaviour, которые добавляют и удаляют людей
 * из очереди, а
 * также метод update, который обновляет состояние магазина путем принятия и
 * отдачи заказов.
 */
public class Market implements I_MarketBehaviour, I_QueueBehaviour {

    int client;
    String product;
    int counter=1;
    int delCounter;

    @Override
    public String pickProduct(Scanner input) {
        System.out.println("Выберите продукт:\n1. Кола\n2. Бургер\n3. Соус");
        int myInput = input.nextInt();
        switch (myInput) {
            case 1:
                product = "Кола";
                return "Кола";

            case 2:
                product = "Бургер";
                return "Бургер";

            case 3:
                product = "Соус";
                return "Соус";

            default:
                System.out.println("Неправильный выбор.");
                pickProduct(input);
                break;
        }
        return pickProduct(input);
    }

    @Override
    public int addClient() {
        counter++;
        client = counter;
        return client;
    }

    @Override
    public void deleteClient(LinkedHashMap<Integer, String> myMap) {
        myMap.remove(delCounter);
        delCounter++;
        counter--;
        if(counter<1){
            counter=0;
        }
    }

    @Override
    public void update(LinkedHashMap<Integer, String> myMap) {
        for (var iterable_element : myMap.entrySet()) {
            System.out.printf("Заказ: %d\nВыбрано: %s", iterable_element.getKey(), iterable_element.getValue());
            
            System.out.println("\n--------------");
        }
        System.out.printf("Занятость очереди: %d/10",counter-1);
        System.out.println();
    }
}
// Реализовать класс Market и все его обязательные методы. Этот класс должен
// реализовывать методы из интерфейса QueueBehaviour, которые имитируют работу
// очереди. Кроме того, класс должен содержать методы, соответствующие
// интерфейсу MarketBehaviour, которые добавляют и удаляют людей из очереди, а
// также метод update, который обновляет состояние магазина путем принятия и
// отдачи заказов.

import java.util.LinkedHashMap;

import java.util.Scanner;

/**
 * реализовывает методы из интерфейса QueueBehaviour, которые имитируют работу
 * очереди
 */
public class program extends Market {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        Market x = new Market();

        LinkedHashMap<Integer, String> myLinkedMap = new LinkedHashMap<>(10, 1.0f);
        myLinkedMap.put(x.addClient(), x.pickProduct(myScanner)); // Положили клиента и его выбор в LinkedHashMap

        while (x.counter <= 10) {
            System.out
                    .println("Повора могут обрабатывать одновременно только 10 заказов с приемлемой скоростью выдачи.");
            System.out.println();
            System.out.println(
                    "Выберите действие: \n1. Добавить клиента в очередь.\n2. Удалить клиента из очереди.\n3. Статус очереди.");
            int myChoise = myScanner.nextInt();

            switch (myChoise) {
                case 1:
                    myLinkedMap.put(x.addClient(), x.pickProduct(myScanner));
                    break;
                case 2:
                    x.deleteClient(myLinkedMap);
                    break;
                case 3:
                    x.update(myLinkedMap);
                    break;

            }
        }
        System.out.println("Кухня забита заказами! Вы проиграли:)");
        
        myScanner.close();
    }
}
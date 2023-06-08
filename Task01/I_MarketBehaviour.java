
import java.util.LinkedHashMap;


/**
 * Обновить данный об очереди, добавить, удалить клиента.
 */
public interface I_MarketBehaviour {

    public void update(LinkedHashMap<Integer, String> myMap); // обновляет состояние магазина путем принятия и отдачи заказов

    public int addClient(); // добавляет клиента

    public void deleteClient(LinkedHashMap<Integer, String> myMap); // удаляет клиента    
}
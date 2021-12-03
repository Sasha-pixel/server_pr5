package com.example.demo.daolevel.repositories;

import com.example.demo.businesslevel.domainlayer.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * JPA репозиторий для заказов
 *
 * @author kanenkovaa
 * @version 0.1
 */
public interface OrderRepository extends JpaRepository<Order, Long> {

    Order findOrderById(Long id);

    /**
     * Поиск заказов по никнейму заказчика
     * @param customerUsername никнейм заказчика, по которму идёт посик заказов
     * @return Лист объектов Order
     */
    List<Order> findAllByCustomerUsername(String customerUsername);

    /**
     * Удаление заказа по его id
     * @param id id заказа
     */
    void deleteById(Long id);

    /**
     * Метод для получения списка всех заказов, отсортированных по никнейму заказчика
     * @return отсортированный список всех заказов
     */
    List<Order> findAllByOrderByCustomerUsername();

    /**
     * Поиск заказов по подстроке никнейма заказчика
     * @param username никнейм заказчика
     * @return список заказов
     */
    List<Order> findAllByCustomerUsernameContainingIgnoreCase(String username);
}

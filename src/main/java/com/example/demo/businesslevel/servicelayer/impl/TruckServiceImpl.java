package com.example.demo.businesslevel.servicelayer.impl;

import com.example.demo.businesslevel.domainlayer.Order;
import com.example.demo.businesslevel.domainlayer.Truck;
import com.example.demo.businesslevel.servicelayer.TruckService;
import com.example.demo.daolevel.repositories.TruckRepository;
import com.example.demo.businesslevel.validationlayer.TruckValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.List;

/**
 * Сервис, осуществляющий работу с таблицей грузовиков
 *
 * @author kanenkovaa
 * @version 0.2
 */
@Service
public class TruckServiceImpl implements TruckService {

    @Autowired
    private TruckRepository truckRepository;

    @Autowired
    private TruckValidator truckValidator;

    /**
     * метод сохранения нового автомобиля
     * @param truck объект автомобиля
     */
    @Override
    public void save(Truck truck) {
        truckRepository.save(truck);
    }

    /**
     * Поиск грузовиков по характеристике
     *
     * @param description характеристика грузовика
     * @return description - характеристика грузовика
     */
    @Override
    public List<Truck> findAllByDescription(String description) {
        return truckRepository.findAllByDescription(description);
    }

    /**
     * Поиск грузовика по номеру
     * @param carNumber автомобильный номер
     * @return объект грузовика
     */
    @Override
    public Truck findByCarNumber(String carNumber) {
        return truckRepository.findByCarNumber(carNumber);
    }

    /**
     * установка автомобиля на заказ
     * @param orderForm объект заказа
     * @param trucks лист всех автомобилей
     * @return
     */
    @Override
    public Truck setTruckToOrder(Order orderForm, List<Truck> trucks) {
        boolean flag;
        for (Truck truck : trucks) {
            flag = true;
            if (truck.getOrders().isEmpty()) {
                return truck;
            }
            else {
                for (Order order : truck.getOrders()) {
                    if (order.getTargetDate().equals(orderForm.getTargetDate()))
                        flag = false;
                }
                if (flag) {
                    return truck;
                }
            }
        }
        return null;
    }

    /**
     * Проверка наличия ошибок после валидации данных из формы добавления автомобиля
     * @param truck объект автомобиля
     * @param bindingResult лист для добавления ошибок
     * @param model модель веб-страницы
     * @return
     */
    @Override
    public boolean validateTruck(Truck truck, BindingResult bindingResult, Model model) {
        truckValidator.validate(truck, bindingResult);
        if (bindingResult.hasErrors()) {
            for (Object object : bindingResult.getAllErrors()) {
                if (object instanceof FieldError) {
                    FieldError fieldError = (FieldError)object;
                    model.addAttribute(fieldError.getField(), fieldError.getCode());
                }
            }

            return true;
        }
        else
            return false;
    }

}

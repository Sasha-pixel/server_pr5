package com.example.demo.daolevel.repositories;

import com.example.demo.businesslevel.domainlayer.User;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * JPA репозиторий для пользователей
 *
 * @author kanenkovaa
 * @version 0.1
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findUserById(Long id);

   /**
    * Поиск пользователя в бд по его никнейму
    *
    * @param username a {@link java.lang.String} object.
    * @return a {@link User} object.
    */
   User findByUsername(String username);

   /**
    * Поиск пользователя по его адресу эл.почты
    *
    * @param email a {@link java.lang.String} object.
    * @return a {@link User} object.
    */
   User findByEmail(String email);

   /**
    * Поиск пользователя по его номеру телефона
    *
    * @param phoneNumber a {@link java.lang.String} object.
    * @return a {@link User} object.
    */
   User findByPhoneNumber(String phoneNumber);

   /**
    * Поиск пользователя по коду активации учётной записи
    * @param code код активации учётной записи
    * @return a {@link User} object.
    */
    User findByActivationCode(String code);

   /**
    * Поиск пользователя по токену для смены пароля
    * @param token
    * @return
    */
    User findByResetPasswordToken(String token);
}

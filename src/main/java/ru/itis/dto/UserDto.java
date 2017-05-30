package ru.itis.dto;/* 30.05.2017
UserDto @author Victoria Noumenko 
@version v1.0 */

import ru.itis.models.User;

public class UserDto {

    private int id;
    private String login;
    private String password;
    private String name;
    private int age;

    public UserDto(){}

    public static class Builder {
        // дублируем все поля обрамляющего класса
        private int id;
        private String login;
        private String password;
        private String name;
        private int age;


        // пустой конструктор
        public Builder() {

        }

        // метод принимающий на вход значение поля и возвращающий самого себя
        // но уже с заданным значением поля
        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder login(String login) {
            this.login = login;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public UserDto build() {
            return new UserDto(this);
        }
    }

    public UserDto(Builder builder) {
        this.id = builder.id;
        this.login = builder.login;
        this.password = builder.password;
        this.age = builder.age;
        this.name = builder.name;

    }

    public void setId(int id) {
        this.id = id;
    }


    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}

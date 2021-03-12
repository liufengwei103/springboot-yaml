package com.qsh.domain

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

/**
 * groovy语言也必须加gettersetter方法，无法将配置文件的内容读进来
 */
@ConfigurationProperties(prefix = "person")
@Component
class Person {
    private String userName;
    private Boolean boss;
    private Date birth;
    private Integer age;
    private Pet pet;
    private String[] interests;
    private List<String> animal;
    private Map<String, Object> score;
    private Set<Double> salarys;
    private Map<String, List<Pet>> allPets;

    String getUserName() {
        return userName
    }

    void setUserName(String userName) {
        this.userName = userName
    }

    Boolean getBoss() {
        return boss
    }

    void setBoss(Boolean boss) {
        this.boss = boss
    }

    Date getBirth() {
        return birth
    }

    void setBirth(Date birth) {
        this.birth = birth
    }

    Integer getAge() {
        return age
    }

    void setAge(Integer age) {
        this.age = age
    }

    Pet getPet() {
        return pet
    }

    void setPet(Pet pet) {
        this.pet = pet
    }

    String[] getInterests() {
        return interests
    }

    void setInterests(String[] interests) {
        this.interests = interests
    }

    List<String> getAnimal() {
        return animal
    }

    void setAnimal(List<String> animal) {
        this.animal = animal
    }

    Map<String, Object> getScore() {
        return score
    }

    void setScore(Map<String, Object> score) {
        this.score = score
    }

    Set<Double> getSalarys() {
        return salarys
    }

    void setSalarys(Set<Double> salarys) {
        this.salarys = salarys
    }

    Map<String, List<Pet>> getAllPets() {
        return allPets
    }

    void setAllPets(Map<String, List<Pet>> allPets) {
        this.allPets = allPets
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrangTraiBatOn;

/**
 *
 * @author ADMIN
 */
public class Pet {
    private final String name;
    private final String type;
    private final String healthStatus;
    private final int age;

    public Pet(String name, String type, String healthStatus, int age) {
        this.name = name;
        this.type = type;
        this.healthStatus = healthStatus;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public int getAge() {
        return age;
    }
}

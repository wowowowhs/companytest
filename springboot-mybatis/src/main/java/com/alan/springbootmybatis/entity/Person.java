package com.alan.springbootmybatis.entity;

    import java.io.Serializable;

/**
* <p>
    * 
    * </p>
*
* @author alan
* @since 2021-07-21
*/
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private Integer age;

    public String getName() {
        return name;
        }

    public void setName(String name) {
        this.name = name;
        }
    public Integer getAge() {
        return age;
        }

    public void setAge(Integer age) {
        this.age = age;
        }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
    return "Person{" +
            "name=" + name +
            ", age=" + age +
    "}";
    }
}

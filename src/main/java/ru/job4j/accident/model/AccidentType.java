package ru.job4j.accident.model;

import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * 4. Form с композиционным объектом [#305522]
 * Уровень : 3. Мидл Категория : 3.4. SpringТопик : 3.4.2. MVC
 */
public class AccidentType {

    private int id;

    private String name;

    public static AccidentType of(int id, String name) {
        AccidentType type = new AccidentType();
        type.id = id;
        type.name = name;
        return type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccidentType that = (AccidentType) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "AccidentType{"
                + "id=" + id
                + ", name='" + name + '\''
                + '}';
    }
}

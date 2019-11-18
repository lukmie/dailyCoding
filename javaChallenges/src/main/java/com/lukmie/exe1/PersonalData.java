package com.lukmie.exe1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PersonalData {
    private String name;
    private Integer count;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonalData)) return false;
        PersonalData that = (PersonalData) o;
        return getName().equals(that.getName()) &&
                getCount().equals(that.getCount());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCount());
    }
}

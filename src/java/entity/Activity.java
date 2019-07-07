package entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
public class Activity {
    @Getter @Setter private String type;
    @Getter @Setter private int confidence;

    public Activity() {
    }
}

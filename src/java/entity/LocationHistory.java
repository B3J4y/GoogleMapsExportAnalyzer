package entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode
public class LocationHistory {
    @Getter @Setter @JsonProperty("locations") List<Location> activities;

    public LocationHistory() {
        activities = new ArrayList<>();
    }
}

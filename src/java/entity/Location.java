package entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@EqualsAndHashCode
public class Location {
    @Getter @Setter @JsonProperty("timestampMs") private long timestamp;
    @Getter @Setter @JsonProperty("latitudeE7") private long lat;
    @Getter @Setter @JsonProperty("longitudeE7") private long lon;
    @Getter @Setter private int accuracy;
    @Getter @Setter @JsonProperty("activity") private List<PossibleActivity> activity;
    @Getter @Setter private String velocity;
    @Getter @Setter private String altitude;
    @Getter @Setter private String heading;
    @Getter @Setter private String verticalAccuracy;

    public Location() {
    }
}

package entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@EqualsAndHashCode
public class PossibleActivity {
    @Getter @Setter @JsonProperty("timestampMs") private long timestamp;
    @Getter @Setter @JsonProperty("activity") private List<Activity> activities;

    public PossibleActivity() {
    }
}

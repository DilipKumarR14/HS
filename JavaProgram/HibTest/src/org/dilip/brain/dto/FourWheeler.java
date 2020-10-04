package org.dilip.brain.dto;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("LAMBO")
public class FourWheeler extends Vehicle {

    private String steer;

    public String getSteer() {
        return steer;
    }

    public void setSteer(String steer) {
        this.steer = steer;
    }
}

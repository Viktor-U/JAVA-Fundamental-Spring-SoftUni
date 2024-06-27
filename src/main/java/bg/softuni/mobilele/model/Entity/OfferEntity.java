package bg.softuni.mobilele.model.Entity;

import bg.softuni.mobilele.model.enums.EngineTypeEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "offers")
public class OfferEntity extends BaseEntity {



    private String description;

    private Integer mileage;
    @Enumerated(EnumType.STRING)
    private EngineTypeEnum engine;

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EngineTypeEnum getEngine() {
        return engine;
    }

    public void setEngine(EngineTypeEnum engine) {
        this.engine = engine;
    }
}

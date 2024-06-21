package bg.softuni.mobilele.model.DTOs;

import bg.softuni.mobilele.model.enums.EngineTypeEnum;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

public record AddOfferDTO(
        @NotEmpty @Size(min = 5) String description,
        @NotNull @PositiveOrZero Integer mileage,
        @NotNull EngineTypeEnum engineType
) {

    public static AddOfferDTO empty(){
        return new AddOfferDTO(null, null, null);
    }

}

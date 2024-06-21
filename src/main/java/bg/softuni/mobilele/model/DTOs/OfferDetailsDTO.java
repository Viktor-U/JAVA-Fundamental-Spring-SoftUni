package bg.softuni.mobilele.model.DTOs;

import bg.softuni.mobilele.model.enums.EngineTypeEnum;

public record OfferDetailsDTO(Long id,
                            String description,
                            Integer mileage,
                            EngineTypeEnum engineType
) {
}

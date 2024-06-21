package bg.softuni.mobilele.service.impl;

import bg.softuni.mobilele.model.DTOs.AddOfferDTO;
import bg.softuni.mobilele.model.DTOs.OfferDetailsDTO;
import bg.softuni.mobilele.model.Entity.OfferEntity;
import bg.softuni.mobilele.repository.OfferRepository;
import bg.softuni.mobilele.service.OfferService;
import org.springframework.stereotype.Service;

@Service
public class OfferServiceImpl implements OfferService {

    private final OfferRepository offerRepository;

    public OfferServiceImpl(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }

    @Override
    public long createOrder(AddOfferDTO addOfferDTO) {

        return offerRepository.save(map(addOfferDTO)).getId();
    }

    @Override
    public OfferDetailsDTO getOfferDetail(Long id) {
        return this.offerRepository
                .findById(id)
                .map(OfferServiceImpl::toOfferDetailsDTO)
                .orElseThrow();
    }

    private static OfferDetailsDTO toOfferDetailsDTO (OfferEntity offerEntity){
        return new OfferDetailsDTO(offerEntity.getId(),
                offerEntity.getDescription(),
                offerEntity.getMileage(),
                offerEntity.getEngine());
    }

    private static OfferEntity map(AddOfferDTO addOfferDTO) {
        OfferEntity offerEntity = new OfferEntity();
        offerEntity.setDescription(addOfferDTO.description());
        offerEntity.setEngine(addOfferDTO.engineType());
        offerEntity.setMileage(addOfferDTO.mileage());

        return offerEntity;
    }


}

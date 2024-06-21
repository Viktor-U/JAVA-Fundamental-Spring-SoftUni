package bg.softuni.mobilele.service;

import bg.softuni.mobilele.model.DTOs.AddOfferDTO;
import bg.softuni.mobilele.model.DTOs.OfferDetailsDTO;

public interface OfferService {

    long createOrder(AddOfferDTO addOfferDTO);

    OfferDetailsDTO getOfferDetail(Long id);
}

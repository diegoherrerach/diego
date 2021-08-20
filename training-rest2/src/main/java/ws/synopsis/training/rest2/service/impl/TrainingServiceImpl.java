package ws.synopsis.training.rest2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ws.synopsis.training.rest2.model.GetCountryResponse;
import ws.synopsis.training.rest2.repository.CountryRepository;
import ws.synopsis.training.rest2.request.CountryRequest;
import ws.synopsis.training.rest2.response.CountryResponse;
import ws.synopsis.training.rest2.service.TrainingService;

@Service
public class TrainingServiceImpl implements TrainingService{


	@Autowired
	CountryRepository countryRepository;
	
	
	@Override
	public GetCountryResponse findByNameGet(CountryRequest request) {
		GetCountryResponse response = new GetCountryResponse();
		response.setCountry(countryRepository.findCountry(request.getName()));

		return response;
	}



	@Override
	public GetCountryResponse editByName(CountryRequest request) {
		GetCountryResponse response = new GetCountryResponse();
		response.setCountry(countryRepository.editCountry(request.getName(), request.getCapital()));
		return response;
	}}



package ws.synopsis.training.rest2.service;

import ws.synopsis.training.rest2.model.GetCountryResponse;
import ws.synopsis.training.rest2.request.CountryRequest;

public interface TrainingService {
	public GetCountryResponse findByNameGet(CountryRequest value);
	public GetCountryResponse editByName(CountryRequest value);
}

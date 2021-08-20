package ws.synopsis.training.rest2.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ws.synopsis.training.rest2.model.GetCountryResponse;
import ws.synopsis.training.rest2.request.CountryRequest;
import ws.synopsis.training.rest2.service.TrainingService;

@RestController
public class TrainingApi{
	@Autowired
	private TrainingService trservice;
	
	@GetMapping("/findbyname")
	public ResponseEntity<?> findByNameGet(CountryRequest request) {
		
		GetCountryResponse getCountryResponse   =trservice.findByNameGet(request);
			return ResponseEntity.ok(getCountryResponse);
	}
	@GetMapping("/edit")
	public ResponseEntity<?> editByName(CountryRequest request) {
		System.out.println("CapitalWeb changed");
		GetCountryResponse getCountryResponse   =trservice.editByName(request);
		return ResponseEntity.ok(getCountryResponse);
	}
	
	
	
}

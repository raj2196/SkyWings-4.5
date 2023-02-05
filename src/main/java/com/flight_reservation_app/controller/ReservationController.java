package com.flight_reservation_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flight_reservation_app.dto.ReservationRequest;
import com.flight_reservation_app.entity.Reservation;
import com.flight_reservation_app.repository.FlightRepository;
import com.flight_reservation_app.service.ReservationService;
import com.flight_reservation_app.utilities.EmailUtil;
import com.flight_reservation_app.utilities.PDFgenerator;
import com.flight_reservation_app.utilities.EmailUtil;


@Controller
public class ReservationController {
	
	@Autowired
	private ReservationService reservationService;
	
	 String filePath="C:\\Users\\RAJU\\Desktop\\Spring_Boot\\flight_reservation_app\\src\\tickets\\booking";
	@Autowired
	private EmailUtil emailUtil;
	
	@Autowired
	private PDFgenerator pdf;
	
	@Autowired
	private FlightRepository flightRepo;
	
	
	
     @RequestMapping("/confirmReservation")
	public String confirmReservation(ReservationRequest request , ModelMap modelMap) {
		Reservation reservationId = reservationService.bookFlight(request);
		modelMap.addAttribute("reservationId", reservationId.getId());
		//EmailUtil emailUtil = new EmailUtil();
		String attachment = filePath+reservationId.getId()+".pdf";
 		emailUtil.sendItinerary(request.getEmail(), attachment);
		//PDFgenerator pdf = new PDFgenerator();
		pdf.generateItinerary(reservationId, attachment);
		return "confirmReservation";
		
	}
    


}

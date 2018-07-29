package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import booking.BookingService;
import booking.EnableBookingModule;

@SpringBootApplication
@EnableBookingModule
@RestController
public class ModularApplication {

	private final BookingService bookingService;

    public ModularApplication(BookingService bookingService) {
        this.bookingService = bookingService;
    }
	
	@GetMapping("/public")
    public String home() {
        return bookingService.message();
    }

	public static void main(String[] args) {
		SpringApplication.run(ModularApplication.class, args);
	}

}
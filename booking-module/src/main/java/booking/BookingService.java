package booking;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@EnableConfigurationProperties(BookingServiceProperties.class)
public class BookingService {

	// just an example
	
    private final BookingServiceProperties serviceProperties;

    public BookingService(BookingServiceProperties serviceProperties) {
        this.serviceProperties = serviceProperties;
    }

    public String message() {
        return this.serviceProperties.getMessage();
    }

}
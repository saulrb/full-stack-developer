import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.hcl.hackathon.fullstack.model.FindRegion;
import com.hcl.hackathon.fullstack.model.Region;
import com.hcl.hackathon.fullstack.model.Ticket;
import com.hcl.hackathon.fullstack.service.FindRegionService;

/**
 * 
 */

/**
 * @author saul
 *
 */
public class FindRegionServiceMockImp implements FindRegionService {

	/* (non-Javadoc)
	 * @see com.hcl.hackathon.fullstack.service.FindRegionService#findRegionByCriteria(com.hcl.hackathon.fullstack.model.FindRegion)
	 */
	
	private List<Region> regions;
	private List<Ticket> tickets;
	
	public FindRegionServiceMockImp() {
		regions = new ArrayList<Region>();
		tickets = new ArrayList<Ticket>();
		tickets.add(new Ticket().setTicketNumber("23578")
				.setIssueReported("Printer error")
				.setPriority("Low")
				.setTicketStatus("Open")
				.setIssueDate(new Date()));
		tickets.add(new Ticket().setTicketNumber("23590")
				.setIssueReported("File Server down")
				.setPriority("High")
				.setTicketStatus("InProgress")
				.setIssueDate(new Date()));
		regions.add(new Region().setId("21")
				.setCity("San Diego")
				.setCityId("90210")
				.setLatitude(853.01f)
				.setLongitude(537.41f)
				.setTickets(tickets)
				.setTicketCount(tickets.size()));
		regions.add(new Region().setId("21")
				.setCity("San Ysidro")
				.setCityId("90200")
				.setLatitude(753.01f)
				.setLongitude(437.41f)
				.setTickets(tickets)
				.setTicketCount(tickets.size()));
		regions.add(new Region().setId("21")
				.setCity("National City")
				.setCityId("90230")
				.setLatitude(803.01f)
				.setLongitude(507.41f)
				.setTickets(tickets)
				.setTicketCount(tickets.size()));
	}
	
	@Override
	public List<Region> findRegionByCriteria(FindRegion findRegion) {
		// Injected mock objects in constructor
		// only for demo propose 
		return regions;
	}

}

package movies;


/**
 *
 * @author Courtney Henson
 */
public class Price extends Costing {    
    public void addTicket(Tickets ticket) {
        if (day.getValue() == 3) {
            setTotal(getTotal() + ticket.getValue() - 2);
        }
        else {
            setTotal(getTotal() + ticket.getValue());
        }
    }
}

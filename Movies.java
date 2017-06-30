package movies;
/**
 *
 * @author Courtney Henson
 */
public class Movies {
    /**
     * @param args The type of tickets to be bought as strings. ("Child","OAP","Standard,"Student").
     */
    public static void main(String[] args) {
        Price cost = new Price();
        for (String arg : args) {
            switch(arg) {
                case "Child":
                    cost.addTicket(Tickets.Child);
                case "OAP":
                    cost.addTicket(Tickets.OAP);              
                case "Standard":
                    cost.addTicket(Tickets.Standard);
                    
                case "Student":
                    cost.addTicket(Tickets.Student);
            }
        }
        System.out.println("The total cost of tickets for this movie is £" + cost.getTotal());
    }
}

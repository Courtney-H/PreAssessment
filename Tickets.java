package movies;

/**
 *
 * @author Courtney Henson
 */
public enum Tickets implements Ticket {    
    Standard {
        @Override
        public int getValue() {
            return 8;
        }
    },
    OAP {
        @Override
        public int getValue() {
            return 6;
        }
    },
    Student {
        @Override
        public int getValue() {
            return 6;
        }
    },
    Child {
        @Override
        public int getValue() {
            return 4;
        }
    };
    
}



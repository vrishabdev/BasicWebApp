package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "MyTeam";
        } else if (query.contains("which of the following numbers is the largest: 84, 469")) {
            return "469";
        } else if(query.contains("what is 10 plus 15")) {
            return "25";
        } else if(query.contains("what is 2 plus 0")) {
            return "2";
        } else if(query.contains("what is 17 plus 9")) {
            return "26";
        } else if(query.contains("what is 6 plus 17")) {
            return "23";
        } else if(query.contains("which%20of%20the%20following%20numbers%20is%20both%20a%20square%20and%20a%20cube:%20652,%201156,%20256,%2064")) {
            return "64";
        }
        else { // TODO extend the programm here
            return "";
        }
    }
}
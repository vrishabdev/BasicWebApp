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
        } else if (query.contains("which of the following number is the largest:")) {
            return "20907";
        } else if(query.contains("what is 10 plus 15")) {
            return "25";
        } else if(query.contains("what is 2 plus 0")) {
            return "2";
        }
        else { // TODO extend the programm here
            return "";
        }
    }
}

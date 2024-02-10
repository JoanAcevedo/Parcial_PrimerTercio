package edu.eci.cvds.tdd.registry;

import java.util.HashMap;

public class Registry {
    HashMap<Integer, Person> votes = new HashMap<>();

    public RegisterResult registerVoter(Person p) {
        RegisterResult result = RegisterResult.VALID;
        // Invalid age
        if (p.getAge() > 135 || p.getAge() < 0) result = RegisterResult.INVALID_AGE;
        // Not underage
        else if (p.getAge() <= 18) result = RegisterResult.UNDERAGE;
        // Not dead
        else if (!p.isAlive()) result = RegisterResult.DEAD;
        // Not duplicate
        else if (votes.containsKey(p.getId())) result = RegisterResult.DUPLICATED;

        //it´s ok
        else votes.put(p.getId(), p);

        return result;
    }
}
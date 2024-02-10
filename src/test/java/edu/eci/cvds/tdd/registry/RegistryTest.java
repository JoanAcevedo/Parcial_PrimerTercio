package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {
    private Registry registry = new Registry();

    @Test
    public void validateRegistryResult() {
        Person person = new Person("Joan", 1, 21, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }

    @Test
    public void validateRegistryInvalidAge() {
        Person joan = new Person("Joan", 1, -21, Gender.MALE, true);
        Person miguel = new Person("Joan", 1, 150, Gender.MALE, true);

        RegisterResult resultJoan = registry.registerVoter(joan);
        RegisterResult resultMiguel = registry.registerVoter(miguel);

        Assert.assertEquals(RegisterResult.INVALID_AGE, resultJoan);
        Assert.assertEquals(RegisterResult.INVALID_AGE, resultMiguel);
    }

    @Test
    public void validateRegistryUnderage() {
        Person miguel = new Person("Miguel", 1, 0, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(miguel);

        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }

    @Test
    public void validateRegistryDead() {
        Person joan = new Person("Joan", 1, 25, Gender.MALE, false);
        RegisterResult result = registry.registerVoter(joan);
        Assert.assertEquals(RegisterResult.DEAD, result);
    }

    @Test
    public void validateRegistryDuplicate() {
        Person joan = new Person("Joan", 1, 21, Gender.MALE, true);
        Person miguel = new Person("Joan", 1, 20, Gender.MALE, true);

        RegisterResult resultJoan = registry.registerVoter(joan);
        RegisterResult resultMiguel = registry.registerVoter(miguel);

        Assert.assertEquals(RegisterResult.VALID, resultJoan);
        Assert.assertEquals(RegisterResult.DUPLICATED, resultMiguel);
    }
}
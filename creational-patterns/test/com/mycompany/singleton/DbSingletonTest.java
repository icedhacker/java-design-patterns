package com.mycompany.singleton;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DbSingletonTest {
    @Test
    public void SameInstanceInSingleton() {
        DbSingleton instance1 = DbSingleton.getInstance();
        DbSingleton instance2 = DbSingleton.getInstance();

        assertTrue(instance1 == instance2);
    }
}

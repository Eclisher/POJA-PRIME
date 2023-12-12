package com.company.base.endpoint.rest.controller;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NewPrimeTest {
    @Test
    public void testGetNewPrime() {
        NewPrime newPrimeController = new NewPrime();
        String result = newPrimeController.getNewPrime();
        // Vérifiez que la chaîne renvoyée est un nombre premier probable
        BigInteger bigIntegerResult = new BigInteger(result);
        boolean isProbablePrime = bigIntegerResult.isProbablePrime(100);

        assertTrue(isProbablePrime, "The result should be a probable prime number");
    }

    @Test
    public void testGetNewPrimeBitLength() {
        NewPrime newPrimeController = new NewPrime();
        String result = newPrimeController.getNewPrime();

        // Vérifiez que la longueur du nombre premier est proche de 10,000 bits
        BigInteger bigIntegerResult = new BigInteger(result);
        int bitLength = bigIntegerResult.bitLength();
        assertTrue(Math.abs(bitLength - 10000) <= 100, "The bit length should be close to 10,000");
    }
}
package com.training.jenkins;

import static org.junit.Assert.*;


import org.junit.Test;

import com.devops.training.JenkinsCalculator;

public class JenkinsCalcTest {

	@Test
	public void addTest() {
		JenkinsCalculator myCalc = new JenkinsCalculator();
		assertEquals(10, myCalc.addNumbers(5, 5));
	}

	@Test
	public void subtractTest() {
		JenkinsCalculator myCalc = new JenkinsCalculator();
		assertEquals(10, myCalc.subtractNumbers(15, 5));
	}

}

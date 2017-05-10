package com.github.markafitzgerald1.cribbage;

import org.junit.Assert;
import org.junit.Test;

public class CardIndexTest {
	private static final String JACK_STRING = "JACK";

	@Test
	public void numberOfCardIndices() {
		Assert.assertEquals("Number of distinct card indices", 13, CardIndex.values().length);
	}

	@Test
	public void valueOf() {
		// so that EclEmma reports full instruction coverage of CardIndex
		Assert.assertEquals("Value of \"" + JACK_STRING + "\"", CardIndex.valueOf(JACK_STRING), CardIndex.JACK);
	}
}
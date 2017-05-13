package com.github.markafitzgerald1.cribbage;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import com.google.common.collect.ImmutableList;

public class HandTest {
	@Test
	public void create() {
		final ImmutableList<CardIndex> cards = ImmutableList.of(CardIndex.FOUR, CardIndex.JACK);
		Assert.assertThat("hand cards", Hand.create(cards).cards(), Matchers.equalTo(cards));
	}
}
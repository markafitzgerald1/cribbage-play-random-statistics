package com.github.markafitzgerald1.cribbage;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.ImmutableList;

public class AllHandsTest {
    private final Hand DEALER_HAND = Hand.create(ImmutableList.of(CardIndex.ACE,
        CardIndex.TWO, CardIndex.SEVEN, CardIndex.KING));
    private final Hand PONE_HAND = Hand.create(ImmutableList.of(CardIndex.FIVE,
        CardIndex.SIX, CardIndex.QUEEN, CardIndex.TWO));
    private AllHands fixture;

    @Before
    public void setUp() {
        fixture = AllHands.create(DEALER_HAND, PONE_HAND);
    }

    @Test
    public void allHandsDealer() {
        Assert.assertThat("all hands' dealer hand", fixture.dealer(),
            Matchers.equalTo(DEALER_HAND));
    }

    @Test
    public void allHandsPone() {
        Assert.assertThat("all hands' pone hand", fixture.pone(),
            Matchers.equalTo(PONE_HAND));
    }
}

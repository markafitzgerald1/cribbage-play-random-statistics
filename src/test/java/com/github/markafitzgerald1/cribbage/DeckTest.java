package com.github.markafitzgerald1.cribbage;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import com.google.common.collect.ImmutableList;

/** Provides direct unit test coverage of {@link Deck}. */
public final class DeckTest {
    @Test
    public void create() {
        final ImmutableList<CardIndex> allCardIndices = ImmutableList
            .<CardIndex>builder().add(CardIndex.values()).build();
        Assert.assertThat("deck cards", Deck.create(allCardIndices).cards(),
            Matchers.equalTo(allCardIndices));
    }
}

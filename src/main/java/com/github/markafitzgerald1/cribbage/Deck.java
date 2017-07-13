package com.github.markafitzgerald1.cribbage;

import javax.annotation.Nonnull;

import com.google.auto.value.AutoValue;
import com.google.common.collect.ImmutableList;

/**
 * Represents the current list of undealt cards in the play of a single cribbage
 * hand.
 */
@AutoValue
public abstract class Deck {
    public static Deck create(@Nonnull final ImmutableList<CardIndex> cards) {
        return new AutoValue_Deck(cards);
    }

    public abstract ImmutableList<CardIndex> cards();
}

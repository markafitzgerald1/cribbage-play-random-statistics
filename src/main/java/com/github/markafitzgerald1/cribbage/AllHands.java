package com.github.markafitzgerald1.cribbage;

import javax.annotation.Nonnull;

import com.google.auto.value.AutoValue;

/**
 * Represents the set of unplayed cards held by each cribbage player in a
 * two-player game of cribbage.
 */
@AutoValue
public abstract class AllHands {
    public static AllHands create(@Nonnull final Hand dealerHand,
        @Nonnull final Hand poneHand)
    {
        return new AutoValue_AllHands(dealerHand, poneHand);
    }

    public abstract Hand dealer();

    public abstract Hand pone();
}

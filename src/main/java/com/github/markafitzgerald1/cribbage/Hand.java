package com.github.markafitzgerald1.cribbage;

import javax.annotation.Nonnull;

import com.google.auto.value.AutoValue;
import com.google.common.collect.ImmutableCollection;

/**
 * Represents the set of unplayed cards held by a cribbage player.
 */
@AutoValue
public abstract class Hand {
	public static Hand create(@Nonnull final ImmutableCollection<CardIndex> cards) {
		return new AutoValue_Hand(cards);
	}

	public abstract ImmutableCollection<CardIndex> cards();
}
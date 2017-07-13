package com.github.markafitzgerald1.cribbage;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

import javax.annotation.Nonnull;

import com.google.common.collect.ImmutableList;

/**
 * Provides {@link Deck} creation services.
 */
public final class DeckFactory {
    private static final int N_SUITS = 4;
    private static final Deck DECK = Deck
        .create(Collections.nCopies(N_SUITS, CardIndex.values()).stream()
            .flatMap(Arrays::stream).collect(Collectors.collectingAndThen(
                Collectors.toList(), ImmutableList::copyOf)));

    /**
     * Generate a complete deck containing {@value #N_SUITS} of each
     * {@link CardIndex} - one for each omitted (for now) suit.
     * @return complete deck containing {@value #N_SUITS} of each
     * {@link CardIndex}
     */
    @Nonnull
    public Deck createComplete() {
        return DECK;
    }
}

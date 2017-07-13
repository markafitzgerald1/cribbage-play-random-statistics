package com.github.markafitzgerald1.cribbage;

import javax.annotation.Nonnull;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Provides direct unit test coverage of {@link DeckFactory}.
 */
public final class DeckFactoryTest {
    private static final String CREATE_COMPLETE_METHOD = "createComplete";
    private static final String DECK_ACTUAL = "deck";
    private static final Class<Nonnull> NONNULL_CLASS = Nonnull.class;
    private static final int DECK_SIZE = 52;

    private DeckFactory fixture;

    @Before
    public void setUp() {
        fixture = new DeckFactory();
    }

    @Test
    public void createCompleteNotNull() {
        Assert.assertThat(DECK_ACTUAL, fixture.createComplete(),
            Matchers.notNullValue());
    }

    @Test
    public void createCompleteNonnullAnnotaed() throws NoSuchMethodException {
        Assert.assertThat(
            NONNULL_CLASS.getSimpleName() + " annotation", DeckFactory.class
                .getMethod(CREATE_COMPLETE_METHOD).getAnnotation(NONNULL_CLASS),
            Matchers.notNullValue());
    }

    @Test
    public void createCompleteNonEmpty() {
        Assert.assertThat(DECK_ACTUAL, fixture.createComplete().cards(),
            Matchers.not(Matchers.empty()));
    }

    @Test
    public void createCompleteContainsFiftyTwoCardIndices() {
        Assert.assertThat(DECK_ACTUAL, fixture.createComplete().cards(),
            Matchers.hasSize(DECK_SIZE));
    }
}

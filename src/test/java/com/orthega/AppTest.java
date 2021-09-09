package com.orthega;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void shouldCheckIfStringContainsUniqueCharacters() {

        assertThat(App.isUnique("merde")).isEqualTo(false);
        assertThat(App.isUnique("merd")).isEqualTo(true);
        assertThat(App.isUnique("")).isEqualTo(true);
        assertThat(App.isUnique("a")).isEqualTo(true);

    }

    @Test
    public void shouldTellIfTwoStringsPermute() {

        assertThat(App.checkPermutation("merde", "edrme")).isEqualTo(true);
        assertThat(App.checkPermutation("b", "b")).isEqualTo(true);
        assertThat(App.checkPermutation("ab", "ba")).isEqualTo(true);
        assertThat(App.checkPermutation("merde", "edrm")).isEqualTo(false);
        assertThat(App.checkPermutation("merde", "merdo")).isEqualTo(false);
        assertThat(App.checkPermutation("", "")).isEqualTo(true);
        assertThat(App.checkPermutation("", "e")).isEqualTo(false);
        assertThat(App.checkPermutation("e", "")).isEqualTo(false);

    }

    @Test
    public void shouldReplaceSpaceWithGivenSymbol() {

        assertThat(App.replaceSpaceWithString("mer de", "a")).isEqualTo("merade");
        assertThat(App.replaceSpaceWithString("", "a")).isEqualTo("");
        assertThat(App.replaceSpaceWithString("mer de", "ab")).isEqualTo("merabde");
        assertThat(App.replaceSpaceWithString("merde", "a")).isEqualTo("merde");
        assertThat(App.replaceSpaceWithString(" mer de", "a")).isEqualTo("amerade");
        assertThat(App.replaceSpaceWithString(" mer de ", "a")).isEqualTo("ameradea");
        assertThat(App.replaceSpaceWithString(" mer de ", "a%")).isEqualTo("a%mera%dea%");

    }
}

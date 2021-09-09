package com.orthega;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
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
}

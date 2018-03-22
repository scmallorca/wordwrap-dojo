package org.mallorcasc.wordwrapkata;

import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;
import org.junit.Test;

public class WrapperTest {

    @Test
    public void givenANullTextThenReturnsNull() {

        assertThat(Wrapper.wrap(null, 2), Matchers.isEmptyOrNullString());
    }

    @Test
    public void givenOneWordAndColumnSetLessThanWordWidthThenRetursnTheWordSplittedAtColumWidth() {

        assertThat(Wrapper.wrap("wtf", 2), Matchers.is("wt\nf"));
        assertThat(Wrapper.wrap("pepe", 2), Matchers.is("pe\npe"));
        assertThat(Wrapper.wrap("pepito", 2), Matchers.is("pe\npi\nto"));
    }

    @Test
    public void givenOneWordAndColumnSetToWordWidthThenRetursnTheWordAsIt() {

        assertThat(Wrapper.wrap("wtf", 3), Matchers.is("wtf"));
        assertThat(Wrapper.wrap("pepe", 4), Matchers.is("pepe"));
    }

    @Test
    public void givenOneWordWithSpacesAtTheEndThenRetursnTheWordWithoutSpaces() {

        assertThat(Wrapper.wrap("wtf  ", 3), Matchers.is("wtf"));
        assertThat(Wrapper.wrap("pepe  ", 4), Matchers.is("pepe"));
    }

    @Test
    public void givenTwoWordsWithSpacesBetweenThemReturnsTheTextWrapped() {

        assertThat(Wrapper.wrap("wtf pet", 3), Matchers.is("wtf\npet"));
        assertThat(Wrapper.wrap("wtf  pet", 5), Matchers.is("wtf\npet"));
    }

    @Test
    public void givenManyWordsWithSpacesBetweenThemReturnsTheTextWrapped() {

        assertThat(Wrapper.wrap("wtf pet jaja jeje", 5), Matchers.is("wtf\npet\njaja\njeje"));
        assertThat(Wrapper.wrap("wtf pet jaja jeje", 7), Matchers.is("wtf pet\njaja\njeje"));
        assertThat(Wrapper.wrap("wtf pet  jaja  jeje", 7), Matchers.is("wtf pet\njaja\njeje"));
        assertThat(Wrapper.wrap("wtf pet  jaja  jeje, Aqui estamos de buena mañana", 7), Matchers.is("wtf pet\njaja\njeje,\nAqui\nestamos\nde\nbuena\nmañana"));
    }
}

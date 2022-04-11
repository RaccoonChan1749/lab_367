package com.averkina;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    @DisplayName("cat/dog")
    void canModify1() {
        assertAll(() -> assertEquals(false, Main.canModify("cat","dog")));
    }
    @Test
    @DisplayName("cat/acts")
    void canModify2() {
        assertAll(() -> assertEquals(false, Main.canModify("cat", "acts")));
    }
    @Test
    @DisplayName("cat/cats")
    void canModify3() {
        assertAll(() -> assertEquals(true, Main.canModify("cat", "cats")));
    }
    @Test
    @DisplayName("cat/cast")
    void canModify4() {
        assertAll(() -> assertEquals(true, Main.canModify("cat", "cast")));
    }
    @Test
    @DisplayName("cat/at")
    void canModify5() {
        assertAll(() -> assertEquals(true, Main.canModify("cat", "at")));
    }
    @Test
    @DisplayName("cat/cut ")
    void canModify6() {
        assertAll(() -> assertEquals(true, Main.canModify("cat", "cut")));
    }
    @Test
    @DisplayName("cat/cu")
    void canModify7() {
        assertAll(() -> assertEquals(false, Main.canModify("cat", "cu")));
    }
}
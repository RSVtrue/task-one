package com.AreaLibrary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreaTest {
    Area area = new Area();

    @Test
    void area() {
            assertEquals(15, area.area(3,5));
    }
}
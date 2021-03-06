package com.fse.returnorderControllerProcessingMicroservice.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.fse.returnorderControllerProcessingMicroservice.util.ComponentType;

class ComponentTypeTest {

    /**
     * Method under test: {@link ComponentType#values()}
     */
    @Test
    void testValues() {
        ComponentType[] actualValuesResult = ComponentType.values();
        assertEquals(2, actualValuesResult.length);
        assertEquals(ComponentType.INTEGRAL, actualValuesResult[0]);
        assertEquals(ComponentType.ACCESSORY, actualValuesResult[1]);
    }
}


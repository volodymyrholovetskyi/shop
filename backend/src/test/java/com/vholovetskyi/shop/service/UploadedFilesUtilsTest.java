package com.vholovetskyi.shop.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UploadedFilesUtilsTest {

    @ParameterizedTest
    @CsvSource({
            "test test.png, test-test.png",
            "hello world.png, hello-world.png",
            "ąęśćżźńłó.png, aesczznlo.png",
            "Product 1.png, product-1.png",
            "Product - 1.png, product-1.png",
            "Product__1.png, product-1.png"
    })
    void shouldSlugifyFileName(String in, String out){
        String fileName = UploadedFilesUtils.slugifyFileName(in);
        assertEquals(fileName, out);
    }

}
package com.amazonassignment.testdata;

import lombok.Builder;
import lombok.Getter;

@Builder(setterPrefix = "set")
@Getter
public class TestData {

    private String category;
    private String product;
    private String brand;
    private String textToVerify;

}

package com.amazonassignment.tests;

import com.amazonassignment.annotations.FrameworkAnnotation;
import com.amazonassignment.facade.SearchProduct;
import com.amazonassignment.pages.HomePage;
import com.amazonassignment.pages.pageComponents.PrioritySorterComponent;
import com.amazonassignment.testdata.TestData;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class AmazonTests extends BaseTest {

    @Test(dataProvider = "getData",description = "To validate whether user is able to see About this Item Heading")
    @FrameworkAnnotation(author = "Aravind",catergory = "Smoke")
    public void verifyAboutThisItemIsDispalyed(TestData testData){
        String strHeading=new SearchProduct()
                .filterAsPerCustomerChoice(testData.getCategory(), testData.getProduct(), testData.getBrand())
                .getAboutItemHeading();
        assertThat(strHeading)
                .withFailMessage(()->"About This item is not diplayed")
                .isEqualTo(testData.getTextToVerify());
    }

    @DataProvider
    public Object[][] getData() {
        return new Object[][]{
                {TestData.builder()
                        .setCategory("TV, Appliances, Electronics")
                        .setProduct("Televisions")
                        .setBrand("Samsung")
                        .setTextToVerify("About this item")
                        .build()
                }
        };
    }
}

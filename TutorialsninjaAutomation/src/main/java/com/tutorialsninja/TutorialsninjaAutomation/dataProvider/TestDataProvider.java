package com.tutorialsninja.TutorialsninjaAutomation.dataProvider;

import org.testng.annotations.DataProvider;

import com.tutorialsninja.TutorialsninjaAutomation.constant.FileConstant;
import com.tutorialsninja.TutorialsninjaAutomation.utils.ProvideData;


/**
 * In this class, data is given by the dataprovider
 * @author arjun.santra
 */
public class TestDataProvider {
	/**
	 * In this method, getting data object array from excel sheet and returning
	 * to the calling method
	 */

	@DataProvider(name = "productData")
	public Object[][] getProductData() {
		ProvideData provideData = new ProvideData(FileConstant.TESTDATA_FILE, 0);
		Object[][] getData = provideData.provideData();
		return getData;
	}
	
	
	

	

//	public static void main(String[] args) {
//
//		Object[][] data = new TestDataProvider().getCityData();
//		for (Object[] objects : data) {
//			String userName = (String) objects[0];
//			String password = (String) objects[1];
//			System.out.println(" " + userName + "   " + password);
//		}
//	}
}
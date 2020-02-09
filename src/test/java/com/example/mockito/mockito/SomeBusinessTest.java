package com.example.mockito.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class SomeBusinessTest {

	@Test
	public void testFindTheGreatestFromAllData() {

		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(new DataServiceStub() );
		int result = someBusinessImpl.findTheGreatestFromAllData();
		assertEquals(24, result);
	}

}
class DataServiceStub implements DataService{
	@Override
	public int[] retrieveAllData() {
		// TODO Auto-generated method stub
		return new int[] {24,6,15};
	}
}
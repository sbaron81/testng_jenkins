package MyPackage;

import org.testng.Assert;
import org.testng.annotations.Test;


public class MyClass {

	public static void main(String[] args) {
		System.out.println("Teste main!!");
	}
	
	@Test(priority=1, description="---- Executando o Primeiro Test")
	public void primeiroTest() {
		System.out.println("Primeiro Teste!!");
        Assert.assertEquals(13, 13);

	}
	
	@Test(priority=2, description="---- Executando o ABC Test")
	public void abcTest() {
		System.out.println("ABC Test");
	}
	
	@Test(priority=3, description="---- Executando o Test Final")
	public void finalTest() {
		System.out.println("Final Test");
	}
	
}

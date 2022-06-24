package recursion;

import org.junit.jupiter.api.Test;

/**
 * 
 * @author Alex Murdock
 *
 */
public class RecursionTest {
	/**
	 * Tests related to the 
	 * <code>sumOfDigits</code>
	 * method in JUnit.
	 */
	@Test
	void testSumOfDigits_NegativeValue_1() {
		Recursion.sumOfDigits("-49");
	}
	@Test
	void testSumOfDigits_FourNumbers_2() {
		Recursion.sumOfDigits("2069");
	}
	@Test
	void testSumOfDigits_ElevenNumbers_3() {
		Recursion.sumOfDigits("12855254584");
	}
	
	@Test
	void testSumOfDigits_TwentyFiveNumbers_4() {
		Recursion.sumOfDigits("5367815671638538168159570");
	}
	@Test
	void testSumOfDigits_NegativeMillion_5() {
		Recursion.sumOfDigits("-5810235");
	}
	@Test
	void testSumOfDigits_Zero_6() {
		Recursion.sumOfDigits("0");
	}
	@Test
	void testSumOfDigits_NegativeBigValue_7() {
		Recursion.sumOfDigits("-00000009864212445");
	}
	@Test
	void testSumOfDigits_BinaryDigits_8() {
		Recursion.sumOfDigits("0100100001001001");
	}

	/**
	 * Tests related to the 
	 * <code>countSmiles</code>
	 * method in JUnit.
	 */
	@Test
	void testCountSmiles_OnlyNumbers_1() {
		char[] smiles = {'5','1','9','2','0','0','4','3','1','8','7','6'};
		Recursion.countSmiles(smiles,0);
	}
	@Test
	void testCountSmiles_TwoConsecutiveSmiles_2() {
		char[] smiles = {'n', 'g', ':', ')', ':', ')'};
		Recursion.countSmiles(smiles,0);
	}

	@Test
	void testCountSmiles_SadFace_3() {
		char[] smiles = {':','('};
		Recursion.countSmiles(smiles,0);
	}
	@Test
	void testCountSmiles_LastSingleSmile_4() {
		char[] smiles = {'[','a',':','b','(','c',')',':',' ',')','e',':',')'};
		Recursion.countSmiles(smiles,0);
	}
	@Test
	void testCountSmiles_NameBillyBob_5() {
		char[] smiles = {'B','i','l','l','y',' ','B','o','b'};
		Recursion.countSmiles(smiles,0);
	}
	@Test
	void testCountSmiles_InverseSmile_6() {
		char[] smiles = {'(',':'};
		Recursion.countSmiles(smiles,0);
	}
	@Test
	void testCountSmiles_ZeroSmiles_7() {
		char[] smiles = {'[','a',':','(','c',')',':',' ',')','e','P'};
		Recursion.countSmiles(smiles,0);
	}

	@Test
	void testCountSmiles_SpaceBetweenSmile_8() {
		char[] smiles = {':',' ',')'};
		Recursion.countSmiles(smiles,0);
	}

	/**
	 * Tests related to the 
	 * <code>toUpper</code>
	 * method in JUnit.
	 */
	@Test
	void testToUpper_AllLowerCase_1() {
		Recursion.toUpper("test");
	}
	@Test
	void testToUpper_car_2() {
		Recursion.toUpper("bmw");
	}
	@Test
	void testToUpper_AllUpperCase_3() {
		Recursion.toUpper("AUDI");
	}
	@Test
	void testToUpper_TwoWords_4() {
		Recursion.toUpper("Murdock Electronics");
	}
	@Test
	void testToUpper_UpperLowerCombination_5() {
		Recursion.toUpper("sUpErDupErWacKY");
	}
	@Test
	void testToUpper_UpperLowerCombinationTwoWords_6() {
		Recursion.toUpper("sUpErDupErWacKY Test");
	}
	@Test
	void testToUpper_MultipleWords_7() {
		Recursion.toUpper("Programing is cool");
	}
	@Test
	void testToUpper_Sentence_8() {
		Recursion.toUpper("I really like cars espically Porsche GT3s.");
	}
}


import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Ignore
import org.junit.Test

class IsbnVerifierTest {

    @Test
    fun validIsbnNumber() {
        assertTrue(IsbnVerifier.isValid("3-598-21508-8"))
    }

    @org.junit.Ignore
    @Test
    fun invalidIsbnCheckDigit() {
        assertFalse(IsbnVerifier.isValid("3-598-21508-9"))
    }

    @org.junit.Ignore
    @Test
    fun validIsbnNumberWithCheckDigitOfTen() {
        assertTrue(IsbnVerifier.isValid("3-598-21507-X"))
    }

    @Ignore
    @Test
    fun checkDigitIsACharacterOtherThanX() {
        assertFalse(IsbnVerifier.isValid("3-598-21507-A"))
    }

    @Ignore
    @Test
    fun invalidCharacterInIsbn() {
        assertFalse(IsbnVerifier.isValid("3-598-P1581-X"))
    }

    @Ignore
    @Test
    fun xIsOnlyValidAsACheckDigit() {
        assertFalse(IsbnVerifier.isValid("3-598-2X507-9"))
    }

    @Ignore
    @Test
    fun validIsbnWithoutSeparatingDashes() {
        assertTrue(IsbnVerifier.isValid("3598215088"))
    }

    @Ignore
    @Test
    fun isbnWithoutSeparatingDashesAndXAsCheckDigit() {
        assertTrue(IsbnVerifier.isValid("359821507X"))
    }

    @Ignore
    @Test
    fun isbnWithoutCheckDigitAndDashes() {
        assertFalse(IsbnVerifier.isValid("359821507"))
    }

    @Ignore
    @Test
    fun tooLongIsbnAndNoDashes() {
        assertFalse(IsbnVerifier.isValid("3598215078X"))
    }

    @Ignore
    @Test
    fun isbnWithoutCheckDigit() {
        assertFalse(IsbnVerifier.isValid("3-598-21507"))
    }

    @Ignore
    @Test
    fun tooLongIsbn() {
        assertFalse(IsbnVerifier.isValid("3-598-21507-XX"))
    }

    @Ignore
    @Test
    fun checkDigitOfXShouldNotBeUsedForZero() {
        assertFalse(IsbnVerifier.isValid("3-598-21515-X"))
    }

    @Ignore
    @Test
    fun emptyIsbn() {
        assertFalse(IsbnVerifier.isValid(""))
    }

    @Ignore
    @Test
    fun inputIsNineCharacters() {
        assertFalse(IsbnVerifier.isValid("134456729"))
    }

    @Ignore
    @Test
    fun invalidCharactersAreNotIgnored() {
        assertFalse(IsbnVerifier.isValid("3132P34035"))
    }
}
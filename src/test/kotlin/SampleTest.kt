import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SampleTest {
    @Test
    @DisplayName("should return Hello TDD Boot Camp!")
    fun `should return Hello TDD Boot Camp`() {
        val sut = Smaple()

        val actual = sut.say()

        assertEquals("Hello TDD Boot Camp!", actual)
    }
}
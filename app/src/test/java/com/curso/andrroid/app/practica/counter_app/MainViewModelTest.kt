import com.curso.andrroid.app.practica.counter_app.MainViewModel
import org.junit.Assert.assertEquals
import org.junit.Test

class MainViewModelTest {

    private val viewModel = MainViewModel()

    @Test
    fun testCompareStrings_equalStrings() {
        val str1 = "Hola"
        val str2 = "Hola"
        val result = viewModel.compareStrings(str1, str2)
        assertEquals(true, result)
    }

    @Test
    fun testCompareStrings_differentStrings() {
        val str1 = "Hola"
        val str2 = "Mundo"
        val result = viewModel.compareStrings(str1, str2)
        assertEquals(false, result)
    }
}

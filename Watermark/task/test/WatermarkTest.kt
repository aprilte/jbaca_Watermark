import org.hyperskill.hstest.dynamic.DynamicTest
import org.hyperskill.hstest.stage.StageTest
import org.hyperskill.hstest.testcase.CheckResult
import org.hyperskill.hstest.testing.TestedProgram
import java.io.File

class CardGameTest : StageTest<Any>() {

    @DynamicTest(order = 1)
    fun imageNotExistTest(): CheckResult {
        val main = TestedProgram()
        var outputString = main.start().trim().lowercase()
        var position = checkOutput(outputString, 0, "Input the image filename:".lowercase())
        if ( position  == -1 ) return CheckResult(false, "Invalid prompt for the image filename.")

        outputString = main.execute("notexist.png").trim().lowercase()
        position = checkOutput(outputString, 0, "The file notexist.png doesn't exist.".lowercase())
        if ( position  == -1 ) return CheckResult(false, "Incorrect output, when a non existing filename was input.")

        if (!main.isFinished) return CheckResult(false, "The application didn't exit.")

        return CheckResult.correct()
    }

    @DynamicTest(order = 2)
    fun image24bitTest(): CheckResult {
        val main = TestedProgram()
        var outputString = main.start().trim().lowercase()
        var position = checkOutput(outputString, 0, "Input the image filename:".lowercase())
        if ( position  == -1 ) return CheckResult(false, "Invalid prompt for the image filename.")

        try {
            val infile = "test${File.separator}10151rgb.png"
            val inputFile = File(infile)
            if (!inputFile.exists()) {
                return CheckResult(false, "An input test image file doesn't exist. Try reloading the project.")
            }
            outputString = main.execute(infile).trim().lowercase()
            position = checkOutput(outputString, 0, "Image file: test${File.separator}10151rgb.png".lowercase())
            if (position == -1) return CheckResult(false, "Incorrect output, for line with the image filename.")
            position = checkOutput(outputString, position, "Width: 101".lowercase())
            if (position == -1) return CheckResult(false, "Incorrect width information.")
            position = checkOutput(outputString, position, "Height: 51".lowercase())
            if (position == -1) return CheckResult(false, "Incorrect height information.")
            position = checkOutput(outputString, position, "Number of components: 3".lowercase())
            if (position == -1) return CheckResult(false, "Incorrect Number of components information.")
            position = checkOutput(outputString, position, "Number of color components: 3".lowercase())
            if (position == -1) return CheckResult(false, "Incorrect Number of color components information.")
            position = checkOutput(outputString, position, "Bits per pixel: 24".lowercase())
            if (position == -1) return CheckResult(false, "Incorrect Bits per pixel information.")
            position = checkOutput(outputString, position, "Transparency: OPAQUE".lowercase())
            if (position == -1) return CheckResult(false, "Incorrect Transparency information.")
        } catch (e: Exception) {
            return CheckResult(false, "An exception was thrown, when trying to open an image file.")
        }

        if (!main.isFinished) return CheckResult(false, "The application didn't exit.")

        return CheckResult.correct()
    }

    @DynamicTest(order = 3)
    fun image32bitTest(): CheckResult {
        val main = TestedProgram()
        var outputString = main.start().trim().lowercase()
        var position = checkOutput(outputString, 0, "Input the image filename:".lowercase())
        if ( position  == -1 ) return CheckResult(false, "Invalid prompt for the image filename.")

        try {
            val infile = "test${File.separator}10151rgba.png"
            val inputFile = File(infile)
            if (!inputFile.exists()) {
                return CheckResult(false, "Input test image file doesn't exist. Try reloading the project.")
            }
            outputString = main.execute(infile).trim().lowercase()
            position = checkOutput(outputString, 0, "Image file: test${File.separator}10151rgba.png".lowercase())
            if (position == -1) return CheckResult(false, "Incorrect output, for line with the image filename.")
            position = checkOutput(outputString, position, "Width: 101".lowercase())
            if (position == -1) return CheckResult(false, "Incorrect width information.")
            position = checkOutput(outputString, position, "Height: 51".lowercase())
            if (position == -1) return CheckResult(false, "Incorrect height information.")
            position = checkOutput(outputString, position, "Number of components: 4".lowercase())
            if (position == -1) return CheckResult(false, "Incorrect Number of components information.")
            position = checkOutput(outputString, position, "Number of color components: 3".lowercase())
            if (position == -1) return CheckResult(false, "Incorrect Number of color components information.")
            position = checkOutput(outputString, position, "Bits per pixel: 32".lowercase())
            if (position == -1) return CheckResult(false, "Incorrect Bits per pixel information.")
            position = checkOutput(outputString, position, "Transparency: TRANSLUCENT".lowercase())
            if (position == -1) return CheckResult(false, "Incorrect Transparency information.")
        } catch (e: Exception) {
            return CheckResult(false, "An exception was thrown, when trying to open an image file.")
        }

        if (!main.isFinished) return CheckResult(false, "The application didn't exit.")

        return CheckResult.correct()
    }

}

fun checkOutput(outputString: String, searchPos: Int, vararg checkStr: String): Int {
    var searchPosition = searchPos
    for (str in checkStr) {
        val findPosition = outputString.indexOf(str, searchPosition)
        if (findPosition == -1) return -1
        if ( outputString.substring(searchPosition until findPosition).isNotBlank() ) return -1
        searchPosition = findPosition + str.length
    }
    return searchPosition
}



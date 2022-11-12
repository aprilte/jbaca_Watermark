package watermark

import java.awt.image.BufferedImage
import java.io.File
import java.lang.Exception
import javax.imageio.ImageIO

fun main() {
    inspectImg()
}

fun inspectImg() {
    println("Input the image filename:")
    val myPath = System.getProperty("user.dir")
    val fileName = readln()
    val imageFile = File(myPath + "\\" + fileName)

    try {
        val image: BufferedImage = ImageIO.read(imageFile)
        println("Image file: $fileName")
        println("Width: ${image.width}")
        println("Height: ${image.height}")
        println("Number of components: ${image.colorModel.numComponents}")
        println("Number of color components: ${image.colorModel.numColorComponents}")
        println("Bits per pixel: ${image.colorModel.pixelSize}")
        print("Transparency: ")
        println(
            when(image.transparency) {
                1, -> "OPAQUE"
                2, -> "BITMASK"
                3, -> "TRANSLUCENT"
                else -> "NONE"
            }
        )
    } catch (ex: Exception) {
        println("The file ${fileName} doesn't exist.")
    }
}

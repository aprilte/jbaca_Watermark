package watermark

import java.awt.image.BufferedImage
import java.io.File
import java.lang.Exception
import javax.imageio.ImageIO

fun main() {
    val ins = imgLoader()
    ins.inspect()
}

class imgLoader() {
    var fileName = ""
    var insarr = ArrayList<inspectImg>()

    init {
        println("Input the image filename:")
        fileName = readln()
    }

    fun inspect() {
        val filePath = System.getProperty("user.dir") + "\\" + fileName
        if (File(filePath).exists()) {
            val inspecter = inspectImg(fileName, filePath)
            inspecter.doInspect()
            insarr.add(inspecter)
        } else {
            println("The file ${fileName} doesn't exist.")
        }
    }

}

class inspectImg(val fileName: String, val path: String) {
    val imageFile = File(path)

    fun doInspect() {
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
                when (image.transparency) {
                    1, -> "OPAQUE"
                    2, -> "BITMASK"
                    3, -> "TRANSLUCENT"
                    else -> "NONE"
                }
            )
        } catch (ex: Exception) {
            println("Oops, the file is lost at the moment.")
        }
    }

}
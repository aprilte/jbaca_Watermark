import java.awt.Color
import java.awt.image.BufferedImage

fun printColor(myImage: BufferedImage) {
    // Write your code here
    val (x, y) = readln().split(" ").map { it.toInt() }
    val rgba = Color(myImage.getRGB(x, y), true)
    myImage.set
    println("${rgba.red} ${rgba.green} ${rgba.blue} ${rgba.alpha}")
}
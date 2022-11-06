import java.awt.Color
import java.awt.image.BufferedImage

//import java.io.File
//import javax.imageio.ImageIO
//import kotlin.random.Random
//
//fun main(){
//    val image = drawCircles()
//    val imageFile = File("C:\\Users\\levia\\Desktop\\testImageCircR.png")
//
//    saveImage(image, imageFile)
//}
//
//fun saveImage(image: BufferedImage, imageFile: File) {
//    ImageIO.write(image, "png", imageFile)
//}


fun drawCircles(): BufferedImage {
    val WIDTH = 200
    val HEIGHT = 200
    val img = BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB)
    val graphics = img.createGraphics()
    graphics.color = Color.RED
    graphics.drawOval(50, 50, 100, 100)
    graphics.color = Color.YELLOW
    graphics.drawOval(50, 75, 100, 100)
    graphics.color = Color.GREEN
    graphics.drawOval(75, 50, 100, 100)
    graphics.color = Color.BLUE
    graphics.drawOval(75, 75, 100, 100)

    return img

}
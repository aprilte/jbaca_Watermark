import java.awt.Color
import java.awt.Graphics2D
import java.awt.image.BufferedImage
//import java.io.File
//import javax.imageio.ImageIO

//fun main(){
//    val image = drawPolygon()
//    val imageFile = File("C:\\Users\\levia\\Desktop\\testImage.png")
//
//    saveImage(image, imageFile)
//}
//
//fun saveImage(image: BufferedImage, imageFile: File) {
//    ImageIO.write(image, "png", imageFile)
//}


fun drawPolygon(): BufferedImage {
    // Add your code here
    val width = 300
    val height = 300
    val img = BufferedImage(width, height, BufferedImage.TYPE_INT_RGB)
    val graphics = img.createGraphics()
    var p1 = point(50, 150)
    var p2 = point(100, 250)
    var pp = LinePP(p1, p2)
    drawLineWithCol(graphics, Color.YELLOW, pp)
    pp.p1 = pp.p2
    pp.p2 = point(200, 250)
    drawLineWithCol(graphics, Color.YELLOW, pp)
    pp.p1 = pp.p2
    pp.p2 = point(250, 150)
    drawLineWithCol(graphics, Color.YELLOW, pp)
    pp.p1 = pp.p2
    pp.p2 = point(200, 50)
    drawLineWithCol(graphics, Color.YELLOW, pp)
    pp.p1 = pp.p2
    pp.p2 = point(100, 50)
    drawLineWithCol(graphics, Color.YELLOW, pp)
    pp.p1 = pp.p2
    pp.p2 = point(50, 150)
    drawLineWithCol(graphics, Color.YELLOW, pp)
    return img
}

fun drawLineWithCol(img: Graphics2D, col: Color, pp: LinePP) {
    img.color = col
    img.drawLine(pp.p1.x, pp.p1.y, pp.p2.x, pp.p2.y)
}

data class LinePP(var p1: point, var p2: point)
data class point(var x:Int, var y: Int)
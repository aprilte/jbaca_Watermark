import java.awt.Color
import java.awt.Graphics2D
import java.awt.image.BufferedImage

fun drawLines(): BufferedImage {
    // Add your code here
    val width = 200
    val height = 200
    val img = BufferedImage(width, height, BufferedImage.TYPE_INT_RGB)
    val graphics = img.createGraphics()
    val pp1 = LinePP(0, 0, 200, 200)
    val pp2 = LinePP(200, 0, 0, 200)
    drawLineWithCol(graphics, Color.RED, pp1)
    drawLineWithCol(graphics, Color.GREEN, pp2)
    return img
}

fun drawLineWithCol(img: Graphics2D, col: Color, pp: LinePP) {
    img.color = col
    img.drawLine(pp.x1, pp.y1, pp.x2, pp.y2)
}

data class LinePP(val x1: Int, val y1: Int, val x2: Int, val y2: Int)
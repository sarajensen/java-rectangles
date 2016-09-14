import java.util.ArrayList;
import java.util.List;

public class Rectangle {
  private int mLength;
  private int mWidth;
  private static List<Rectangle> instances = new ArrayList<Rectangle>();


  public Rectangle(int length, int width){
    mLength = length;
    mWidth = width;
    instances.add(this);
  }

  public int getLength() {
    return mLength;
  }

  public int getWidth() {
    return mWidth;
  }

  public static List<Rectangle> all() {
    return instances;
  }

  public boolean isSquare() {
    return mLength == mWidth;
  }

}

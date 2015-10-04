import java.util.Random;
public class Pi2{
  public static void main(String[] args){
    System.out.println("Pi");
    Random randomGenerator = new Random();
    int numOfPoints = 1000;
    int i = 0;
    int numOfCirclePoints = 0;
      while (i<numOfPoints) {
      float x= randomGenerator.nextFloat()*20f-10;
      float y= randomGenerator.nextFloat()*20f-10;
      float upBorder = (float)Math.sqrt(100-x*x);
      float downBorder = -(float)Math.sqrt(100-x*x);
      if (y<=upBorder && y>=downBorder) numOfCirclePoints +=1;
//      System.out.println(x+" "+y);
      i=i+1;
    }
    float pi = (float)numOfCirclePoints*4.f/numOfPoints;
    System.out.println("Pi = "+pi);
  } 
}

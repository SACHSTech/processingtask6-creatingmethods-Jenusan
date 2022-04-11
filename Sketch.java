import processing.core.PApplet;

public class Sketch extends PApplet {

  /**
   * Given the width of the rocket, users will be returned with the x and y values to input to have the rocket placed in the middle of the screen 
   * 
   * @param intRocketWidth inputs the width of the rocket 
   * @return X and Y positions to input to have rocket placed in middle of screen 
   */
  private int windowPosition(int intRocketWidth){
    int x = (width - intRocketWidth) / 2;
    System.out.print(x);
    return x;
  }

  /**
   * given the position and width of the moon, code will create a moon on the screen 
   * 
   * @param intPlanetPosX gathers input from user of where along x axis to place Planet
   * @param intPlanetPosY gathers input from user of where along x axis to place Planet 
   * @param intPlanetSize gathers input from user on how wide to make the Planet
   */
  private void planet(int intPlanetPosX, int intPlanetPosY, int intPlanetSize, int intRedValue, int intGreenValue, int intBlueValue){
    fill(intRedValue, intGreenValue, intBlueValue);
    ellipse(intPlanetPosX, intPlanetPosY, intPlanetSize, intPlanetSize);
  }

  /**
   * given perameters of a rocket ship, a rocket ship will be printed on the screen 
   * 
   * @param intRocketPosX gathers input from user of where along x axis to place ship
   * @param intRocketPosY gathers input from user of where along Y axis to place ship
   * @param intRocketWidth gathers input from user of how wide to make ship, then multiplies value by 3 for height of ship
   * @param intRedValue gathers input from user of intensity of gradient in color red
   * @param intGreenValue gathers input from user of intensity of gradient in color green
   * @param intBlueValue gathers input from user of intensity of gradient in color blue
   */
  private void rocket(int intRocketPosX, int intRocketPosY, int intRocketWidth, int intRedValue, int intGreenValue, int intBlueValue){
    noStroke();
    fill(intRedValue, intGreenValue, intBlueValue);
    rect(intRocketPosX, intRocketPosY, intRocketWidth, intRocketWidth * 3);
    triangle(intRocketPosX, intRocketPosY, intRocketPosX + intRocketWidth, intRocketPosY, intRocketPosX + (intRocketWidth / 2 ), intRocketPosY - (intRocketWidth / 2));
    triangle(intRocketPosX, (intRocketPosY + (intRocketWidth * 3)), intRocketPosX, (intRocketPosY + (intRocketWidth * 2)), intRocketPosX - (intRocketWidth / 3) , (intRocketPosY + (intRocketWidth * 3)));
    triangle(intRocketPosX + intRocketWidth, (intRocketPosY + (intRocketWidth * 3)), intRocketPosX + intRocketWidth, (intRocketPosY + (intRocketWidth * 2)), intRocketPosX + intRocketWidth + (intRocketWidth / 3) , (intRocketPosY + (intRocketWidth * 3)));
    
    fill(255,255,255);
    ellipse(intRocketPosX + (intRocketWidth / 2 ), intRocketPosY + (intRocketWidth / 2), intRocketWidth / 2, intRocketWidth / 2);

    fill(255,153,0);
    triangle(intRocketPosX + intRocketWidth, intRocketPosY + (intRocketWidth * 3), intRocketPosX, intRocketPosY + (intRocketWidth * 3),  intRocketPosX + (intRocketWidth / 2 ), intRocketPosY + (intRocketWidth * 3) + intRocketWidth);
  }


	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(800, 800);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(20, 20, 20);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    // calls method for planets (max value of 800 along all perameters)
    planet(600, 80, 100, 255, 0, 0);
    planet(500, 700, 100, 0, 0, 255);
    planet(300, 80, 100, 0, 255, 0);

    // calls method for rocket (max value of 800 for position) (max value of 150 for width) (max value of 255 for colors)
    rocket(300, 120, 100, 255, 102, 0);
    rocket(600, 360, 80, 0, 102, 0);
    rocket(100, 300, 40, 0, 102, 255);

    // calls method for rocket to find optimal equal X and Y position to place in middle of screen (max value of 150)
    windowPosition(80);

  }
  
  // define other methods down here.
}
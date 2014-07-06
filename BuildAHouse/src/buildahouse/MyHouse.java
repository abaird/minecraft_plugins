/***
 * Excerpted from "Learn to Program with Minecraft Plugins",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/ahmine for more book information.
***/
package buildahouse;
public class MyHouse {
  public static void build_me() {
    // Declare width
    int width = 5;
    // Set width to the number of blocks
    // Declare height
    int height = 10;
    // Set height to the number of blocks
    for(int i = 0; i < 10; i++){
    	BuildAHouse.buildMyHouse(width, height);
    }
  }
}

public class Button implements GUIElementExtended {
    @Override
    public void draw() {
        // Implement how a button is drawn on the screen
        System.out.println("Drawing a button");
    }

    @Override
    public void onClick() {
        // Implement what happens when the button is clicked
        System.out.println("Button clicked");
    }

    @Override
    public void onHover() {
        // Implement what happens when the mouse hovers over the button
        System.out.println("Mouse hovering over button");
    }
    public void onMove(){
        System.out.println("Button moved");
    }
}
public class TextField implements GUIElement {
    @Override
    public void draw() {
        // Implement how a text field is drawn on the screen
        System.out.println("Drawing a text field");
    }

    @Override
    public void onClick() {
        // Implement what happens when the text field is clicked
        System.out.println("Text field clicked");
    }

    @Override
    public void onHover() {
        // Implement what happens when the mouse hovers over the text field
        System.out.println("Mouse hovering over text field");
    }
}
// Define the Resizable interface
interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

// Implement the Rectangle class
class Rectangle implements Resizable {
    private int width;
    private int height;

    public Rectangle(int initialWidth, int initialHeight) {
        this.width = initialWidth;
        this.height = initialHeight;
    }

    @Override
    public void resizeWidth(int newWidth) {
        if (newWidth > 0) {
            this.width = newWidth;
            System.out.println("Resized width to: " + newWidth);
        } 
	else {
            System.out.println("Invalid width value.");
        }
    }

    @Override
    public void resizeHeight(int newHeight) {
        if (newHeight > 0) {
            this.height = newHeight;
            System.out.println("Resized height to: " + newHeight);
        } 
	else {
            System.out.println("Invalid height value.");
        }
    }

    public void printSize() {
        System.out.println("Rectangle size: " + width + " x " + height);
    }
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        rectangle.printSize();

        rectangle.resizeWidth(15);
        rectangle.resizeHeight(25);
        rectangle.printSize();
    }
}


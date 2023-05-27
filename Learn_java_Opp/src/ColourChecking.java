import java.awt.Color;

    public class ColourChecking {
        public static void main(String[] args) {
            int red = 193;
            int green = 255;
            int blue = 183;

            // Create a Color object with the given RGB values
            Color color = new Color(red, green, blue);

            // Separate the RGB values
            int r = color.getRed();
            int g = color.getGreen();
            int b = color.getBlue();

            // Calculate the Hue, Saturation, and Brightness
            float[] hsb = Color.RGBtoHSB(r, g, b, null);
            float hue = hsb[0];
            float saturation = hsb[1];
            float brightness = hsb[2];

            // Print the results
            System.out.println("RGB values: R=" + r + ", G=" + g + ", B=" + b);
            System.out.println("Hue: " + hue);
            System.out.println("Saturation: " + saturation);
            System.out.println("Brightness: " + brightness);
        }
    }

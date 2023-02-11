package java_learn_daffodil_university;


    public class Box_assignment {
        static int height,width, length;
        static int area(int height, int width) {  //1st method declare Area calculate here..........
            return height * width;
        }

        static int area2(int height, int width, int length) { //2nd method declare calculate here..........
            return height * width * length;

        }

        static int display() {                         //3rd  method declare here only print vale..........
            System.out.println(height);
            System.out.println(width);
            System.out.println(length);

            return 0;
        }
        public static void main(String[] args) {
            Box_assignment box = new Box_assignment();
            box.height = 221;
            box.width = 15;
            box.length = 5915;
            display();  // Display method declare and print vale all......


    }
    }




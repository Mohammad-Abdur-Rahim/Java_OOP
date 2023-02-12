package java_learn_daffodil_university;


    public class Box_assignment {
        static int height,width, length;


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




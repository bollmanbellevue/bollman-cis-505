/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by J. Bollman 2022
 */

public class ProductDB {

    /** 
     * @param code - The type of product to return.
     * @return GenericQueue<Product> - A list of products.
     */
    public static GenericQueue<Product> getProducts(String code) {
        // Check the input code for product type.
        if (code.equals("b")) { // Product is Ball
            // Initialize a GenericQueue object with type Product.
            GenericQueue<Product> queue = new GenericQueue<Product>();

            // Ball 1
            Ball ball1 = new Ball();
            ball1.setCode("B100");
            ball1.setDescription("Black Widow 2.0");
            ball1.setPrice(144.95);
            ball1.setColor("Black and Red");
            queue.enqueue(ball1);

            // Ball 2
            Ball ball2 = new Ball();
            ball2.setCode("B200");
            ball2.setDescription("Axiom Pearl");
            ball2.setPrice(154.95);
            ball2.setColor("Blue and Red");
            queue.enqueue(ball2);

            // Ball 3
            Ball ball3 = new Ball();
            ball3.setCode("B300");
            ball3.setDescription("Proton Physix");
            ball3.setPrice(174.95);
            ball3.setColor("Pink and Purple");
            queue.enqueue(ball3);

            // Ball 4
            Ball ball4 = new Ball();
            ball4.setCode("B400");
            ball4.setDescription("Force Unleashed");
            ball4.setPrice(139.99);
            ball4.setColor("Red and White");
            queue.enqueue(ball4);

            // Ball 5
            Ball ball5 = new Ball();
            ball5.setCode("B500");
            ball5.setDescription("Phase III");
            ball5.setPrice(154.99);
            ball5.setColor("Purple and Green");
            queue.enqueue(ball5);

            // Return Ball Queue
            return queue;
        } else if (code.equals("s")) { // Product is Shoe
            // Initialize a GenericQueue object with type Product.
            GenericQueue<Product> queue = new GenericQueue<Product>();

            // Shoe 1
            Shoe shoe1 = new Shoe();
            shoe1.setCode("S100");
            shoe1.setDescription("Men's Ram Black");
            shoe1.setPrice(39.99);
            shoe1.setSize(10.5);
            queue.enqueue(shoe1);

            // Shoe 2
            Shoe shoe2 = new Shoe();
            shoe2.setCode("S200");
            shoe2.setDescription("Women's Rise Black/Hot Pink");
            shoe2.setPrice(39.99);
            shoe2.setSize(7.0);
            queue.enqueue(shoe2);

            // Shoe 3
            Shoe shoe3 = new Shoe();
            shoe3.setCode("S300");
            shoe3.setDescription("Women's Path Lite Seamless Mesh");
            shoe3.setPrice(54.99);
            shoe3.setSize(6.0);
            queue.enqueue(shoe3);

            // Shoe 4
            Shoe shoe4 = new Shoe();
            shoe4.setCode("S400");
            shoe4.setDescription("Men's Tribal White");
            shoe4.setPrice(26.99);
            shoe4.setSize(8.5);
            queue.enqueue(shoe4);

            // Shoe 5
            Shoe shoe5 = new Shoe();
            shoe5.setCode("S500");
            shoe5.setDescription("Youth Skull Green/Black");
            shoe5.setPrice(39.99);
            shoe5.setSize(3.0);
            queue.enqueue(shoe5);

            // Return Shoe Queue
            return queue;
        } else if (code.equals("a")) { // Product is Bag
            // Initialize a GenericQueue object with type Product.
            GenericQueue<Product> queue = new GenericQueue<Product>();

            // Bag 1
            Bag bag1 = new Bag();
            bag1.setCode("A100");
            bag1.setDescription("Path Pro Deluxe");
            bag1.setPrice(34.99);
            bag1.setType("Single");
            queue.enqueue(bag1);

            // Bag 2
            Bag bag2 = new Bag();
            bag2.setCode("A200");
            bag2.setDescription("Prime Roller Black/Royal Blue");
            bag2.setPrice(54.99);
            bag2.setType("Double");
            queue.enqueue(bag2);

            // Bag 3
            Bag bag3 = new Bag();
            bag3.setCode("A300");
            bag3.setDescription("Silver/Royal Blue");
            bag3.setPrice(74.99);
            bag3.setType("Triple");
            queue.enqueue(bag3);

            // Return Bag Queue
            return queue;
        } else {// The code does not match any products.
            // Return an empty queue.
            return new GenericQueue<Product>();
        }
    }
}

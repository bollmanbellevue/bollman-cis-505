public class ProductDB {
    public static GenericQueue<Product> getProducts(String code) {
        if (code.equals("b")) {
            GenericQueue<Product> queue = new GenericQueue<Product>();

            for (int index = 1; index <= 5; index++) {
                Ball ball = new Ball();
                ball.setCode(String.format("Bl%d", index));
                ball.setDescription(String.format("Ball %d", index));
                ball.setPrice(index * 10);

                int color = index * 10;
                ball.setColor(String.format("RGB(%d,%d,%d)", color, color, color));

                queue.enqueue(ball);
            }

            return queue;
        } else if (code.equals("s")) {
            GenericQueue<Product> queue = new GenericQueue<Product>();

            for (int index = 1; index <= 5; index++) {
                Shoe shoe = new Shoe();
                shoe.setCode(String.format("S%d", index));
                shoe.setDescription(String.format("Shoe %d", index));
                shoe.setPrice(index * 10);
                shoe.setSize(index);

                queue.enqueue(shoe);
            }

            return queue;
        } else if (code.equals("a")) {
            GenericQueue<Product> queue = new GenericQueue<Product>();

            for (int index = 1; index <= 3; index++) {
                Bag shoe = new Bag();
                shoe.setCode(String.format("Bg%d", index));
                shoe.setDescription(String.format("Bag %d", index));
                shoe.setPrice(index * 10);
                shoe.setType(String.format("Type %d", index));

                queue.enqueue(shoe);
            }

            return queue;
        }

        return new GenericQueue<Product>();
    }
}

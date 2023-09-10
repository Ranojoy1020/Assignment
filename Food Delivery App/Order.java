public class Order {
    String food;
    int price;
    int quantity;
    double distance;

    Order(String $item, int $price, int $quantity, double $dist) {
        food = $item;
        price = $price;
        quantity = $quantity;
        distance = $dist;
    }

    double makeBill() {
        int pre_total = price * quantity;
        double delCharge = 0;
        double total;

        if (200 < pre_total && pre_total <= 500) {

            if (0 < distance && distance <= 3.00) {
                delCharge = 40;
            } else if (5.01 < distance && distance <= 10.00) {
                delCharge = 100;
            } else if (10.01 < distance && distance <= 15.00) {
                delCharge = 150;
            } else if (15.01 < distance && distance <= 20.00) {
                delCharge = 200;
            } else if (20.01 < distance && distance <= 25.00) {
                delCharge = 250;
            } else if (25.01 < distance && distance <= 99.00) {
                delCharge = 300;
            }
        } else if (501 < pre_total && pre_total <= 1000) {

             if (5.01 < distance && distance <= 10.00) {
                delCharge = 50;
            } else if (10.01 < distance && distance <= 15.00) {
                delCharge = 100;
            } else if (15.01 < distance && distance <= 20.00) {
                delCharge = 150;
            } else if (20.01 < distance && distance <= 25.00) {
                delCharge = 200;
            } else if (25.01 < distance && distance <= 99.00) {
                delCharge = 250;
            }
        } else if (1001 < pre_total && pre_total <= 1500) {

            if (10.01 < distance && distance < 15.00) {
                delCharge = 50;
            } else if (15.01 < distance && distance <= 20.00) {
                delCharge = 10;
            } else if (20.01 < distance && distance <= 25.00) {
                delCharge = 150;
            } else if (25.01 < distance && distance <= 99.00) {
                delCharge = 200;
            }
        } else if (1501 < pre_total && pre_total <= 2000) {
            if (15.01 < distance && distance <= 20.00) {
                delCharge = 50;
            } else if (20.01 < distance && distance <= 25.00) {
                delCharge = 100;
            } else if (25.01 < distance && distance <= 99.00) {
                delCharge = 150;
            }
        } else if (2001 < pre_total && pre_total <= 2500) {

            if (20.01 < distance && distance <= 25.00) {
                delCharge = 50;
            } else if (25.01 < distance && distance <= 99.00) {
                delCharge = 100;
            }
        } else if (2501 < pre_total && pre_total <= 3000) {
            if (25.01 < distance && distance <= 99.00) {
                delCharge = 50;
            }
        } else if (3001 < pre_total) {
            delCharge = 0;
        }
    

        total = pre_total + delCharge;

        return total;
    }
}
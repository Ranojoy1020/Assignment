public class Order {
    String item;
    int price;
    int quantity;
    double distance;

    Order(String item, int price, int quantity, double dist) {
        this.item = item;
        this.price = price;
        this.quantity = quantity;
        this.distance = dist;
    }

    double makeBill() {
        int sub_total = this.price * this.quantity;
        double delCharge = 0;
        double total;

        if (200 < sub_total && sub_total <= 500) {

            if (0 < this.distance && this.distance <= 3.00) {
                delCharge = 40;
            } else if (5.01 < this.distance && this.distance <= 10.00) {
                delCharge = 100;
            } else if (10.01 < this.distance && this.distance <= 15.00) {
                delCharge = 150;
            } else if (15.01 < this.distance && this.distance <= 20.00) {
                delCharge = 200;
            } else if (20.01 < this.distance && this.distance <= 25.00) {
                delCharge = 250;
            } else if (25.01 < this.distance && this.distance <= 99.00) {
                delCharge = 300;
            }
        } else if (501 < sub_total && sub_total <= 1000) {

             if (5.01 < this.distance && this.distance <= 10.00) {
                delCharge = 50;
            } else if (10.01 < this.distance && this.distance <= 15.00) {
                delCharge = 100;
            } else if (15.01 < this.distance && this.distance <= 20.00) {
                delCharge = 150;
            } else if (20.01 < this.distance && this.distance <= 25.00) {
                delCharge = 200;
            } else if (25.01 < this.distance && this.distance <= 99.00) {
                delCharge = 250;
            }
        } else if (1001 < sub_total && sub_total <= 1500) {

            if (10.01 < this.distance && this.distance < 15.00) {
                delCharge = 50;
            } else if (15.01 < this.distance && this.distance <= 20.00) {
                delCharge = 10;
            } else if (20.01 < this.distance && this.distance <= 25.00) {
                delCharge = 150;
            } else if (25.01 < this.distance && this.distance <= 99.00) {
                delCharge = 200;
            }
        } else if (1501 < sub_total && sub_total <= 2000) {
            if (15.01 < this.distance && this.distance <= 20.00) {
                delCharge = 50;
            } else if (20.01 < this.distance && this.distance <= 25.00) {
                delCharge = 100;
            } else if (25.01 < this.distance && this.distance <= 99.00) {
                delCharge = 150;
            }
        } else if (2001 < sub_total && sub_total <= 2500) {

            if (20.01 < this.distance && this.distance <= 25.00) {
                delCharge = 50;
            } else if (25.01 < this.distance && this.distance <= 99.00) {
                delCharge = 100;
            }
        } else if (2501 < sub_total && sub_total <= 3000) {
            if (25.01 < this.distance && this.distance <= 99.00) {
                delCharge = 50;
            }
        } else if (3001 < sub_total) {
            delCharge = 0;
        }
    

        total = sub_total + delCharge;

        return total;
    }
}
public class Queue {
    int length, size;
    Customer[] test;
    Customer bottom, top ;

    public Queue(int size) {
        this.size = size;
        test = new Customer[size];
    }

    public void Print() {
        for (int i = 0; i < length; i++) {
            System.out.print(test[i] + "");

        }
    }

    public void Enqueue(Customer value) {
        if (length == size) {
            if (top == null) {
            test = new Customer[1];
            test[0] =  value;
            top = test[0];
            bottom = test[0];
            length++;
            size++;
                return;
            }
            Customer[] newTest = new Customer[size + 1];
            for (int i = 0; i < size; i++) {
                newTest[i] = test[i];
            }
            test = newTest;
            test [length] = value;
            bottom = test [length];
            size++;
            length++;

        } else {
            test[length] = value;
            bottom = test[length];
            length++;
        }
    }

    public boolean Dequeue() {
        if (length == 0) {
            return false;
        } else {
            top = test[1];
            length--;
            return true;
        }
    }

}
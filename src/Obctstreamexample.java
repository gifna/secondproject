import java.io.ObjectStreamClass;
import java.io.ObjectStreamField;

class SmartPhone {
    int price;
    double model;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getModel() { // Change to double to match the field type
        return model;
    }

    public void setModel(double model) { // Change to double to match the field type
        this.model = model;
    }
}





public class Obctstreamexample {

	public static void main(String[] args) {
		

        ObjectStreamClass osc = ObjectStreamClass.lookup(SmartPhone.class);
        
        if (osc != null) {
            // Check if the field exists and print its details
            ObjectStreamField field = osc.getField("model");
            if (field != null) {
                System.out.println("model field: " + field);
            } else {
                System.out.println("Field 'model' not found.");
            }
        } else {
            System.out.println("ObjectStreamClass for SmartPhone is null.");
        }
    }
}
package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import org.jetbrains.annotations.TestOnly;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getHeight() >= 145 && visitor.getAge() >= 12;
    }


    @Override
    public double defaultPrice() {
        return 8.40;
    }


    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() >= 200) {
            return defaultPrice() * 2.0;
        }
        return defaultPrice();
    }
}

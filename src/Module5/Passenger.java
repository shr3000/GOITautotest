package Module5;

/*
Сделай два класса, каждый из которых унаследуется от класса Passenger. В каждом классе реализуй методы String getType()
и int getTicketPrice().
Первый класс должен называться RegularPassenger. У этого класса метод getType() должен возвращать строку "Regular",
метод getTicketPrice() возвращать число 199.
Второй класс должен называться VIPPassenger. Метод getType() этого класса должен возвращать строку "VIP", метод
getTicketPrice() - возвращать число 399.
 */

abstract class Passenger {
    public abstract String getType();

    public abstract int getTicketPrice();
}

class RegularPassenger extends Passenger {

    @Override
    public String getType() {
        return "Regular";
    }

    @Override
    public int getTicketPrice() {
        return 199;
    }
}

class VIPPassenger extends Passenger {

    @Override
    public String getType() {
        return "VIP";
    }

    @Override
    public int getTicketPrice() {
        return 399;
    }
}

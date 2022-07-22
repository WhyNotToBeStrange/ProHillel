package Home6;

class Car {
    String brand;
    String model;
    String color;
    int price;
    int year;
    int registerNumber;

    public Car(String brand, String model, String color, int price, int year, int registerNumber) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.year = year;
        this.registerNumber = registerNumber;
    }
}

class CarProcessor {
    Car[] auto;

    CarProcessor() {
        this.auto = new Car[]{};
    }

    public CarProcessor(Car[] auto) {
        this.auto = auto;
    }

    void show2(Car car) {
        System.out.print("This Car: ");
        System.out.print(" Brand-" + car.brand);
        System.out.print(" Model-" + car.model);
        System.out.print(" Year-" + car.year);
        System.out.print(" Color-" + car.color);
        System.out.print(" Price-" + car.price);
        System.out.print(" RegisterNumber-" + car.registerNumber);
        System.out.println(" ");

    }


    void chekBrand(Car[] auto, String brand) {
        for (int i = 0; i < auto.length; i++) {
            Car car = auto[i];
            if (brand == car.brand) {
                show2(car);
            }

        }
    }

    void chekBrand(String brand) {
        if (auto.length != 0) {
            for (int i = 0; i < auto.length; i++) {
                Car car = auto[i];
                if (brand == car.brand) {
                    show2(car);
                }

            }
        }
    }

    void chekModelAndYeat(Car[] auto, String model, int thisYear, int explotateYears) {
        for (int i = 0; i < auto.length; i++) {
            Car car = auto[i];
            if (model == car.model && (thisYear - explotateYears) < car.year) {
                show2(car);

            }
        }
    }

    void chekModelAndYeat(String model, int thisYear, int explotateYears) {
        if (auto.length != 0) {
            for (int i = 0; i < auto.length; i++) {
                Car car = auto[i];
                if (model == car.model && (thisYear - explotateYears) < car.year) {
                    show2(car);

                }
            }
        }
    }

    void chekYearAndPrice(Car[] auto, int year, int minPrice) {
        for (int i = 0; i < auto.length; i++) {
            Car car = auto[i];
            if (year == car.year && (car.price > minPrice)) {
                show2(car);
            }
        }
    }

    void chekYearAndPrice(int year, int minPrice) {
        if (auto.length != 0) {
            for (int i = 0; i < auto.length; i++) {
                Car car = auto[i];
                if (year == car.year && (car.price > minPrice)) {
                    show2(car);
                }
            }
        }
    }

}

public class Runner2 {
    public static void main(String[] args) {
        CarProcessor firstProcessor = new CarProcessor();
        Car[] auto = {new Car("Mersedes", "CLS", "Black", 60000, 2018, 345133),
                new Car("Lexus", "RX8", "Black", 70000, 2017, 148153),
                new Car("Tesla", "S", "White", 30000, 2018, 123444),
                new Car("Mersedes", "G63", "Grey", 80000, 2019, 976689),
                new Car("Audi", "R8V10", "Black", 75000, 2018, 656092)
        };

        firstProcessor.chekBrand(auto, "Mersedes");
        firstProcessor.chekYearAndPrice(auto, 2018, 35000);
        firstProcessor.chekModelAndYeat(auto, "RX8", 2022, 6);

        CarProcessor secondProcessor = new CarProcessor();
        secondProcessor.chekBrand(auto, "Tesla");
        secondProcessor.chekYearAndPrice(auto, 2019, 35000);
        secondProcessor.chekModelAndYeat(auto, "RX8", 2022, 6);

    }
}

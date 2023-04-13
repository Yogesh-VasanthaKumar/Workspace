# Car Service Station Software

This Java-based software is designed for a car service station that caters to different types of cars, including Hatchback, Sedan, and SUV. It provides various services like Basic Service, Engine Fixing, Clutch Fixing, Gear Fixing, and Brake Fixing. The software is developed using Object Oriented Programming (OOP) concepts for efficient and modular code organization.

## Classes and Their Functionality

The software includes the following classes:

### Service Class
The `Service` class represents a service and has the following attributes:

- `car`: The type of the car (Hatchback, Sedan, SUV)
- `service`: The service code associated with the car's service
- `price`: The price of the service for the car type

The `Service` class has the following methods:

- `Service(int serviceCode, String serviceName, Map<String, Double> carTypePrices)`: Initializes a new `Service` object with the given service code, service name, and car type prices.
- `getPrice(String carType)`: Returns the price of the service for the given car type.

### ServiceStation Class
The `ServiceStation` class represents the car service station and has the following attributes:

- `services`: A list of `Service` objects representing the services offered by the station

The `ServiceStation` class has the following methods:

- `ServiceStation(List<Service> services)`: Initializes a new `ServiceStation` object with the given list of `Service` objects.
- `getServicePrice(int serviceCode, String carType)`: Returns the price of the service for the given service code and car type.

## Usage
1. Create `Service` objects for each service offered by the car service station, specifying the service name, and car type prices.
2. Create a `ServiceStation` object, passing in the list of `Service` objects created in step 1.
3. Use the `getPrice()` method of the `ServiceStation` class to get the price of a service for a specific service code and car type.


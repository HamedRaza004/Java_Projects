import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

class Car {
    @JsonField("car_make")
    private final String make;

    @JsonField("car_model")
    private final String model;

    @JsonField("car_year")
    private final int year;

    // This field will be ignored by our simple serializer because it lacks the @JsonField annotation
    private final String color;

    public Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }
}

public class Question26 {

    public static String toJson(Object object) throws IllegalAccessException {
        Map<String, String> jsonElements = new HashMap<>();
        for (Field field : object.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(JsonField.class)) {
                field.setAccessible(true);
                JsonField jsonField = field.getAnnotation(JsonField.class);
                jsonElements.put(jsonField.value(), field.get(object).toString());
            }
        }

        String jsonString = jsonElements.entrySet()
                .stream()
                .map(entry -> "\"" + entry.getKey() + "\":\"" + entry.getValue() + "\"")
                .collect(Collectors.joining(","));

        return "{" + jsonString + "}";
    }

    public static void main(String[] args) throws IllegalAccessException {
        System.out.println("Demonstrating the use of the @JsonField annotation for serialization.");
        Car car = new Car("Ford", "Mustang", 1969, "Red");
        String json = toJson(car);
        System.out.println("Serialized Car object: " + json);
    }
}

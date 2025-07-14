package Vehicle;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)  // Available at runtime
@Target(ElementType.FIELD)           // Applicable to fields only
public @interface VehicleInfo {
    String value() default "";
}


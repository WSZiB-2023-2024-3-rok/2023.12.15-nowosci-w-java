package pl.edu.wzsib.nowosci.w.java.lombok;

import lombok.*;
import lombok.experimental.Accessors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Accessors(fluent = true)
@Builder
public class Car {
    private String brand;
    private String model;
    private int price;
}

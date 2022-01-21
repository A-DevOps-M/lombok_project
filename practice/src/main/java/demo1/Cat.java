package demo1;

import lombok.*;

/*
@Data: dit vertegenwoordigt alle onderstaande annotaties
 */
@Setter
@Getter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Cat {

    private String name;
    private float weight;
    private int age;
}

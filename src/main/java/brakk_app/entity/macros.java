package brakk_app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document (collection = "macros")

public class macros {
    private Double calories;
    private Double protein;
    private Double carbs;
    private Double fats;
    private Double sugars;
    private Double sodium;
    private Double saturatedFats;
    private Double cholesterol;
    private Double potatoes;
    private Double calcium;
    private Double fiber;
    private Double  iron;


}

package co.bases.datos.proyectofinalbd.model;


import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Category {

    private int id;
    private String categoryName;
    private double iva;
    private double profitMargin;


}

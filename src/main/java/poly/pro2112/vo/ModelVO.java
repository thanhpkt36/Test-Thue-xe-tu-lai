package poly.pro2112.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModelVO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String model_name;
    private BrandVO brand;
}

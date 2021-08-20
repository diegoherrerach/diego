package ws.synopsis.training.rest2.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class CountryRequest implements Serializable {
    private String name;
    private String capital;
}

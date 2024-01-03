package med.voll.api.address;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Address {
    private String street;
    private String neighborhood;
    private String zipcode;
    private String city;
    private String state;
    private String complement;
    private String number;

    public Address(CreateAddressData address) {
        this.street = address.street();
        this.city = address.city();
        this.zipcode = address.zipcode();
        this.number = address.number();
        this.neighborhood = address.neighborhood();
        this.state = address.state();
        this.complement = address.complement();
    }
}

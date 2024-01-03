package med.voll.api.address;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Length;

public record CreateAddressData(
        @NotBlank
        String street,
        @NotBlank
        String neighborhood,
        @Pattern(regexp = "\\d{8}")
        String zipcode,
        @NotBlank
        String city,
        @Length(min = 2, max = 2)
        String state,
        String complement,
        String number
) { }

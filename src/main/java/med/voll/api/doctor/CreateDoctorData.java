package med.voll.api.doctor;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import med.voll.api.address.CreateAddressData;
import org.hibernate.validator.constraints.Length;

public record CreateDoctorData(
        @NotBlank
        String name,
        @NotBlank
        @Email
        String email,
        @NotBlank
        @Length(min = 6)
        String identification,
        @NotNull
        Specialization specialization,
        @NotNull
        @Valid
        CreateAddressData address
) { }

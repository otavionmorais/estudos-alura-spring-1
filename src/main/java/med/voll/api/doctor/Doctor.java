package med.voll.api.doctor;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.address.Address;

@Table(name = "doctors")
@Entity(name = "Doctor")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    private String phone;
    private String identification;
    @Enumerated(EnumType.STRING)
    private Specialization specialization;
    @Embedded
    private Address address;

    public Doctor(CreateDoctorData data) {
        this.name = data.name();
        this.email = data.email();
        this.phone = data.phone();
        this.identification = data.identification();
        this.specialization = data.specialization();
        this.address = new Address(data.address());
    }
}

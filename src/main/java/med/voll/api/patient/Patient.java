package med.voll.api.patient;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.address.Address;

@Getter
@EqualsAndHashCode(of = "id") @NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Patient") @Table(name = "patients")
public class Patient {
     @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     private String name;
     private String email;
     private String document;
     private String phone;
     @Embedded private Address address;
     public Patient(CreatePatientData data) {
         this.name = data.name();
         this.email = data.email();
         this.phone = data.phone();
         this.document = data.document();
         this.address = new Address(data.address());
     }
}


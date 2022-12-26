package tn.esprit.DAO.Entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter

@NoArgsConstructor
@AllArgsConstructor
@Builder

@FieldDefaults(level = AccessLevel.PRIVATE) //mets tous les attributs de la classe en private

public class Film implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String nom;

    @Enumerated(EnumType.STRING) //comment l'écrire dans la base
    TypeFilm type;

    @Temporal(TemporalType.DATE) //
    Date dateProduction;
}

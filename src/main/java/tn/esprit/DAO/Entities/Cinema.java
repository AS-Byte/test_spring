package tn.esprit.DAO.Entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter

@NoArgsConstructor
@AllArgsConstructor
@Builder

@FieldDefaults(level = AccessLevel.PRIVATE) //mets tous les attributs de la classe en private
public class Cinema implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String nom;

    @Column(length = 50) // controle de saisie sur la longueur
    String adresse;

    @Column(unique = true) // Unicité dans la base
    Integer telephone;

    @OneToMany (mappedBy = "cinema") //nom du child chez le parent
    List<Salle> salles;


}

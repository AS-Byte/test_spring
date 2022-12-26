package tn.esprit.Services;

import tn.esprit.DAO.Entities.Cinema;

import java.util.List;

public interface IServices {
    Cinema addAndUpdateCinema(Cinema c);
    List<Cinema> addAndUpdateCinemas(List <Cinema> listecinetoadd);
    void deleteCinema(Cinema c);
    List<Cinema> findAllCinema();
    Cinema findCinemaById (Long id);

    //Afficher liste cinema dont le nom contient le string en param

    List<Cinema> getCinemaByNom(String nom);
    List<Cinema> getCinemaByAdresse(String adresse);

}

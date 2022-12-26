package tn.esprit.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.DAO.Entities.Cinema;
import tn.esprit.DAO.Repositories.RepoCinema;
import tn.esprit.DAO.Repositories.RepoFilm;
import tn.esprit.DAO.Repositories.RepoSalle;

import java.util.List;

@Service // pour dire au spring IOC que c'est un bean afin de dynamiser l'instanciation
public class Sevices implements IServices{

    @Autowired //afin de pouvoir injecter les beans dann d'autres
    RepoCinema repcinema;

    @Autowired
    RepoFilm repfilm;

    @Autowired
    RepoSalle repsalle;


    @Override
    public Cinema addAndUpdateCinema(Cinema c) {
        return repcinema.save(c);

    }

    @Override
    public List<Cinema> addAndUpdateCinemas(List<Cinema> listecinetoadd) {
        return (List<Cinema>) repcinema.saveAll(listecinetoadd);
    }

    @Override
    public void deleteCinema(Cinema c) {
        repcinema.delete(c);
    }

    @Override
    public List<Cinema> findAllCinema() {
        return (List<Cinema>) repcinema.findAll();
    }

    @Override
    public Cinema findCinemaById(Long id) {
        return repcinema.findById(id).get();
    }

    @Override
    public List<Cinema> getCinemaByNom(String nom) {
        return repcinema.getByNomContains(nom);
    }

    @Override
    public List<Cinema> getCinemaByAdresse(String adresse) {
        return repcinema.retrieveCinemaByAdresseSQL(adresse);
    }




}

package tn.esprit.Service;

import tn.esprit.repository.PiloteRepository;
import tn.esprit.entities.Pilote;

public class PiloteService implements IPiloteService {

    PiloteRepository pr;

    @Override
    public String addPilote(Pilote p) {
        pr.save(p);
        return "Pilote ajouté avec succès";
    }
}

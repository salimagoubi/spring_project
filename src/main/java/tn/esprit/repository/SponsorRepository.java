package tn.esprit.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.entities.Sponsor;

public interface SponsorRepository extends CrudRepository<Sponsor, Long> {

}

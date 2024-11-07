package sn.maladie.dm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import sn.maladie.dm.entity.Medecin;
@RepositoryRestResource

public interface MedecinRepos extends JpaRepository<Medecin, Long> {

}

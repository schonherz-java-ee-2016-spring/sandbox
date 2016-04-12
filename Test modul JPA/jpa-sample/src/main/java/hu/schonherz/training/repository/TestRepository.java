package hu.schonherz.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import hu.schonherz.training.entity.Test;

@Repository
@Transactional(propagation = Propagation.SUPPORTS)
public interface TestRepository extends JpaRepository<Test, Long> {

}

package hu.schonherz.training.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import hu.schonherz.training.exam.entity.Exam;

@Repository
@Transactional(propagation = Propagation.SUPPORTS)
public interface ExamRepository extends JpaRepository<Exam, Long> {

}

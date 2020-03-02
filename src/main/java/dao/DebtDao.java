package dao;

import entity.Debt;
import entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface DebtDao extends CrudRepository<Debt, Long> {

    List<Debt> findAllByPayedForInOrPayedByIn(Set<User> payedFor, Set<User> payedBy);

}
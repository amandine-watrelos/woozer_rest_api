package service;

import entity.Debt;

import java.util.List;

public interface DebtService {

    List<Debt> findAllInGroup(Long groupId);

    List<Debt> findAllByUser(Long userId);

    Debt save(Debt debt);

    Debt acknowledge(Long debtId);

}

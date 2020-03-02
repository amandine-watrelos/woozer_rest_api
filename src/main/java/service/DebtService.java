package service;

import entity.Debt;

import java.util.List;

public interface DebtService {

    List<Debt> findAllInGroup(Long groupId);

}

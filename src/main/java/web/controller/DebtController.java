package web.controller;

import entity.Debt;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.DebtService;

import java.util.List;

@RestController
@RequestMapping(path = "/debt")
@Slf4j
public class DebtController {

    @Autowired
    private DebtService debtService;

    @GetMapping(path="list/{groupId}")
    public List<Debt> getByGroup(@PathVariable Long groupId){
        log.info("Récupération des dettes du groupe d'id {}", groupId);
        return debtService.findAllInGroup(groupId);
    }

}

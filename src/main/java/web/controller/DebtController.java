package web.controller;

import entity.Debt;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.DebtService;

import java.util.List;

@RestController
@RequestMapping(path = "/debt")
@Slf4j
public class DebtController {

    @Autowired
    private DebtService debtService;

    @GetMapping(path="list/group/{groupId}")
    public List<Debt> getByGroup(@PathVariable Long groupId){
        log.info("Récupération des dettes du groupe d'id {}", groupId);
        return debtService.findAllInGroup(groupId);
    }

    @GetMapping(path="list/user/{userId}")
    public List<Debt> getByUser(@PathVariable Long userId){
        log.info("Récupération des dettes du user d'id {}", userId);
        return debtService.findAllByUser(userId);
    }

    @PostMapping(path = "/save")
    public Debt save(@RequestBody Debt debt) {
        log.info("Sauvegarde de la dette avec commentaire {}", debt.getComment());
        return debtService.save(debt);
    }

    @GetMapping(path="{debtId}/acknowledge")
    public Debt acknowledge(@PathVariable Long debtId){
        log.info("Acquittement de la dette d'id {}", debtId);
        return debtService.acknowledge(debtId);
    }

}

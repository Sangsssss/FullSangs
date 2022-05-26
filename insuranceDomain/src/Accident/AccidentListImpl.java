package Accident;

import java.util.List;

import domain.CheckStatus;
import domain.LawsuitStatus;
import repository.AccidentRepository;


public class AccidentListImpl implements AccidentList{

    private final AccidentRepository accidentRepository;


    @Override
    public void addAccident(Accident accident) {
        accidentRepository.save(accident);
    }

    @Override
    public List<Accident> findAccidentList() {
        return accidentRepository.findAll();
    }

    @Override
    public Accident findAccident(Long accidentIdx) {
        return accidentRepository.findOne(accidentIdx);
    }

 
    @Override
    public void modifyCompensation(Long accidentIdx, int compensationPrice) {
        Accident findAccident = accidentRepository.findOne(accidentIdx);
        findAccident.setCompensationPrice(compensationPrice);
    }


    @Override
    public void modifyCheckAccident(Long accidentIdx) {
        Accident findAccident = accidentRepository.findOne(accidentIdx);
        findAccident.setCheckAccident(CheckStatus.CHECK);
    }

    @Override
    public void modifyLawsuit(Long accidentIdx) {
        Accident findAccident = accidentRepository.findOne(accidentIdx);
        findAccident.setLawsuitStatus(LawsuitStatus.PROCEEDING);
    }
}

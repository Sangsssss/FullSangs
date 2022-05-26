package Contract;

import java.util.List;

import domain.CheckUw;
import repository.ContractRepository;


public class ContractListImpl implements ContractList{

    private final ContractRepository contractRepository;

   
    @Override
    public void addContract(Contract contract) {
        contractRepository.save(contract);
    }

    @Override
    public List<Contract> findContractList() {
        return contractRepository.findAll();
    }

    @Override
    public Contract findContract(Long contractIdx) {
        return contractRepository.findOne(contractIdx);
    }

  
    @Override
    public void modifyCheckUw(Long contractIdx) {
        Contract findContract = contractRepository.findOne(contractIdx);
        findContract.setCheckUw(CheckUw.PASS);
    }


    @Override
    public void modifyContractDate(int contractIdx) {
        //상의후 수정
    }
}

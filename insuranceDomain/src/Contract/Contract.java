package Contract;

import java.time.LocalDateTime;

import Accident.Accident;
import Employee.Employee;
import Insurance.Insurance;
import User.User;
import domain.CheckStatus;
import domain.CheckUw;

public class Contract {


    private Long contractIdx;

 
//    @ColumnDefault("UNCHECK")
    private CheckStatus checkUwStatus;

    private LocalDateTime contractDate;

    private CheckUw checkUw;

    //청약서
    private String subscription;
    //제안서
    private String suggestion;

    private User user;

 
    private Employee employee;


    private Insurance insurance;


    private Accident accident;


//    public static Contract createContract(User user, Employee employee, Insurance insurance, int contractDate) {
//
//        Contract contract = new Contract();
//        contract.setUser(user);
//        contract.setEmployee(employee);
//        contract.setInsurance(insurance);
//        contract.setCheckUwStatus(CheckUwStatus.READY);
//        contract.setContractDate(LocalDateTime.now());
//
//        return contract;
//    }
}

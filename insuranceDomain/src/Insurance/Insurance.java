package Insurance;

import Accident.Accident;
import Contract.Contract;
import Employee.Employee;


public abstract class Insurance {

    private Long insuranceIdx;

    private String content;
    private int fee;
    private int maxReward;
    private int period;
    private int rate;
    private int employeeIdx;

    public Contract contract;
    public Accident accident;

    private Employee employee;

}

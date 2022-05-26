package Accident;

import java.time.LocalDateTime;

import Employee.Employee;
import User.User;
import domain.CheckStatus;
import domain.LawsuitStatus;

public class Accident {

  
    private Long accidentIdx;

    private LocalDateTime accidentDate;
    private String content;
    private int damagePrice;
    private int compensationPrice;

    private Long insuranceIdx;

//    @ColumnDefault("UNCHECK")

    private CheckStatus checkAccident; // 사고로써 작용하는지 1차 검증

 //    @ColumnDefault("NOT_PROCEEDING")

    private LawsuitStatus lawsuitStatus;


    private User user;

 
    private Employee employee;

}

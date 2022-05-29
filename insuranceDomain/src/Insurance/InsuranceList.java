package Insurance;

import java.util.ArrayList;
import java.util.List;

public interface InsuranceList {

    //Create
    public void addInsurance(Insurance insurance);

    //Read
    public List<Insurance> findInsuranceList();
    public Insurance findInsurance(Long insuranceIdx);

    public double findCarRate(int accidentRecord, int carCount, int price); // 泥��빟�꽌 �옉�꽦 �떆�뿉 �꽔�뼱�빞�븯�뒗
    public double findFireRate(int buildingCount, int buildingPrice);
    public double findHealthRate(int healthGrade);
    public double findTravelRate(int country, int period);

	

	public void idevelop(String iType, String iName, String content, String period, String fee, String maxReward);
	
	
	public String getIType(int i);
	public String getInsurance(int i);
	public String getIName(int i);
	public String getContent(int i);
	public int getArrayCount();
	public int getFee(int i);
	public int getPeriod(int i);
    //Update

}

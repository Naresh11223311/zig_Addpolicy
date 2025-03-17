package com.example.demo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PolicyDto 
{
	private long id;
    private String PolicyType;
    private String PolicyName;
    private String PolicyTo;
   
   
    
    public PolicyDto(long id, String PolicyType, String PolicyName, String PolicyTo) {
		// TODO Auto-generated constructor stub
    	this.id=id;this.PolicyType=PolicyType;this.PolicyName=PolicyName;this.PolicyTo=PolicyTo;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPolicyType() {
		return PolicyType;
	}
	public void setPolicyType(String PolicyType) {
		this.PolicyType = PolicyType;
	}
	
	public String getPolicyName() {
		return PolicyName;
	}
	public void setPolicyName(String PolicyName) {
		this.PolicyName = PolicyName;
	}
	
	public String getPolicyTo() {
		return PolicyTo;
	}
	public void setPolicyTo(String PolicyTo) {
		this.PolicyTo = PolicyTo;
	}
	
	
}
package com.example.demo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Policy")
public class Policy {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
     @Column(name = "PolicyType")
    private String PolicyType;
     
    @Column(name = "PolicyName")
    private String PolicyName;

    
    @Column(name = "PolicyTo")
    private String PolicyTo ;
   
    
	
    public Policy()
	{
		
	}

    public Policy(long id,String PolicyType, String PolicyName, String PolicyTo) {
		// TODO Auto-generated constructor stub
    	this.id=id;this.PolicyType=PolicyType;this.PolicyName=PolicyName;this.PolicyTo=PolicyTo;
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

	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	
}
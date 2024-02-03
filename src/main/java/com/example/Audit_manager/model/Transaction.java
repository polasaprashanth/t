package com.example.Audit_manager.model;

import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Transaction_table")
public class Transaction {
	
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int transactionId;

//	    @ManyToOne
//	    @JoinColumn(name = "module_id")
//	    private Module module;
	  
	  @Column(name = "module_id", nullable = false)
	  private String module_id;

	
	@Column(name = "transactionType", nullable = false)
	    private String transactionType; // Created, Updated, Deleted
	  
	  @Column(name = "description", nullable = false)
	    private String description; //description
	  
	  @Column(name = "Transaction_status", nullable = false)
	  private String Transaction_status;
	  
	  @Column(name = "Created_by", nullable = false)
	  private String Created_by;
	  @Column(name = "Created_At", nullable = false)
	  private double Created_At;
	  
	  
	  public double getCreated_At() {
		return Created_At;
	}

	public void setCreated_At(double created_At) {
		Created_At = created_At;
	}



	@Column(name = "Modified_by", nullable = false)
	  private double Modified_by;
	  
	  @Column(name = "Modified_at", nullable = false)
	  private String Modified_at;
	  
	  

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public String getModule_id() {
		return module_id;
	}

	public void setModule_id(String module_id) {
		this.module_id = module_id;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTransaction_status() {
		return Transaction_status;
	}

	public void setTransaction_status(String transaction_status) {
		Transaction_status = transaction_status;
	}

	public String getCreated_by() {
		return Created_by;
	}

	public void setCreated_by(String created_by) {
		Created_by = created_by;
	}

	public double getModified_by() {
		return Modified_by;
	}

	public void setModified_by(double modified_by) {
		Modified_by = modified_by;
	}

	public String getModified_at() {
		return Modified_at;
	}

	public void setModified_at(String modified_at) {
		Modified_at = modified_at;
	}

	
	
	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", module_id=" + module_id + ", transactionType="
				+ transactionType + ", description=" + description + ", Transaction_status=" + Transaction_status
				+ ", Created_by=" + Created_by + ", Created_At=" + Created_At + ", Modified_by=" + Modified_by
				+ ", Modified_at=" + Modified_at + "]";
	}

	
	
	
	  
	  
	  
	  
	  
	  
	  

	  
	  

	  

	
	
	
	  
	
		
	  
	   

}

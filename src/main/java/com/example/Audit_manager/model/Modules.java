package com.example.Audit_manager.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name = "Module_table")
public class Modules {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long moduleId;

    // other fields
    
    @Column(name = "module_name", nullable = false)
	private String module_name;
    

    public Long getModuleId() {
		return moduleId;
	}


	public void setModuleId(Long moduleId) {
		this.moduleId = moduleId;
	}


	public String getModule_name() {
		return module_name;
	}


	public void setModule_name(String module_name) {
		this.module_name = module_name;
	}


	

//	
//
//
//	@OneToMany(mappedBy = "module", cascade = CascadeType.ALL)
//    private List<Transaction> transactions;


    // getters and setters
	
	@Override
	public String toString() {
		return "Modules [moduleId=" + moduleId + ", module_name=" + module_name + "]";
	}

	
	
    
}

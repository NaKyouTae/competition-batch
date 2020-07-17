package com.mercury.jpa.model.system.config;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@ToString
@Entity
@Table(name = "SYSTEMCONFIG")
public class SystemConfig implements Serializable {

	private static final long serialVersionUID = 992380708237331117L;

	@Id
	@Column
	private String configName;

	@Column
	private String configType;
	
	@Column
	private String configValue;
}

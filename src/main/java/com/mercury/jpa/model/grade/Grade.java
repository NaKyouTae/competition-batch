package com.mercury.jpa.model.grade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "MERCURY_TB_GRADE")
public class Grade implements Serializable {

	private static final long serialVersionUID = 1572166980328662694L;

	@Id
	@Column
	private String idx;

	@Column
	private String gradeName;
		
	@Column
	private Integer gradeOrder;
	
	@Column
	private long startRange;

	@Column
	private long endRange;
	
	@Column
	private String insertDate;
}

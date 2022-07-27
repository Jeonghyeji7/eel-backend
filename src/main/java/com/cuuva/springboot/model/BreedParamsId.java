package com.cuuva.springboot.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Comment;

import com.fasterxml.jackson.annotation.JsonFormat;

//@Entity
@Table(name = "breed_id")
@Embeddable
public class BreedParamsId implements Serializable {
	
	
	@Column(name = "breed_journal_dt")
	@Comment("사육일지_날짜")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
    private LocalDate breedJournalDt;
    
	
	@ManyToOne
	@JoinColumn(name = "line_sn", referencedColumnName = "line_sn")
    @Comment("라인일련번호")
    private LineInfo lineInfo;

	
	@ManyToOne
	@JoinColumn(name = "watertank_sn", referencedColumnName = "watertank_sn")
    @Comment("수조 일련번호")
    private WaterInfo waterInfo;
	
	

}

package com.cuuva.springboot.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Comment;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "ef_breed_journal")
public class BreedJournal {
	
	@Id
	@Column(name = "breed_journal_sn")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long breedJournalSn;
	
	@ManyToOne
	@JoinColumn(name = "eel_farm_sn", referencedColumnName = "eel_farm_sn")
	@Comment("양반장일련번호")
	private EelFarmCommon eelFarmCommon;
	
//	@EmbeddedId
//	private BreedParamsId id;
	
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

    @Comment("전일총마리수")
    @Column(name = "prev_breed_count")
    private Integer prevBreedCount;

    @Comment("전일어체중")
    @Column(name = "prev_weight")
    private Integer prevWeight;

    @Comment("오전사료량")
    @Column(name = "feed_quantity_am",precision=10, scale=2)
    private BigDecimal feedQuantityAm;

    @Comment("오후사료량")
    @Column(name = "feed_quantity_pm",precision=10, scale=2)
    private BigDecimal feedQuantityPm;
    
    @Comment("오전사료량+오후사료량")
    @Column(name = "feed_quantity_sum",precision=10, scale=2)
    private BigDecimal feedQuantitySum;
    
    @Comment("효율(%)")
    @Column(name = "efficiency")
    private Integer efficiency;

    @Comment("사료 합계 * 효율(%)=증육량")
    @Column(name = "growth",precision=5, scale=2)
    private BigDecimal growth;
    
    @Comment("현재 마리수")
    @Column(name = "breed_count")
    private Integer breedCount;

    @Comment("전일 어체중 + 증육량=어체중")
    @Column(name = "weight")
    private Integer weight;

    @Comment("현재 개체수 / 어체중=평균미수")
    @Column(name = "average_weight",precision=5, scale=2)
    private BigDecimal averageWeight;

    @Comment("표준 급이율(%)")
    @Column(name = "standard_rate",precision=5, scale=2)
    private BigDecimal standardRate;

    @Comment("표준 사료량")
    @Column(name = "standard_feed",precision=5, scale=2)
    private BigDecimal standardFeed;

    @Comment("사료 합계 / 표준 사료량=비율")
    @Column(name = "standard_ratio")
    private Integer standardRatio;

    @Comment("전일 총 사료량")
    @Column(name = "prev_total_feed",precision=10, scale=2)
    private BigDecimal prevTotalFeed;
    
    @Comment("전일 총사료량 + 사료 합계=총사료량")
    @Column(name = "total_feed",precision=10, scale=2)
    private BigDecimal totalFeed;
    
    public BreedJournal() {
    	
    }

	public BreedJournal(EelFarmCommon eelFarmCommon, LocalDate breedJournalDt, LineInfo lineInfo, WaterInfo waterInfo,
			Integer prevBreedCount, Integer prevWeight, BigDecimal feedQuantityAm, BigDecimal feedQuantityPm,
			BigDecimal feedQuantitySum, Integer efficiency, BigDecimal growth, Integer breedCount, Integer weight,
			BigDecimal averageWeight, BigDecimal standardRate, BigDecimal standardFeed, Integer standardRatio,
			BigDecimal prevTotalFeed, BigDecimal totalFeed) {
		super();
		this.eelFarmCommon = eelFarmCommon;
		this.breedJournalDt = breedJournalDt;
		this.lineInfo = lineInfo;
		this.waterInfo = waterInfo;
		this.prevBreedCount = prevBreedCount;
		this.prevWeight = prevWeight;
		this.feedQuantityAm = feedQuantityAm;
		this.feedQuantityPm = feedQuantityPm;
		this.feedQuantitySum = feedQuantitySum;
		this.efficiency = efficiency;
		this.growth = growth;
		this.breedCount = breedCount;
		this.weight = weight;
		this.averageWeight = averageWeight;
		this.standardRate = standardRate;
		this.standardFeed = standardFeed;
		this.standardRatio = standardRatio;
		this.prevTotalFeed = prevTotalFeed;
		this.totalFeed = totalFeed;
	}

	public Long getBreedJournalSn() {
		return breedJournalSn;
	}

	public void setBreedJournalSn(Long breedJournalSn) {
		this.breedJournalSn = breedJournalSn;
	}

	public EelFarmCommon getEelFarmCommon() {
		return eelFarmCommon;
	}

	public void setEelFarmCommon(EelFarmCommon eelFarmCommon) {
		this.eelFarmCommon = eelFarmCommon;
	}

	public LocalDate getBreedJournalDt() {
		return breedJournalDt;
	}

	public void setBreedJournalDt(LocalDate breedJournalDt) {
		this.breedJournalDt = breedJournalDt;
	}

	public LineInfo getLineInfo() {
		return lineInfo;
	}

	public void setLineInfo(LineInfo lineInfo) {
		this.lineInfo = lineInfo;
	}

	public WaterInfo getWaterInfo() {
		return waterInfo;
	}

	public void setWaterInfo(WaterInfo waterInfo) {
		this.waterInfo = waterInfo;
	}

	public Integer getPrevBreedCount() {
		return prevBreedCount;
	}

	public void setPrevBreedCount(Integer prevBreedCount) {
		this.prevBreedCount = prevBreedCount;
	}

	public Integer getPrevWeight() {
		return prevWeight;
	}

	public void setPrevWeight(Integer prevWeight) {
		this.prevWeight = prevWeight;
	}

	public BigDecimal getFeedQuantityAm() {
		return feedQuantityAm;
	}

	public void setFeedQuantityAm(BigDecimal feedQuantityAm) {
		this.feedQuantityAm = feedQuantityAm;
	}

	public BigDecimal getFeedQuantityPm() {
		return feedQuantityPm;
	}

	public void setFeedQuantityPm(BigDecimal feedQuantityPm) {
		this.feedQuantityPm = feedQuantityPm;
	}

	public BigDecimal getFeedQuantitySum() {
		return feedQuantitySum;
	}

	public void setFeedQuantitySum(BigDecimal feedQuantitySum) {
		this.feedQuantitySum = feedQuantitySum;
	}

	public Integer getEfficiency() {
		return efficiency;
	}

	public void setEfficiency(Integer efficiency) {
		this.efficiency = efficiency;
	}

	public BigDecimal getGrowth() {
		return growth;
	}

	public void setGrowth(BigDecimal growth) {
		this.growth = growth;
	}

	public Integer getBreedCount() {
		return breedCount;
	}

	public void setBreedCount(Integer breedCount) {
		this.breedCount = breedCount;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public BigDecimal getAverageWeight() {
		return averageWeight;
	}

	public void setAverageWeight(BigDecimal averageWeight) {
		this.averageWeight = averageWeight;
	}

	public BigDecimal getStandardRate() {
		return standardRate;
	}

	public void setStandardRate(BigDecimal standardRate) {
		this.standardRate = standardRate;
	}

	public BigDecimal getStandardFeed() {
		return standardFeed;
	}

	public void setStandardFeed(BigDecimal standardFeed) {
		this.standardFeed = standardFeed;
	}

	public Integer getStandardRatio() {
		return standardRatio;
	}

	public void setStandardRatio(Integer standardRatio) {
		this.standardRatio = standardRatio;
	}

	public BigDecimal getPrevTotalFeed() {
		return prevTotalFeed;
	}

	public void setPrevTotalFeed(BigDecimal prevTotalFeed) {
		this.prevTotalFeed = prevTotalFeed;
	}

	public BigDecimal getTotalFeed() {
		return totalFeed;
	}

	public void setTotalFeed(BigDecimal totalFeed) {
		this.totalFeed = totalFeed;
	}
    
    

	

	
	
    

    

	
    
    
    
    
}

package com.google.code.jskills.dal.entities;

// Generated 25.06.2013 17:52:09 by Hibernate Tools 3.6.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * AnswerEntity generated by hbm2java
 */
@Entity
@Table(name = "ANSWER", schema = "PUBLIC", catalog = "PUBLIC")
public class AnswerEntity implements java.io.Serializable {

	private Integer id;
	private QuestionEntity questionEntity;
	private String answertext;
	private int point;

	public AnswerEntity() {
	}

	public AnswerEntity(QuestionEntity questionEntity, String answertext,
			int point) {
		this.questionEntity = questionEntity;
		this.answertext = answertext;
		this.point = point;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "QUESTION_ID", nullable = false)
	public QuestionEntity getQuestionEntity() {
		return this.questionEntity;
	}

	public void setQuestionEntity(QuestionEntity questionEntity) {
		this.questionEntity = questionEntity;
	}

	@Column(name = "ANSWERTEXT", nullable = false, length = 4096)
	public String getAnswertext() {
		return this.answertext;
	}

	public void setAnswertext(String answertext) {
		this.answertext = answertext;
	}

	@Column(name = "POINT", nullable = false)
	public int getPoint() {
		return this.point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

}

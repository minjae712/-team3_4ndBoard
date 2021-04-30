package com.springbook.biz.board;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//VO(Value Object)

@Entity
@Table(name="BOARD")
@Getter @Setter @ToString
public class BoardVO {

	@Id
	@GeneratedValue
	private int seq;
	private String title;
	private String writer;
	private String content;
	
	@Temporal(TemporalType.DATE)
	private Date regDate = new Date();
	private int cnt;

}
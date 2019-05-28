package io.github.itliwei.demo.entity.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import io.github.itliwei.mvcorm.generator.annotation.Field;


@Getter
@Setter
public class ApplicationDto implements Serializable {
	@Field(label = "ID")
	private Long id;
	@Field(label = "姓名")
	private String username;


}
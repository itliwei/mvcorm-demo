package io.github.itliwei.demo.query;

import java.io.Serializable;

import io.github.itliwei.mvcorm.orm.opt.QueryModel;
import io.swagger.annotations.*;

import lombok.Getter;
import lombok.Setter;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "TestEntityQueryModel", description = "TestEntityQueryModel")
public class TestEntityQueryModel  extends QueryModel implements Serializable {
	private Long idEQ;
	@ApiModelProperty
	private String usernameEQ;
	@ApiModelProperty
	private String[] usernameIN;
	@ApiModelProperty
	private Long jobIdEQ;
	@ApiModelProperty
	private Long[] jobIdIN;
	@ApiModelProperty
	private Integer ageEQ;
	@ApiModelProperty
	private Integer[] ageIN;
	@ApiModelProperty
	private String addressEQ;
	@ApiModelProperty
	private String[] addressIN;


}
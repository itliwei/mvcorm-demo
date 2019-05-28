package io.github.itliwei.demo.entity.query;

import java.io.Serializable;

import io.github.itliwei.mvcorm.orm.opt.QueryModel;

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
public class UserQueryModel  extends QueryModel implements Serializable {
	private Long idEQ;

	private String usernameEQ;

	private String usernameIN;

	private Long jobIdEQ;

	private Long jobIdIN;

	private Integer ageEQ;

	private Integer ageIN;

	private String addressEQ;

	private String addressIN;


}
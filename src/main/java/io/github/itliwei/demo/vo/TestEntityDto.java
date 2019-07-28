package io.github.itliwei.demo.vo;

import lombok.*;

import java.io.Serializable;
import io.swagger.annotations.*;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "TestEntityDto", description = "TestEntityDto")
public class TestEntityDto implements Serializable {
	@ApiModelProperty(value = "id")
	private Long id;
	@ApiModelProperty(value = "姓名")
	private String username;
	/* 扩展 */

}
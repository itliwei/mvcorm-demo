package io.github.itliwei.demo.vo;

import lombok.*;

import java.io.Serializable;
import io.swagger.annotations.*;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "TestEntityVo", description = "TestEntityVo")
public class TestEntityVo implements Serializable {
	@ApiModelProperty(value = "id")
	private Long id;
	@ApiModelProperty(value = "姓名")
	private String username;
	@ApiModelProperty(value = "jobId")
	private Long jobId;
	@ApiModelProperty(value = "年龄")
	private Integer age;
	@ApiModelProperty(value = "地址")
	private String address;
	/* 扩展 */

}
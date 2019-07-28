package io.github.itliwei.demo.controller;


import io.github.itliwei.demo.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import io.github.itliwei.mvcorm.mvc.constants.ErrorCode;
import io.github.itliwei.mvcorm.mvc.Resp;
import io.github.itliwei.mvcorm.util.PageBuilder;
import io.github.itliwei.demo.entity.TestEntity;
import io.github.itliwei.demo.service.TestEntityService;
import io.github.itliwei.demo.query.TestEntityQueryModel;
import io.github.itliwei.demo.component.TestEntityComponent;
import org.springframework.web.bind.annotation.*;
import lombok.extern.slf4j.Slf4j;
import io.swagger.annotations.*;
import io.github.itliwei.mvcorm.orm.opt.Page;


import io.github.itliwei.demo.vo.TestEntityVo;
import io.github.itliwei.demo.vo.TestEntityDto;

@Slf4j
@RestController
@RequestMapping("api/user")
@Api(value = "用户接口",description = "用户接口")
public class TestEntityController {

    @Autowired
    private TestEntityService testEntityService;

    @Autowired
    private TestEntityComponent testEntityComponent;

    @GetMapping("/info/{id}")
    @ApiOperation(value = "根据ID查找",httpMethod = "GET")
    public Resp<TestEntityVo> getById(@PathVariable long id) {
        TestEntity result = testEntityService.findById(id);
        if (result != null){
            TestEntityVo resultVo =  testEntityComponent.convert2TestEntityVo(result);
            return Resp.success(resultVo);
        }
        return Resp.error(ErrorCode.DATA_NOT_EXIST,"id:"+id);
    }


    @PostMapping("/page/query")
    @ApiOperation(value = "分页查找内容",httpMethod = "POST")
    public Resp<Page<TestEntityVo>> pageQuery(@RequestBody TestEntityQueryModel queryModel) {
        Page<TestEntity> result = testEntityService.findPage(queryModel);
        Page<TestEntityVo> voPage = PageBuilder.copyAndConvert(result, testEntityComponent::convert2TestEntityVo);
        return Resp.success(voPage);
    }

    @PostMapping("/save")
    @ApiOperation(value = "保存",httpMethod = "POST")
    public Resp<TestEntityVo> save(@RequestBody TestEntityDto testEntityDto) {
        TestEntity entity = testEntityComponent.convert2TestEntity(testEntityDto);
        int result = testEntityService.save(entity);
        if (result > 0){
            TestEntityVo entityVo = testEntityComponent.convert2TestEntityVo(entity);
            return Resp.success(entityVo);
        }
        return Resp.error(ErrorCode.SERVER,"保存数据失败");
    }

    @PostMapping("/update")
    @ApiOperation(value = "修改",httpMethod = "POST")
    public Resp update(@RequestBody TestEntityDto testEntityDto) {
        TestEntity entity = testEntityComponent.convert2TestEntity(testEntityDto);
        int result = testEntityService.update(entity);
        if (result > 0) {
            return Resp.success(result);
        }
        return Resp.error(ErrorCode.SERVER,"修改数据失败");
    }

    @GetMapping("/delete/{id}")
    @ApiOperation(value = "根据ID删除",httpMethod = "GET")
    public Resp delete(@PathVariable long id) {
        int result = testEntityService.delete(id);
        if (result > 0) {
            return Resp.success(result);
        }
        return Resp.error(ErrorCode.SERVER,"删除数据失败");
    }


}
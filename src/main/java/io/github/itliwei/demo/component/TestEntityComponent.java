package io.github.itliwei.demo.component;


import io.github.itliwei.demo.vo.*;
import io.github.itliwei.demo.entity.TestEntity;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Component;
import java.lang.reflect.InvocationTargetException;



@Component
@Slf4j
public class TestEntityComponent {
    /**
    * @return
    * @throws InvocationTargetException
    * @throws IllegalAccessException
    */
    public TestEntity convert2TestEntity(TestEntityVo source) {
        TestEntity target = new TestEntity();
        try{
            BeanUtils.copyProperties(target,source);
            return target;
        }catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    public TestEntityVo convert2TestEntityVo(TestEntity source){
        TestEntityVo target = new TestEntityVo();
        try{
            BeanUtils.copyProperties(target,source);
            return target;
        }catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
    /**
    * @return
    * @throws InvocationTargetException
    * @throws IllegalAccessException
    */
    public TestEntity convert2TestEntity(TestEntityDto source) {
        TestEntity target = new TestEntity();
        try{
            BeanUtils.copyProperties(target,source);
            return target;
        }catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    public TestEntityDto convert2TestEntityDto(TestEntity source){
        TestEntityDto target = new TestEntityDto();
        try{
            BeanUtils.copyProperties(target,source);
            return target;
        }catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
package com.entity.view;

import com.entity.WenzhenjiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 问诊记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-04-23 18:12:00
 */
@TableName("wenzhenjilu")
public class WenzhenjiluView  extends WenzhenjiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WenzhenjiluView(){
	}
 
 	public WenzhenjiluView(WenzhenjiluEntity wenzhenjiluEntity){
 	try {
			BeanUtils.copyProperties(this, wenzhenjiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

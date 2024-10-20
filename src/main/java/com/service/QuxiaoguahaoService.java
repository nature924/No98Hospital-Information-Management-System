package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QuxiaoguahaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QuxiaoguahaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QuxiaoguahaoView;


/**
 * 取消挂号
 *
 * @author 
 * @email 
 * @date 2023-04-23 18:11:59
 */
public interface QuxiaoguahaoService extends IService<QuxiaoguahaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QuxiaoguahaoVO> selectListVO(Wrapper<QuxiaoguahaoEntity> wrapper);
   	
   	QuxiaoguahaoVO selectVO(@Param("ew") Wrapper<QuxiaoguahaoEntity> wrapper);
   	
   	List<QuxiaoguahaoView> selectListView(Wrapper<QuxiaoguahaoEntity> wrapper);
   	
   	QuxiaoguahaoView selectView(@Param("ew") Wrapper<QuxiaoguahaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QuxiaoguahaoEntity> wrapper);
   	

}


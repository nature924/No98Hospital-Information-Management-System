package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WenzhenjiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WenzhenjiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WenzhenjiluView;


/**
 * 问诊记录
 *
 * @author 
 * @email 
 * @date 2023-04-23 18:12:00
 */
public interface WenzhenjiluService extends IService<WenzhenjiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WenzhenjiluVO> selectListVO(Wrapper<WenzhenjiluEntity> wrapper);
   	
   	WenzhenjiluVO selectVO(@Param("ew") Wrapper<WenzhenjiluEntity> wrapper);
   	
   	List<WenzhenjiluView> selectListView(Wrapper<WenzhenjiluEntity> wrapper);
   	
   	WenzhenjiluView selectView(@Param("ew") Wrapper<WenzhenjiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WenzhenjiluEntity> wrapper);
   	

}


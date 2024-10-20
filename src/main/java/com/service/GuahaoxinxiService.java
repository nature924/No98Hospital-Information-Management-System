package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuahaoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GuahaoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GuahaoxinxiView;


/**
 * 挂号信息
 *
 * @author 
 * @email 
 * @date 2023-04-23 18:11:59
 */
public interface GuahaoxinxiService extends IService<GuahaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuahaoxinxiVO> selectListVO(Wrapper<GuahaoxinxiEntity> wrapper);
   	
   	GuahaoxinxiVO selectVO(@Param("ew") Wrapper<GuahaoxinxiEntity> wrapper);
   	
   	List<GuahaoxinxiView> selectListView(Wrapper<GuahaoxinxiEntity> wrapper);
   	
   	GuahaoxinxiView selectView(@Param("ew") Wrapper<GuahaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuahaoxinxiEntity> wrapper);
   	

}


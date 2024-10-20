package com.dao;

import com.entity.WenzhenjiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WenzhenjiluVO;
import com.entity.view.WenzhenjiluView;


/**
 * 问诊记录
 * 
 * @author 
 * @email 
 * @date 2023-04-23 18:12:00
 */
public interface WenzhenjiluDao extends BaseMapper<WenzhenjiluEntity> {
	
	List<WenzhenjiluVO> selectListVO(@Param("ew") Wrapper<WenzhenjiluEntity> wrapper);
	
	WenzhenjiluVO selectVO(@Param("ew") Wrapper<WenzhenjiluEntity> wrapper);
	
	List<WenzhenjiluView> selectListView(@Param("ew") Wrapper<WenzhenjiluEntity> wrapper);

	List<WenzhenjiluView> selectListView(Pagination page,@Param("ew") Wrapper<WenzhenjiluEntity> wrapper);
	
	WenzhenjiluView selectView(@Param("ew") Wrapper<WenzhenjiluEntity> wrapper);
	

}

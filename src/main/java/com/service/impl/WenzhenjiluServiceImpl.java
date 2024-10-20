package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.WenzhenjiluDao;
import com.entity.WenzhenjiluEntity;
import com.service.WenzhenjiluService;
import com.entity.vo.WenzhenjiluVO;
import com.entity.view.WenzhenjiluView;

@Service("wenzhenjiluService")
public class WenzhenjiluServiceImpl extends ServiceImpl<WenzhenjiluDao, WenzhenjiluEntity> implements WenzhenjiluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WenzhenjiluEntity> page = this.selectPage(
                new Query<WenzhenjiluEntity>(params).getPage(),
                new EntityWrapper<WenzhenjiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WenzhenjiluEntity> wrapper) {
		  Page<WenzhenjiluView> page =new Query<WenzhenjiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WenzhenjiluVO> selectListVO(Wrapper<WenzhenjiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WenzhenjiluVO selectVO(Wrapper<WenzhenjiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WenzhenjiluView> selectListView(Wrapper<WenzhenjiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WenzhenjiluView selectView(Wrapper<WenzhenjiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

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


import com.dao.GuahaoxinxiDao;
import com.entity.GuahaoxinxiEntity;
import com.service.GuahaoxinxiService;
import com.entity.vo.GuahaoxinxiVO;
import com.entity.view.GuahaoxinxiView;

@Service("guahaoxinxiService")
public class GuahaoxinxiServiceImpl extends ServiceImpl<GuahaoxinxiDao, GuahaoxinxiEntity> implements GuahaoxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GuahaoxinxiEntity> page = this.selectPage(
                new Query<GuahaoxinxiEntity>(params).getPage(),
                new EntityWrapper<GuahaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GuahaoxinxiEntity> wrapper) {
		  Page<GuahaoxinxiView> page =new Query<GuahaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GuahaoxinxiVO> selectListVO(Wrapper<GuahaoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GuahaoxinxiVO selectVO(Wrapper<GuahaoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GuahaoxinxiView> selectListView(Wrapper<GuahaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GuahaoxinxiView selectView(Wrapper<GuahaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

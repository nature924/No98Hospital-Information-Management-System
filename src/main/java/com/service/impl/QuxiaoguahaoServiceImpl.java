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


import com.dao.QuxiaoguahaoDao;
import com.entity.QuxiaoguahaoEntity;
import com.service.QuxiaoguahaoService;
import com.entity.vo.QuxiaoguahaoVO;
import com.entity.view.QuxiaoguahaoView;

@Service("quxiaoguahaoService")
public class QuxiaoguahaoServiceImpl extends ServiceImpl<QuxiaoguahaoDao, QuxiaoguahaoEntity> implements QuxiaoguahaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QuxiaoguahaoEntity> page = this.selectPage(
                new Query<QuxiaoguahaoEntity>(params).getPage(),
                new EntityWrapper<QuxiaoguahaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QuxiaoguahaoEntity> wrapper) {
		  Page<QuxiaoguahaoView> page =new Query<QuxiaoguahaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QuxiaoguahaoVO> selectListVO(Wrapper<QuxiaoguahaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QuxiaoguahaoVO selectVO(Wrapper<QuxiaoguahaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QuxiaoguahaoView> selectListView(Wrapper<QuxiaoguahaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QuxiaoguahaoView selectView(Wrapper<QuxiaoguahaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

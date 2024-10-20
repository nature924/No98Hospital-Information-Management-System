package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.WenzhenjiluEntity;
import com.entity.view.WenzhenjiluView;

import com.service.WenzhenjiluService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 问诊记录
 * 后端接口
 * @author 
 * @email 
 * @date 2023-04-23 18:12:00
 */
@RestController
@RequestMapping("/wenzhenjilu")
public class WenzhenjiluController {
    @Autowired
    private WenzhenjiluService wenzhenjiluService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WenzhenjiluEntity wenzhenjilu,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("huanzhe")) {
			wenzhenjilu.setHuanzhezhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yisheng")) {
			wenzhenjilu.setYishengzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<WenzhenjiluEntity> ew = new EntityWrapper<WenzhenjiluEntity>();

		PageUtils page = wenzhenjiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wenzhenjilu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WenzhenjiluEntity wenzhenjilu, 
		HttpServletRequest request){
        EntityWrapper<WenzhenjiluEntity> ew = new EntityWrapper<WenzhenjiluEntity>();

		PageUtils page = wenzhenjiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wenzhenjilu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WenzhenjiluEntity wenzhenjilu){
       	EntityWrapper<WenzhenjiluEntity> ew = new EntityWrapper<WenzhenjiluEntity>();
      	ew.allEq(MPUtil.allEQMapPre( wenzhenjilu, "wenzhenjilu")); 
        return R.ok().put("data", wenzhenjiluService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WenzhenjiluEntity wenzhenjilu){
        EntityWrapper< WenzhenjiluEntity> ew = new EntityWrapper< WenzhenjiluEntity>();
 		ew.allEq(MPUtil.allEQMapPre( wenzhenjilu, "wenzhenjilu")); 
		WenzhenjiluView wenzhenjiluView =  wenzhenjiluService.selectView(ew);
		return R.ok("查询问诊记录成功").put("data", wenzhenjiluView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        WenzhenjiluEntity wenzhenjilu = wenzhenjiluService.selectById(id);
        return R.ok().put("data", wenzhenjilu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        WenzhenjiluEntity wenzhenjilu = wenzhenjiluService.selectById(id);
        return R.ok().put("data", wenzhenjilu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WenzhenjiluEntity wenzhenjilu, HttpServletRequest request){
    	wenzhenjilu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wenzhenjilu);
        wenzhenjiluService.insert(wenzhenjilu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody WenzhenjiluEntity wenzhenjilu, HttpServletRequest request){
    	wenzhenjilu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wenzhenjilu);
        wenzhenjiluService.insert(wenzhenjilu);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody WenzhenjiluEntity wenzhenjilu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(wenzhenjilu);
        wenzhenjiluService.updateById(wenzhenjilu);//全部更新
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        wenzhenjiluService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}

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

import com.entity.ChufangkaijuEntity;
import com.entity.view.ChufangkaijuView;

import com.service.ChufangkaijuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 处方开具
 * 后端接口
 * @author 
 * @email 
 * @date 2023-04-23 18:12:00
 */
@RestController
@RequestMapping("/chufangkaiju")
public class ChufangkaijuController {
    @Autowired
    private ChufangkaijuService chufangkaijuService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ChufangkaijuEntity chufangkaiju,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("huanzhe")) {
			chufangkaiju.setHuanzhezhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yisheng")) {
			chufangkaiju.setYishengzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ChufangkaijuEntity> ew = new EntityWrapper<ChufangkaijuEntity>();

		PageUtils page = chufangkaijuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chufangkaiju), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ChufangkaijuEntity chufangkaiju, 
		HttpServletRequest request){
        EntityWrapper<ChufangkaijuEntity> ew = new EntityWrapper<ChufangkaijuEntity>();

		PageUtils page = chufangkaijuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chufangkaiju), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ChufangkaijuEntity chufangkaiju){
       	EntityWrapper<ChufangkaijuEntity> ew = new EntityWrapper<ChufangkaijuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( chufangkaiju, "chufangkaiju")); 
        return R.ok().put("data", chufangkaijuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ChufangkaijuEntity chufangkaiju){
        EntityWrapper< ChufangkaijuEntity> ew = new EntityWrapper< ChufangkaijuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( chufangkaiju, "chufangkaiju")); 
		ChufangkaijuView chufangkaijuView =  chufangkaijuService.selectView(ew);
		return R.ok("查询处方开具成功").put("data", chufangkaijuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ChufangkaijuEntity chufangkaiju = chufangkaijuService.selectById(id);
        return R.ok().put("data", chufangkaiju);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ChufangkaijuEntity chufangkaiju = chufangkaijuService.selectById(id);
        return R.ok().put("data", chufangkaiju);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChufangkaijuEntity chufangkaiju, HttpServletRequest request){
    	chufangkaiju.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(chufangkaiju);
        chufangkaijuService.insert(chufangkaiju);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ChufangkaijuEntity chufangkaiju, HttpServletRequest request){
    	chufangkaiju.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(chufangkaiju);
        chufangkaijuService.insert(chufangkaiju);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ChufangkaijuEntity chufangkaiju, HttpServletRequest request){
        //ValidatorUtils.validateEntity(chufangkaiju);
        chufangkaijuService.updateById(chufangkaiju);//全部更新
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        chufangkaijuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}

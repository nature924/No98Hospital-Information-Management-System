package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 问诊记录
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-04-23 18:12:00
 */
@TableName("wenzhenjilu")
public class WenzhenjiluEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WenzhenjiluEntity() {
		
	}
	
	public WenzhenjiluEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 病历编号
	 */
					
	private String binglibianhao;
	
	/**
	 * 患者账号
	 */
					
	private String huanzhezhanghao;
	
	/**
	 * 患者姓名
	 */
					
	private String huanzhexingming;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 年龄
	 */
					
	private String nianling;
	
	/**
	 * 患者症状
	 */
					
	private String huanzhezhengzhuang;
	
	/**
	 * 诊断结果
	 */
					
	private String zhenduanjieguo;
	
	/**
	 * 病历描述
	 */
					
	private String binglimiaoshu;
	
	/**
	 * 注意事项
	 */
					
	private String zhuyishixiang;
	
	/**
	 * 就诊时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date jiuzhenshijian;
	
	/**
	 * 医生账号
	 */
					
	private String yishengzhanghao;
	
	/**
	 * 医生姓名
	 */
					
	private String yishengxingming;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：病历编号
	 */
	public void setBinglibianhao(String binglibianhao) {
		this.binglibianhao = binglibianhao;
	}
	/**
	 * 获取：病历编号
	 */
	public String getBinglibianhao() {
		return binglibianhao;
	}
	/**
	 * 设置：患者账号
	 */
	public void setHuanzhezhanghao(String huanzhezhanghao) {
		this.huanzhezhanghao = huanzhezhanghao;
	}
	/**
	 * 获取：患者账号
	 */
	public String getHuanzhezhanghao() {
		return huanzhezhanghao;
	}
	/**
	 * 设置：患者姓名
	 */
	public void setHuanzhexingming(String huanzhexingming) {
		this.huanzhexingming = huanzhexingming;
	}
	/**
	 * 获取：患者姓名
	 */
	public String getHuanzhexingming() {
		return huanzhexingming;
	}
	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：年龄
	 */
	public void setNianling(String nianling) {
		this.nianling = nianling;
	}
	/**
	 * 获取：年龄
	 */
	public String getNianling() {
		return nianling;
	}
	/**
	 * 设置：患者症状
	 */
	public void setHuanzhezhengzhuang(String huanzhezhengzhuang) {
		this.huanzhezhengzhuang = huanzhezhengzhuang;
	}
	/**
	 * 获取：患者症状
	 */
	public String getHuanzhezhengzhuang() {
		return huanzhezhengzhuang;
	}
	/**
	 * 设置：诊断结果
	 */
	public void setZhenduanjieguo(String zhenduanjieguo) {
		this.zhenduanjieguo = zhenduanjieguo;
	}
	/**
	 * 获取：诊断结果
	 */
	public String getZhenduanjieguo() {
		return zhenduanjieguo;
	}
	/**
	 * 设置：病历描述
	 */
	public void setBinglimiaoshu(String binglimiaoshu) {
		this.binglimiaoshu = binglimiaoshu;
	}
	/**
	 * 获取：病历描述
	 */
	public String getBinglimiaoshu() {
		return binglimiaoshu;
	}
	/**
	 * 设置：注意事项
	 */
	public void setZhuyishixiang(String zhuyishixiang) {
		this.zhuyishixiang = zhuyishixiang;
	}
	/**
	 * 获取：注意事项
	 */
	public String getZhuyishixiang() {
		return zhuyishixiang;
	}
	/**
	 * 设置：就诊时间
	 */
	public void setJiuzhenshijian(Date jiuzhenshijian) {
		this.jiuzhenshijian = jiuzhenshijian;
	}
	/**
	 * 获取：就诊时间
	 */
	public Date getJiuzhenshijian() {
		return jiuzhenshijian;
	}
	/**
	 * 设置：医生账号
	 */
	public void setYishengzhanghao(String yishengzhanghao) {
		this.yishengzhanghao = yishengzhanghao;
	}
	/**
	 * 获取：医生账号
	 */
	public String getYishengzhanghao() {
		return yishengzhanghao;
	}
	/**
	 * 设置：医生姓名
	 */
	public void setYishengxingming(String yishengxingming) {
		this.yishengxingming = yishengxingming;
	}
	/**
	 * 获取：医生姓名
	 */
	public String getYishengxingming() {
		return yishengxingming;
	}

}

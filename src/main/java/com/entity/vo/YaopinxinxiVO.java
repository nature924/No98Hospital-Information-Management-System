package com.entity.vo;

import com.entity.YaopinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 药品信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-04-23 18:12:00
 */
public class YaopinxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 药品图片
	 */
	
	private String yaopintupian;
		
	/**
	 * 药品类型
	 */
	
	private String yaopinleixing;
		
	/**
	 * 剂型
	 */
	
	private String jixing;
		
	/**
	 * 保质期
	 */
	
	private String baozhiqi;
		
	/**
	 * 药品说明
	 */
	
	private String yaopinshuoming;
		
	/**
	 * 生产厂家
	 */
	
	private String shengchanchangjia;
		
	/**
	 * 规格
	 */
	
	private String guige;
		
	/**
	 * 单价
	 */
	
	private Float danjia;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 生产日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shengchanriqi;
		
	/**
	 * 入库日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date rukuriqi;
		
	/**
	 * 入库批号
	 */
	
	private String rukupihao;
		
	/**
	 * 经办人
	 */
	
	private String jingbanren;
				
	
	/**
	 * 设置：药品图片
	 */
	 
	public void setYaopintupian(String yaopintupian) {
		this.yaopintupian = yaopintupian;
	}
	
	/**
	 * 获取：药品图片
	 */
	public String getYaopintupian() {
		return yaopintupian;
	}
				
	
	/**
	 * 设置：药品类型
	 */
	 
	public void setYaopinleixing(String yaopinleixing) {
		this.yaopinleixing = yaopinleixing;
	}
	
	/**
	 * 获取：药品类型
	 */
	public String getYaopinleixing() {
		return yaopinleixing;
	}
				
	
	/**
	 * 设置：剂型
	 */
	 
	public void setJixing(String jixing) {
		this.jixing = jixing;
	}
	
	/**
	 * 获取：剂型
	 */
	public String getJixing() {
		return jixing;
	}
				
	
	/**
	 * 设置：保质期
	 */
	 
	public void setBaozhiqi(String baozhiqi) {
		this.baozhiqi = baozhiqi;
	}
	
	/**
	 * 获取：保质期
	 */
	public String getBaozhiqi() {
		return baozhiqi;
	}
				
	
	/**
	 * 设置：药品说明
	 */
	 
	public void setYaopinshuoming(String yaopinshuoming) {
		this.yaopinshuoming = yaopinshuoming;
	}
	
	/**
	 * 获取：药品说明
	 */
	public String getYaopinshuoming() {
		return yaopinshuoming;
	}
				
	
	/**
	 * 设置：生产厂家
	 */
	 
	public void setShengchanchangjia(String shengchanchangjia) {
		this.shengchanchangjia = shengchanchangjia;
	}
	
	/**
	 * 获取：生产厂家
	 */
	public String getShengchanchangjia() {
		return shengchanchangjia;
	}
				
	
	/**
	 * 设置：规格
	 */
	 
	public void setGuige(String guige) {
		this.guige = guige;
	}
	
	/**
	 * 获取：规格
	 */
	public String getGuige() {
		return guige;
	}
				
	
	/**
	 * 设置：单价
	 */
	 
	public void setDanjia(Float danjia) {
		this.danjia = danjia;
	}
	
	/**
	 * 获取：单价
	 */
	public Float getDanjia() {
		return danjia;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：生产日期
	 */
	 
	public void setShengchanriqi(Date shengchanriqi) {
		this.shengchanriqi = shengchanriqi;
	}
	
	/**
	 * 获取：生产日期
	 */
	public Date getShengchanriqi() {
		return shengchanriqi;
	}
				
	
	/**
	 * 设置：入库日期
	 */
	 
	public void setRukuriqi(Date rukuriqi) {
		this.rukuriqi = rukuriqi;
	}
	
	/**
	 * 获取：入库日期
	 */
	public Date getRukuriqi() {
		return rukuriqi;
	}
				
	
	/**
	 * 设置：入库批号
	 */
	 
	public void setRukupihao(String rukupihao) {
		this.rukupihao = rukupihao;
	}
	
	/**
	 * 获取：入库批号
	 */
	public String getRukupihao() {
		return rukupihao;
	}
				
	
	/**
	 * 设置：经办人
	 */
	 
	public void setJingbanren(String jingbanren) {
		this.jingbanren = jingbanren;
	}
	
	/**
	 * 获取：经办人
	 */
	public String getJingbanren() {
		return jingbanren;
	}
			
}

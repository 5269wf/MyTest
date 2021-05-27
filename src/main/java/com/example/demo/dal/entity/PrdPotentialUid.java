package com.example.demo.dal.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 产品潜客推送底层表
 */
@Entity
@Data
@Table(name = "prd_potential_uid")
public class PrdPotentialUid implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 客户所属行业
     */
    @Column(name = "biz_category_name")
    private String bizCategoryName;

    /**
     * 商机类型
     */
    @Column(name = "business_type")
    private String businessType;

    /**
     * 推荐场景：产品首购、产品升级、流失预警、老客新购等
     */
    @Column(name = "chance_type")
    private String chanceType;

    /**
     * 商机失效日期
     */
    @Column(name = "expiry_date")
    private String expiryDate;

    /**
     * 商机失效日期
     */
    @Column(name = "expiry_time")
    private LocalDateTime expiryTime;

    /**
     * 年GC等级
     */
    @Column(name = "gc_level")
    private String gcLevel;

    /**
     * 创建时间
     */
    @Column(name = "gmt_create", nullable = false)
    private LocalDateTime gmtCreate;

    /**
     * 修改时间
     */
    @Column(name = "gmt_modified", nullable = false)
    private LocalDateTime gmtModified;

    /**
     * 商机挖掘日期
     */
    @Column(name = "gmt_time")
    private LocalDateTime gmtTime;

    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    /**
     * 一级行业
     */
    @Column(name = "industry_name_lv1")
    private String industryNameLv1;

    /**
     * 二级行业
     */
    @Column(name = "industry_name_lv2")
    private String industryNameLv2;

    /**
     * 三级行业
     */
    @Column(name = "industry_name_lv3")
    private String industryNameLv3;

    /**
     * 产品code
     */
    @Column(name = "pip_code")
    private String pipCode;

    /**
     * 产品名称
     */
    @Column(name = "pip_name")
    private String pipName;

    /**
     * 产品线名称
     */
    @Column(name = "prdline_name")
    private String prdlineName;

    /**
     * 推荐指数
     */
    @Column(name = "recommend_index")
    private BigDecimal recommendIndex;

    /**
     * 推荐实例规格（若没具体到实例规格，则显示pip_code)
     */
    @Column(name = "recommend_ins")
    private String recommendIns;

    /**
     * 具体的推荐理由
     */
    @Column(name = "recommend_reason")
    private String recommendReason;

    /**
     * 潜客标签
     */
    @Column(name = "recommend_reason_type")
    private String recommendReasonType;

    /**
     * 关联cbm工号
     */
    @Column(name = "team_cbm_id")
    private String teamCbmId;

    /**
     * 关联cbm姓名
     */
    @Column(name = "team_cbm_name")
    private String teamCbmName;

    /**
     * 关联销售类型细分
     */
    @Column(name = "team_name_3rd")
    private String teamName3rd;

    /**
     * 关联销售类型：CBM、电销、公海
     */
    @Column(name = "team_type")
    private String teamType;

    /**
     * 统计日期
     */
    @Column(name = "thedate")
    private String thedate;

    /**
     * 用户id
     */
    @Column(name = "userid")
    private String userid;

}

package com.zy.entity;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * easybuy_product
 * @author
 */
@Table(name = "easybuy_product")
public class Product {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 价格
     */
    private Float price;

    /**
     * 库存
     */
    private Integer stock;

    /**
     * 分类1
     */
    private Integer categorylevel1id;

    /**
     * 分类2
     */
    private Integer categorylevel2id;

    /**
     * 分类3
     */
    private Integer categorylevel3id;

    /**
     * 文件名称
     */
    private String filename;

    /**
     * 是否删除(1：删除 0：未删除)
     */
    private Integer isdelete;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", categorylevel1id=" + categorylevel1id +
                ", categorylevel2id=" + categorylevel2id +
                ", categorylevel3id=" + categorylevel3id +
                ", filename='" + filename + '\'' +
                ", isdelete=" + isdelete +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getCategorylevel1id() {
        return categorylevel1id;
    }

    public void setCategorylevel1id(Integer categorylevel1id) {
        this.categorylevel1id = categorylevel1id;
    }

    public Integer getCategorylevel2id() {
        return categorylevel2id;
    }

    public void setCategorylevel2id(Integer categorylevel2id) {
        this.categorylevel2id = categorylevel2id;
    }

    public Integer getCategorylevel3id() {
        return categorylevel3id;
    }

    public void setCategorylevel3id(Integer categorylevel3id) {
        this.categorylevel3id = categorylevel3id;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }
}
package com.pain.mall.mapper;

import com.pain.mall.pojo.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    List<Product> selectList();

    List<Product> selectByNameAndProductId(@Param(value = "productName") String productName,
                                           @Param(value = "productId") Integer productId);

    List<Product> selectByNameAndCategoryIds(@Param(value = "productName") String productName,
                                             @Param(value = "categoryIdList") List<Integer> categoryIdList);

    // 使用 Integer 考虑商品删除情况
    Integer selectStockByProductId(Integer productId);
}
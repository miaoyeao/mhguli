package com.mh.guli.product;

import com.mh.guli.product.entity.BrandEntity;
import com.mh.guli.product.service.BrandService;
import com.mh.guli.product.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.util.Arrays;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class GuliProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Autowired
    CategoryService categoryService;
//    @Autowired
//    OSSClient ossclient;
    @Test
    public void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();

        brandEntity.setName("华为");
        brandService.save(brandEntity);
        System.out.println("保存成功");
    }

    @Test
    public void testOss() {
        Long[] catelogPath = categoryService.findCatelogPath(255L);
        log.info("路径：{}", Arrays.asList(catelogPath));
    }


}

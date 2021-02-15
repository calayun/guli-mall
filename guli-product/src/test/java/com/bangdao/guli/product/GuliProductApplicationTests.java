package com.bangdao.guli.product;

import com.bangdao.guli.product.entity.SpuInfoEntity;
import com.bangdao.guli.product.service.SpuInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GuliProductApplicationTests {

    @Autowired
    private SpuInfoService spuInfoService;
    @Test
    public void contextLoads() {

        SpuInfoEntity entity = new SpuInfoEntity();
        entity.setSpuName("华为");
        spuInfoService.save(entity);
    }

}

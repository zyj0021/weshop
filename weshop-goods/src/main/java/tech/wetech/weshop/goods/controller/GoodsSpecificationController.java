package tech.wetech.weshop.goods.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.wetech.weshop.common.api.BaseApi;
import tech.wetech.weshop.common.utils.ResultWrapper;
import tech.wetech.weshop.goods.api.GoodsSpecificationApi;
import tech.wetech.weshop.goods.dto.GoodsSpecificationDTO;
import tech.wetech.weshop.goods.po.GoodsSpecification;
import tech.wetech.weshop.goods.service.GoodsSpecificationService;

import java.util.List;

@RestController
@RequestMapping("/goodsSpecification")
public class GoodsSpecificationController extends BaseApi<GoodsSpecification> implements GoodsSpecificationApi {

    @Autowired
    private GoodsSpecificationService goodsSpecificationService;

    @Override
    public ResultWrapper<List<GoodsSpecificationDTO>> queryGoodsDetailSpecificationByGoodsId(Integer goodsId) {
        return ResultWrapper.success(goodsSpecificationService.queryGoodsDetailSpecificationByGoodsId(goodsId));
    }

    @Override
    public ResultWrapper<List<String>> queryValueByGoodsIdAndIdIn(Integer goodsId, List<Integer> goodsSpecificationIds) {
        return ResultWrapper.success(goodsSpecificationService.queryValueByGoodsIdAndIdIn(goodsId, goodsSpecificationIds));
    }
}

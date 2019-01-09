package tech.wetech.weshop.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.wetech.weshop.service.CategoryService;
import tech.wetech.weshop.utils.Result;
import tech.wetech.weshop.vo.CategoryIndexVO;
import tech.wetech.weshop.vo.CategoryVO;

@RestController
@RequestMapping("/wechat/catalog")
public class WechatCatalogController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/index")
    public Result<CategoryIndexVO> index(Integer id) {
        return Result.success(categoryService.index(id));
    }

    @GetMapping("/{id}")
    public Result<CategoryVO> current(@PathVariable Integer id) {
        return Result.success(categoryService.current(id));
    }

}
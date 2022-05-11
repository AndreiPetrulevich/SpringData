package ru.gb.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.gb.entity.Goods;
import ru.gb.service.GoodsService;

@Controller
@RequiredArgsConstructor
public class GoodsController {

    private final GoodsService goodsService;

    @RequestMapping(value = "/goods", method = RequestMethod.GET)
    public String addGoods(Model model) {
        model.addAttribute("goods", goodsService.findAllGoods());
        return "goods-list";
    }

    @RequestMapping(value = "/goods", method = RequestMethod.POST)
    public String processForm(Goods goods) {
        if (goods.getId() == null) {
            goodsService.save(goods);
        } else {
            return "redirect:/goods";
        }
        return "add-goods";
    }


    @RequestMapping(value = "/goods/{id}", method = RequestMethod.GET)
    public String findGoodsBuId(Model model, @PathVariable Integer id) {
        Goods goods = null;

        if (id > 0) {
            try {
                goods = goodsService.findById(Long.valueOf(id));
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        }
        model.addAttribute("goods", goods);
        return "goods";
    }

    @RequestMapping(value = "/goods/delete/{id}", method = RequestMethod.GET)
    public String deleteGoodsByID(@PathVariable Integer id) {
        try {
            goodsService.deleteById(Long.valueOf(id));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return "redirect:/goods";
    }
}

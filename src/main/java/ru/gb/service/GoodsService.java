package ru.gb.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.gb.dao.GoodsDao;
import ru.gb.entity.Goods;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class GoodsService {
    private final GoodsDao goodsDao;

    public Goods save(Goods goods) {
        return goodsDao.save(goods);
    }

    @Transactional(readOnly = true)
    public Goods findById(Long id) {
        return goodsDao.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Transactional(readOnly = true)
    public List<Goods> findAllGoods() {
        return goodsDao.findAll();
    }

    public void deleteById(Long id) {
        Optional<Goods> goods = goodsDao.findById(id);
        goods.ifPresent(g -> goodsDao.deleteById(id));
    }
}

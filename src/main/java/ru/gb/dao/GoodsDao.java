package ru.gb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.entity.Goods;

import java.util.List;

public interface GoodsDao extends JpaRepository<Goods, Long> {

}

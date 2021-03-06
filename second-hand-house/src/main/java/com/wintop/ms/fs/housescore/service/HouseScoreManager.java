package com.wintop.ms.fs.housescore.service;

import com.wintop.ms.common.base.BsManager;
import com.wintop.ms.fs.housescore.entity.HouseScore;
import com.wintop.ms.fs.housescore.mapper.HouseScoreDAO;
import org.springframework.stereotype.Service;

@Service("houseScoreManager")
public class HouseScoreManager extends BsManager<HouseScoreDAO, HouseScore> {

}
package cn.bugstack.domain.strategy.service;

import cn.bugstack.domain.strategy.model.valobj.StrategyAwardStockKeyVO;

/**
 * @author 24565
 * @date 2025/2/28 13:43
 * @description 抽奖库存相关服务
 */
public interface IRaffleStock {
    // 获取奖品库存小号队列
    StrategyAwardStockKeyVO takeQueueValue() throws  InterruptedException;
    // 更新奖品库存小号记录
    void updateStrategyAwardStock(Long strategyId, Integer awardId);
}

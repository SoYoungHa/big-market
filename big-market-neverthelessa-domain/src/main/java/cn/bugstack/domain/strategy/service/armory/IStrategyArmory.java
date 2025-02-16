package cn.bugstack.domain.strategy.service.armory;
//策略装配库
public interface IStrategyArmory {
    boolean assembleLotteryStrategy(Long strategyId);

    Integer getRandomAwardId(Long strategyId);
}

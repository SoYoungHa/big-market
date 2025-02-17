package cn.bugstack.domain.strategy.service.armory;

/**
 * @author 24565
 * @date 2025/2/17 22:22
 * @description 策略抽奖调度
 */
public interface IStrategyDispatch {

    Integer getRandomAwardId(Long strategyId);

    Integer getRandomAwardId(Long strategyId, String ruleWeightValue);
}

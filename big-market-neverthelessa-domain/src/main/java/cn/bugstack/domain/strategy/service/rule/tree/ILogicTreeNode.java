package cn.bugstack.domain.strategy.service.rule.tree;
import cn.bugstack.domain.strategy.service.rule.tree.factory.DefaultTreeFactory;
/**
 * @author 24565
 * @date 2025/2/19 23:21
 * @description ILogicTreeNode
 */
public interface ILogicTreeNode {
    DefaultTreeFactory.TreeActionEntity logic(String userId, Long strategyId, Integer awardId);

}

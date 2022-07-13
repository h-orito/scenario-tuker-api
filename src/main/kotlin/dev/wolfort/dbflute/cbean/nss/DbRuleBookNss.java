package dev.wolfort.dbflute.cbean.nss;

import dev.wolfort.dbflute.cbean.cq.DbRuleBookCQ;

/**
 * The nest select set-upper of rule_book.
 * @author DBFlute(AutoGenerator)
 */
public class DbRuleBookNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DbRuleBookCQ _query;
    public DbRuleBookNss(DbRuleBookCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * GAME_SYSTEM by my game_system_id, named 'gameSystem'.
     */
    public void withGameSystem() {
        _query.xdoNss(() -> _query.queryGameSystem());
    }
}

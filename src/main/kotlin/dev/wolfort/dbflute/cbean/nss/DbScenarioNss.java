package dev.wolfort.dbflute.cbean.nss;

import dev.wolfort.dbflute.cbean.cq.DbScenarioCQ;

/**
 * The nest select set-upper of scenario.
 * @author DBFlute(AutoGenerator)
 */
public class DbScenarioNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DbScenarioCQ _query;
    public DbScenarioNss(DbScenarioCQ query) { _query = query; }
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

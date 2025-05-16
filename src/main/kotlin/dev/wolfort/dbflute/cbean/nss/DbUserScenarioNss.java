package dev.wolfort.dbflute.cbean.nss;

import dev.wolfort.dbflute.cbean.cq.DbUserScenarioCQ;

/**
 * The nest select set-upper of user_scenario.
 * @author DBFlute(AutoGenerator)
 */
public class DbUserScenarioNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DbUserScenarioCQ _query;
    public DbUserScenarioNss(DbUserScenarioCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * SCENARIO by my scenario_id, named 'scenario'.
     */
    public void withScenario() {
        _query.xdoNss(() -> _query.queryScenario());
    }
    /**
     * With nested relation columns to select clause. <br>
     * USER by my user_id, named 'user'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public DbUserNss withUser() {
        _query.xdoNss(() -> _query.queryUser());
        return new DbUserNss(_query.queryUser());
    }
}

package dev.wolfort.dbflute.cbean.nss;

import dev.wolfort.dbflute.cbean.cq.DbParticipateCQ;

/**
 * The nest select set-upper of participate.
 * @author DBFlute(AutoGenerator)
 */
public class DbParticipateNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DbParticipateCQ _query;
    public DbParticipateNss(DbParticipateCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * SCENARIO by my scenario_id, named 'scenario'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public DbScenarioNss withScenario() {
        _query.xdoNss(() -> _query.queryScenario());
        return new DbScenarioNss(_query.queryScenario());
    }
    /**
     * With nested relation columns to select clause. <br>
     * USER by my user_id, named 'user'.
     */
    public void withUser() {
        _query.xdoNss(() -> _query.queryUser());
    }
}

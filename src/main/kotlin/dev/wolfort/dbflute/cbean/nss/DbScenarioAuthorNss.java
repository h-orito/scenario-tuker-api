package dev.wolfort.dbflute.cbean.nss;

import dev.wolfort.dbflute.cbean.cq.DbScenarioAuthorCQ;

/**
 * The nest select set-upper of scenario_author.
 * @author DBFlute(AutoGenerator)
 */
public class DbScenarioAuthorNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DbScenarioAuthorCQ _query;
    public DbScenarioAuthorNss(DbScenarioAuthorCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * AUTHOR by my author_id, named 'author'.
     */
    public void withAuthor() {
        _query.xdoNss(() -> _query.queryAuthor());
    }
    /**
     * With nested relation columns to select clause. <br>
     * SCENARIO by my scenario_id, named 'scenario'.
     */
    public void withScenario() {
        _query.xdoNss(() -> _query.queryScenario());
    }
}

package dev.wolfort.dbflute.cbean.nss;

import dev.wolfort.dbflute.cbean.cq.DbTwitterUserCQ;

/**
 * The nest select set-upper of twitter_user.
 * @author DBFlute(AutoGenerator)
 */
public class DbTwitterUserNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DbTwitterUserCQ _query;
    public DbTwitterUserNss(DbTwitterUserCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
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
